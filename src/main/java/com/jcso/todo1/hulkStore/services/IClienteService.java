package com.jcso.todo1.hulkStore.services;

import com.jcso.todo1.hulkStore.entity.Cliente;
import com.jcso.todo1.hulkStore.entity.Factura;
import com.jcso.todo1.hulkStore.entity.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {

     List<Cliente> findAll();

     Page<Cliente> findAll(Pageable pageable);

     Cliente findById(Long id);

     Cliente save(Cliente cliente);

     void delete(Long id);

     Factura findFacturaById(Long id);

     Factura saveFactura(Factura factura);

     void deleteFacturaById(Long id);

     List<Producto> findProductoByName(String termino);
}
