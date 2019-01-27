package com.bryanalexandercd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bryanalexandercd.dto.BienvenidaResponse;
import com.bryanalexandercd.model.Usuario;
import com.bryanalexandercd.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public BienvenidaResponse mostrarMensaje() {

		List<Usuario> usuario = usuarioRepository.findAll();

		BienvenidaResponse bienvenidaResponse = new BienvenidaResponse();

		bienvenidaResponse.setUsuario(usuario.get(0).getUser() + "");
		bienvenidaResponse.setSaludo("hola como estas !!");

		return bienvenidaResponse;
	}

}
