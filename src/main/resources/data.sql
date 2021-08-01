create table producto (id_producto integer generated by default as identity, imagen_frontal varchar(255), imagen_trasera varchar(255), nombre_producto varchar(255), porcentaje_descuento integer, precio integer, precio_con_descuento integer, primary key (id_producto));

create table producto_detalle (id_producto_detalle integer generated by default as identity, descripcion varchar(255), producto_id_producto integer, primary key (id_producto_detalle));
 
create table producto_detalle_listado_imagenes (producto_detalle_id_producto_detalle integer not null, listado_imagenes varchar(255));

alter table producto_detalle add constraint FKiv4extjiy6o3spq69361ri1bt foreign key (producto_id_producto) references producto;

alter table producto_detalle_listado_imagenes add constraint FKl4916u9n0pa4pip41pfoggoxc foreign key (producto_detalle_id_producto_detalle) references producto_detalle;
 
INSERT INTO producto (imagen_frontal,imagen_trasera,nombre_producto,porcentaje_descuento,precio,precio_con_descuento)
VALUES ('ImagenFrontal:v','imagenTrasera','nombreProducto',10,100000,90000);

INSERT INTO producto (imagen_frontal,imagen_trasera,nombre_producto,porcentaje_descuento,precio,precio_con_descuento)
VALUES ('ImagenFrontal:v2','imagenTrasera2','nombreProducto2',10,100000,90000);

INSERT INTO producto_detalle (producto_id_producto,descripcion) VALUES (1,'arcu iaculis enim, sit amet ornare lectus justo eu');
INSERT INTO producto_detalle (producto_id_producto,descripcion) VALUES (2,'arcu iaculis enim, sit amet ornare lectus justo eu2');

INSERT INTO producto_detalle_listado_imagenes (producto_detalle_id_producto_detalle,listado_imagenes) VALUES (1,'img1'),(1,'img2'),(1,'img3'),(1,'img4');
INSERT INTO producto_detalle_listado_imagenes (producto_detalle_id_producto_detalle,listado_imagenes) VALUES (2,'img1'),(2,'img2'),(2,'img3'),(2,'img4');