package com.Logis.Valen.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Logis.Valen.dto.DtoUsuario;
import com.Logis.Valen.entities.Usuario;
import com.Logis.Valen.repositories.RepoUsuarios;

@Service
public class UsuarioService {

	@Autowired
	private RepoUsuarios UsuarioRepository;
	
	public Usuario crearUsuario(DtoUsuario UsuarioDTO) {
		
		Usuario nuevaUsuario = new Usuario();
		
		nuevaUsuario.setUsuario(UsuarioDTO.getUsuario());
		nuevaUsuario.setPassword(UsuarioDTO.getPassword());
		nuevaUsuario.setRol(UsuarioDTO.getRol());
		
		return UsuarioRepository.save(nuevaUsuario);
	}


}



