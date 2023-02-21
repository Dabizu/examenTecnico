package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.UsuarioRepository.UsuarioRepository;
import com.example.demo.models.UsuarioModel;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;

	public UsuarioRepository getUsuarioRepo() {
		return this.usuarioRepository;
	}

	public ArrayList<UsuarioModel> listarUsuarios() {
		return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
	}

	public boolean guardarUsuario(UsuarioModel usuario) {
		try {
			usuarioRepository.save(usuario);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public Optional<UsuarioModel> dameId(long id) {
		return usuarioRepository.findById(id);
	}

	public UsuarioModel actualizar(int id, UsuarioModel usuario) {
		usuario.setId(id);
		return usuarioRepository.save(usuario);
	}

	public boolean eliminacion(long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Optional<UsuarioModel> menuDatos(String typeVariable, String data) {
		// TODO Auto-generated method stub
		switch (typeVariable) {
			case "id": {
				long id = Integer.parseInt(data);
				return usuarioRepository.findById(id);
			}
			case "nombre": {
				return usuarioRepository.findByNombre(data);
			}
			case "apellidoMaterno": {
				return usuarioRepository.findByApellidomaterno(data);
			}
			case "apellidoPaterno": {
				return usuarioRepository.findByApellidopaterno(data);
			}
			case "correo": {
				return usuarioRepository.findByCorreo(data);
			}
			case "telefono": {
				return usuarioRepository.findByTelefono(data);
			}
			case "edad": {
				int edad=Integer.parseInt(data);
				return usuarioRepository.findByEdad(edad);
			}
			case "sexo": {
				char caracter=data.charAt(0);
				return usuarioRepository.findBySexo(caracter);
			}
		}
		return null;
	}
}
