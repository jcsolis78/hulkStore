package com.jcso.todo1.hulkStore.dao;

import com.jcso.todo1.hulkStore.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoDao extends CrudRepository<Producto, Long> {
    public List<Producto> findByNombreStartingWithIgnoreCase(String termino);
}
