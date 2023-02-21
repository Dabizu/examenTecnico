package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.UsuarioService;
import com.example.demo.models.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;

	// agregamos un usuario
	@PutMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return this.usuarioService.guardarUsuario(usuario);
	}

	// buscamos un usuario desde id
	@GetMapping("/{id}")
	public Optional<UsuarioModel> dameUsuario(@PathVariable("id") int id) {
		return this.usuarioService.obtenerId(id);
	}

	// obtener toda la lista de todos los usuarios
	@GetMapping()
	public ArrayList<UsuarioModel> listarUsuario() {
		return this.usuarioService.listarUsuarios();
	}

	// actualizacion de usuario desde id
	@PostMapping("/actualizar/{id}")
	public UsuarioModel actualizarUsuario(@PathVariable("id") int id, @RequestBody UsuarioModel usuario) {
		return this.usuarioService.actualizar(id, usuario);
		// esto tambien funciona si se cambia el metodo actualizar al recibir los
		// parametros
		/*
		 * Optional<UsuarioModel> registro = usuarioService.obtenerId(id);
		 * if(registro.get().getId()==usuario.getId()) { return
		 * this.usuarioService.actualizar(usuario); } return usuario;
		 */
	}
	//eliminamos un usuario
	@DeleteMapping("/eliminar/{id}")
	public String eliminacionUsuario(@PathVariable("id") int id) {
		boolean bandera = this.usuarioService.eliminacion(id);
		JSONObject json;
		if (bandera == true) {
			json=new JSONObject("{\"type\":\"sucess\"}");
			return json.toString();
		} else {
			json=new JSONObject("{\"type\":\"error\"}");
			return json.toString();
		}
	}

	//busca algun registro
	@GetMapping("/buscar/{typeVariable}/{data}")
	public Optional<UsuarioModel> dameUsuarioTipoDato(@PathVariable("typeVariable") String typeVariable, @PathVariable("data") String data) {
		return this.usuarioService.menuDatos(typeVariable, data);
	}
}
