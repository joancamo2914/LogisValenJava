package com.Logis.Valen.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Logis.Valen.dto.DtoArtFactura;
import com.Logis.Valen.dto.DtoUsuario;
import com.Logis.Valen.entities.ArtFactura;
import com.Logis.Valen.entities.Usuario;
import com.Logis.Valen.repositories.RepoUsuarios;
import com.Logis.Valen.services.ArtFacturaService;
import com.Logis.Valen.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
	
	@Autowired
	private RepoUsuarios repoUsuarios;
	
	@GetMapping
	public List<Usuario> verUsuarios() {
		return (List<Usuario>) repoUsuarios.findAll();
	}
	
	@Autowired
	public UsuarioService serviceUsuario;
	
	@PostMapping
	public ResponseEntity<Usuario> crearUsuario(@RequestBody DtoUsuario UsuarioDto){
		Usuario UsuarioGuardada = serviceUsuario.crearUsuario(UsuarioDto);
		return new ResponseEntity<> (UsuarioGuardada, HttpStatus.CREATED);
	}
}
