package com.bryanalexandercd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bryanalexandercd.dto.BienvenidaResponse;
import com.bryanalexandercd.service.UsuarioServiceImpl;

@RestController
public class usuarioController {

	@Autowired
	private UsuarioServiceImpl usuarioService;

	/***
	 * Prueba
	 * 
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value="/hola", produces = "Application/json")
	public ResponseEntity<BienvenidaResponse> holaUsuario() {

		BienvenidaResponse bienvenidaResponse = new BienvenidaResponse();
		bienvenidaResponse.setSaludo("hola que tal");
		bienvenidaResponse.setUsuario("pepito");

		return new ResponseEntity<BienvenidaResponse>(bienvenidaResponse, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.GET, value="/welcome", produces = "Application/json")
	public ResponseEntity<BienvenidaResponse> welcome() {

		BienvenidaResponse bienvenidaResponse = usuarioService.mostrarMensaje();

		return new ResponseEntity<BienvenidaResponse>(bienvenidaResponse, HttpStatus.OK);

	}

}
