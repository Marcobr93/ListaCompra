package com.company;

/**
 * Created by marco on 18/4/17.
 */
public class Articulo {
    protected String nombreArticulo;
    protected double precioArticulo;

    // Constructores

    /**
     * Constructor por defecto
     */
    public Articulo() {
    }

    /**
     * Constructor con los dos atributos
     * @param nombreArticulo
     * @param precioArticulo
     */
    public Articulo(String nombreArticulo, double precioArticulo) {
        this.nombreArticulo = nombreArticulo;
        this.precioArticulo = precioArticulo;
    }

    // Accesores

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public double getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(double precioArticulo) {
        this.precioArticulo = precioArticulo;
    }
}
