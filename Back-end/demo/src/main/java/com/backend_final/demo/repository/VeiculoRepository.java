package com.backend_final.demo.repository;

import com.backend_final.demo.models.ModelVeiculo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends MongoRepository<ModelVeiculo,String> {
}
