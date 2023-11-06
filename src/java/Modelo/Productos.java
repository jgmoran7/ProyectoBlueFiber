/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Gabriel
 */
public class Productos {
    private int Codigo; 
    private byte Imagenes;
    private String Marca;
    private String Modelo;
    private String Descripcion;
    private Float Subtotal;
    private Float IVA;
    private Float PrecioTotal;

    /**
     * @return the Codigo
     */
    public int getCodigo() {
        return Codigo;
    }

    /**
     * @param Codigo the Codigo to set
     */
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    /**
     * @return the Imagenes
     */
    public byte getImagenes() {
        return Imagenes;
    }

    /**
     * @param Imagenes the Imagenes to set
     */
    public void setImagenes(byte Imagenes) {
        this.Imagenes = Imagenes;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the Descripcion
     */
    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param Descripcion the Descripcion to set
     */
    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    /**
     * @return the Subtotal
     */
    public Float getSubtotal() {
        return Subtotal;
    }

    /**
     * @param Subtotal the Subtotal to set
     */
    public void setSubtotal(Float Subtotal) {
        this.Subtotal = Subtotal;
    }

    /**
     * @return the IVA
     */
    public Float getIVA() {
        return IVA;
    }

    /**
     * @param IVA the IVA to set
     */
    public void setIVA(Float IVA) {
        this.IVA = IVA;
    }

    /**
     * @return the PrecioTotal
     */
    public Float getPrecioTotal() {
        return PrecioTotal;
    }

    /**
     * @param PrecioTotal the PrecioTotal to set
     */
    public void setPrecioTotal(Float PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
}
