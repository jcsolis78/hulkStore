package com.jcso.todo1.hulkStore.ServiceTest;


import com.jcso.todo1.hulkStore.dao.IClienteDao;
import com.jcso.todo1.hulkStore.dao.IProductoDao;
import com.jcso.todo1.hulkStore.entity.Cliente;
import com.jcso.todo1.hulkStore.entity.Producto;
import com.jcso.todo1.hulkStore.services.impl.ClienteService;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ClienteServiceTest {

    @Mock
    private IProductoDao productoDao;

    @Mock
    private IClienteDao clienteDao;

    @InjectMocks
    private ClienteService clienteService;

    Producto producto = new Producto();
    Producto producto1 = new Producto();
    List<Producto> productoList = new ArrayList<>();

    Cliente cliente = new Cliente();

    @Before
    public void setData(){

        MockitoAnnotations.initMocks(this);

        producto.setId((long) 1);
        producto.setCantidad((long) 3);
        producto.setNombre("Camisetas");
        producto.setPrecio((double) 12000);
        productoList.add(producto);

        producto1.setId((long) 2);
        producto1.setCantidad((long) 2);
        producto1.setNombre("Mugs");
        producto1.setPrecio((double) 63000);

        productoList.add(producto1);


        cliente.setId(8L);
        cliente.setApellido("Vega");
        cliente.setNombre("Karina");
        cliente.setEmail("karina@vega.com");

    }


    @Test
    public void findByProductName(){
        when(productoDao.findByNombreStartingWithIgnoreCase("Camisetas")).thenReturn(productoList);
        Assertions.assertThat("Camisetas").isEqualTo(clienteService.findProductoByName("Camisetas").get(0).getNombre());
    }


    @Test
    public void findClienteById(){
        when(clienteDao.findById(8L)).thenReturn(java.util.Optional.ofNullable(cliente));
        Assertions.assertThat("Karina").isEqualTo(clienteService.findById(8L).getNombre());
    }
}
