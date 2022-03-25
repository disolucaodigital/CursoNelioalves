package br.com.disolucaodigital.cursonelioalves;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.disolucaodigital.cursonelioalves.domain.Categoria;
import br.com.disolucaodigital.cursonelioalves.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoNelioAlvesApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoNelioAlvesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria( null, "Informática");
		Categoria cat2 = new Categoria( null, "Escritório");
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
	}

}
