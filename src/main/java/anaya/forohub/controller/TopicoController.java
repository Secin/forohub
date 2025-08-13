package anaya.forohub.controller;

import anaya.forohub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoRepository topicoRepository;

    @Transactional
    @PostMapping
    public ResponseEntity registrar(@RequestBody @Valid DatosRegistroTopico datos, UriComponentsBuilder uriComponentsBuilder){
        var topico = new Topico(datos);
        topicoRepository.save(topico);

        var uri= uriComponentsBuilder.path("/tipicos/{id}").buildAndExpand(topico.getId()).toUri();

        return ResponseEntity.created(uri).body(new DatosDetalleTopico(topico));
    }
/*
    @GetMapping
    public Page<DatosListaTopico> listar(@PageableDefault(size=10, sort={"curso"}) Pageable paginacion){
        return topicoRepository.findAll(paginacion).map(DatosListaTopico::new);
    }*/

    @GetMapping
    public ResponseEntity <Page<DatosListaTopico>> listaranio(
            @RequestParam(required = false) Integer anio,
            @RequestParam(required = false) Curso curso,
            @PageableDefault(size=10, sort ={"fecha"},direction = Sort.Direction.ASC) Pageable paginacion){


        if (anio != null) {
            var page = topicoRepository.findByAnio(anio, paginacion)
                    .map(DatosListaTopico::new);
            return ResponseEntity.ok(page);
        }
        if(curso !=null){
            var page = topicoRepository.findbyCurso(curso, paginacion)
                    .map(DatosListaTopico::new);
            return ResponseEntity.ok(page);
        }
 //http://localhost:8080/topicos?anio=2024
        var page =topicoRepository.findAll(paginacion).map(DatosListaTopico::new);

        return  ResponseEntity.ok(page);
    }


    @Transactional
    @PutMapping
    public ResponseEntity actualizar(@RequestBody @Valid DatosActualizacionTopico datos){
        var topico = topicoRepository.getReferenceById(datos.id());
        topico.actualizarDatosTopico(datos);
        return ResponseEntity.ok(new DatosDetalleTopico(topico));
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity elminar(@PathVariable Long id){
        topicoRepository.deleteById(id);

        return  ResponseEntity.noContent().build();
    }


    @GetMapping("/{id}")
    public ResponseEntity detallar(@PathVariable Long id){
        var topico = topicoRepository.getReferenceById(id);

        return  ResponseEntity.ok(new DatosDetalleTopico(topico));
    }

}
