package com.example.demo.UsuarioRepository;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {

	Optional<UsuarioModel> findByNombre(String nombre);

	Optional<UsuarioModel> findByApellidomaterno(String apellidomaterno);

	Optional<UsuarioModel> findByApellidopaterno(String apellidopaterno);

	Optional<UsuarioModel> findByCorreo(String correo);

	Optional<UsuarioModel> findByTelefono(String telefono);

	Optional<UsuarioModel> findByEdad(int edad);

	Optional<UsuarioModel> findBySexo(char sexo);
	
}
