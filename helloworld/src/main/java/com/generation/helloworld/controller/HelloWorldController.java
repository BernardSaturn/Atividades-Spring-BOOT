package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola-mundo")
public class HelloWorldController {

	@GetMapping
	public String ola() {
		return "Olá mundo ! Bom dia!!";
	}

	@GetMapping("comidas")
	public String comidasFavoritas() {
		return "Lasanha";
	}

	@GetMapping("livros")
	public String livrosFavoritos() {
		return "Eragon \nSenhor dos Aneis";
	}
	
	@GetMapping("BSMs")
	public String habilidadesComportamentais() {
		return "--- HABILIDADES COMPORTAMENTAIS --- \n"
				+ ". Trabalho em Equipe \n"
				+ ". Orientação aos Detalhes \n"
				+ ". Proatividade \n"
				+ ". Comunicação";
	}
	
	@GetMapping("objetivos")
	public String objetivosSemanal() {
		return "--- OBJETIVOS DE APRENDIZAGEM SEMANAL --- \n"
				+ ". Praticar Comunicação \n"
				+ ". Praticar Inglês \n"
				+ ". Rever Conceitos dos Conteúdos da Generation \n";
	}
}
