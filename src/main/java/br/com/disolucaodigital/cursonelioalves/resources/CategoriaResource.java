package br.com.disolucaodigital.cursonelioalves.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/categorias")
public class CategoriaResource {
	
	@GetMapping
	public String listar() {
		return "REST esta funcionando";
	}
	@GetMapping(value = "/{id}")
	public String buscaId(@PathVariable Long id) {
		return "Localizou ID " + id;
	}
}
