package br.com.disolucaodigital.cursonelioalves.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.disolucaodigital.cursonelioalves.domain.Categoria;
import br.com.disolucaodigital.cursonelioalves.services.CategoriaService;

@RestController
@RequestMapping( value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public ResponseEntity<?> listAll() {
		List<Categoria> categorias = service.listar();
		return ResponseEntity.ok().body( categorias );
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria categoria = service.buscar(id);
		return ResponseEntity.ok().body(categoria);
	}
}
