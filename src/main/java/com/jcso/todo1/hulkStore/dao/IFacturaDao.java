package com.jcso.todo1.hulkStore.dao;

import com.jcso.todo1.hulkStore.entity.Factura;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaDao extends CrudRepository<Factura, Long> {
}
