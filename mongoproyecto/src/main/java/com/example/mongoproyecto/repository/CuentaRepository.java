package com.example.mongoproyecto.repository;

import java.util.ArrayList;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongoproyecto.models.CuentaModel;
@Repository
public interface CuentaRepository extends MongoRepository<CuentaModel,Integer> {

	ArrayList<CuentaModel> findByIdusuario(int idusuario);

	void deleteByIdusuario(int idusuario);

	ArrayList<CuentaModel> findById(int id);
	
}
