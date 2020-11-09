package com.curso.market.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras_productos")

public class CamprasProducto {
    @EmbeddedId //Esta notación se crea cuando la llave primaria es compuesta y esta embebida en una clase
    private ComprasProductosPK id;

    private Integer cantidad;
    private Double total;
    private Boolean estado;

    //Se crea la relacion de la tabla, recordar que esta viene de una tabla con llaves primarias compuestas
    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;

    //Se crean los métodos getter y setter
    public ComprasProductosPK getId() {
        return id;
    }

    public void setId(ComprasProductosPK id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
