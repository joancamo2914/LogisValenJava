package com.Logis.Valen.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Logis.Valen.entities.Usuario;

public interface RepoUsuarios extends CrudRepository <Usuario, String> {

}
