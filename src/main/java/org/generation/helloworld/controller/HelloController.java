package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indica para o spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicação
@RequestMapping("/hello-world")
public class HelloController {
		
	@GetMapping
	public String exibiHelloWorld() {
		return "Hello World!";
	}
	
	@GetMapping("/listaBSMs")
	public String bsm() {
		return "  Lista de BSMs\r\n"
				+ "- Persistência\r\n"
				+ "- Mentalidade de Crescimento\r\n"
				+ "- Orientação ao Futuro\r\n"
				+ "- Responsabilidade Pessoal\r\n"
				+ "- Trabalho em Equipe\r\n"
				+ "- Comunicação\r\n"
				+ "- Comunicação Não Violenta\r\n"
				+ "- Atenção para Detalhes\r\n"
				+ "- Proatividade";
	}
	
	@GetMapping("/aprendizado")
	public String objetivosAprendizagem() {
		return "Spring BOOT\r\n"
				+ "- Desenvolvimento: Back-end e Front-end\r\n"
				+ "- Swagger\r\n"
				+ "- SOFEA\r\n"
				+ "- Api REST\r\n"
				+ "- Arquitetura MVC \n";
	}
}
