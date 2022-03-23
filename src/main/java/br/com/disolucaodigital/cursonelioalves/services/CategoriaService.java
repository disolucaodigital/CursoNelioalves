package br.com.disolucaodigital.cursonelioalves.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.disolucaodigital.cursonelioalves.domain.Categoria;
import br.com.disolucaodigital.cursonelioalves.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> listar() {		
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
	
	public Categoria buscar( Integer id ) {
		Optional<Categoria> categoria = categoriaRepository.findById( id );
		return categoria.orElse(null);
	}
}
