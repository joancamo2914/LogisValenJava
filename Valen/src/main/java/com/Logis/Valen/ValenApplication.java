package com.Logis.Valen;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Logis.Valen.entities.Factura;
import com.Logis.Valen.repositories.RepoFacturas;

@SpringBootApplication
public class ValenApplication implements CommandLineRunner {

	@Autowired
	private RepoFacturas repositorio;
	
	public static void main(String[] args) {
		SpringApplication.run(ValenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Factura> facturas = (List<Factura>) repositorio.findAll();
		facturas.stream().forEach(factura -> System.out.println(factura));
	}

}
