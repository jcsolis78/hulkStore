
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Jhon','Solis','jcsolis@dcatech.com','1978-07-14');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Kathe','Vega','kathe.vega2776@gmail.com','1977-10-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Diana','Herran','diangels08@hotmail.com','1979-04-08');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Mariana','Solis','mariana@gmail.com','2013-05-08');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Andrea','Solis','andruk@gmail.com','2007-04-12');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Jose','Solis','jose.solis@gmail.com','2019-08-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('William','Solis','willy.solis@gmail.com','2019-08-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Monica','Solis','moni.solis@gmail.com','2019-08-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Vivian','Poloche','vivian@gmail.com','2019-08-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Estefania','Solis','estefy@gmail.com','2019-08-09');
INSERT INTO clientes (nombre,apellido,email,create_at) VALUES('Alci','Benavides','benavides@gmail.com','2019-08-09');

INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Camiseta DC Comic',35000,NOW(),5);
INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Camiseta Marvel',36000,NOW(),3);
INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Super Man',28000,NOW(),8);
INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Avangers',75000,NOW(),2);
INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Mug DC Comic',65000,NOW(),1);
INSERT INTO productos (nombre,precio,create_at, cantidad) VALUES('Mug Marvel',65000,NOW(),2);

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES('Compra productos hulkStore',null,1,NOW());
INSERT INTO facturas_items(cantidad,factura_id,producto_id) 	VALUES(1,1,1);
INSERT INTO facturas_items(cantidad,factura_id,producto_id) 	VALUES(2,1,3);
INSERT INTO facturas_items(cantidad,factura_id,producto_id) 	VALUES(3,1,4);
INSERT INTO facturas_items(cantidad,factura_id,producto_id) 	VALUES(1,1,5);

INSERT INTO facturas(descripcion, observacion, cliente_id, create_at) VALUES('Factura mug','Kathy compro',2,NOW());
INSERT INTO facturas_items(cantidad,factura_id,producto_id) 	VALUES(1,2,5);