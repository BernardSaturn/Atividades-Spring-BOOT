package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController //anotação que diz para o spring que ela é a acontroladora de roatas e acessos aos metodos
@RequestMapping("/postagens") // rota para chegar na classe "insomnia"
@CrossOrigin(origins = "*", allowedHeaders = "*") // liberar o acesso a outras maquinas
public class PostagemController {
	
	@Autowired // instanciar a classe Postagemrepository
	private PostagemRepository postagemRepository;
	
	@GetMapping // define o verbo http que atende esse metodo
	public ResponseEntity<List<Postagem>> getAll(){
		// ResponseEntity - Classe
		return ResponseEntity.ok(postagemRepository.findAll());
	}
}
