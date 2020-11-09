package com.curso.market.persistence;

import com.curso.market.persistence.crud.ProductoCrudRepository;
import com.curso.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }
}
