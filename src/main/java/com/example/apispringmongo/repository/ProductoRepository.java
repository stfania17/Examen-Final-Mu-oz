package com.example.apispringmongo.repository;

import com.example.apispringmongo.model.Producto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductoRepository extends MongoRepository<Producto, Long> {
}
