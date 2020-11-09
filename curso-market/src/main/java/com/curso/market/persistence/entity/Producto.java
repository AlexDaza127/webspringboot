package com.curso.market.persistence.entity;

import javax.persistence.*;

@Entity //identifica que esta clase es un mapeo de la tabla que esta en la base de datos
@Table(name = "productos") // hace referencia a la tabla en la base de datos
public class Producto {

    @Id // identifica que esta variable es primaria sencilla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // para generar una nueva clave automatica al producto que se inserte
    @Column(name = "id_producto") //nombra la columna a la que se refiere la variable
    private Integer idProducto;

    private String nombre;

    @Column(name = "id_categoria")
    private Integer idCategoria;

    @Column(name = "codigo_barras")
    private String codigoBarras;

    @Column(name = "precio_venta")
    private Double precioVenta;

    @Column(name = "cantidad_stock")
    private Integer cantidadStock;

    private Boolean estado;

    //Se crea una anotacion para crear la relacion de las tablas

    @ManyToOne //Se crea la anotación de muchos a uno que tiene esta tabla con categoria
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false) // se crea la union del atributo que crea la relación, en este caso es la llave primaria, también se llaman las propiedades que no permiten inserta y actualizar
    private Categoria categoria;

    //Se crean los getter y setter de los variables


    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
