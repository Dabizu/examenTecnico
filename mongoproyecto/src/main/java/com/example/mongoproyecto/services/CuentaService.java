package com.example.mongoproyecto.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongoproyecto.models.CuentaModel;
import com.example.mongoproyecto.repository.CuentaRepository;

@Service
public class CuentaService {
	@Autowired
	CuentaRepository cuentaRepository;
	/*
	public ArrayList<CuentaModel> listarCuentas(){
		return (ArrayList<CuentaModel>) cuentaRepository.findAll();
	}*/
	public ArrayList<CuentaModel> buscarCuentasUsuario(int idusuario){
		return (ArrayList<CuentaModel>) cuentaRepository.findByIdusuario(idusuario);
	}
	public CuentaModel guardarCuenta(CuentaModel cuentaModel) {
		return cuentaRepository.save(cuentaModel);
	}
	public boolean eliminar(int idUsuario) {
		try {
			cuentaRepository.deleteByIdusuario(idUsuario);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public ArrayList<CuentaModel> buscarCuenta(int id){
		return (ArrayList<CuentaModel>) cuentaRepository.findById(id);
	}
}
