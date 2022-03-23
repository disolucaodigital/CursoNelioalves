package br.com.disolucaodigital.cursonelioalves.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.disolucaodigital.cursonelioalves.domain.Categoria;

@RestController
@RequestMapping( value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public List<Categoria> listar() {
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritorio");
		
		List<Categoria> listCategorias = new ArrayList<>();
		listCategorias.add(cat1);
		listCategorias.add(cat2);
		return listCategorias;
	}
	@GetMapping(value = "/{id}")
	public String buscaId(@PathVariable Long id) {
		return "Localizou ID " + id;
	}
}
