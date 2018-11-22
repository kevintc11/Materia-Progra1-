/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author usuario
 */
public abstract class ConsultaMedica extends ServiciosMédicos implements CostosMedicos{
    private int costoBase;
    private int costoAdicional;
    private int tiempoConsulta;

    public ConsultaMedica() {
    }

    public ConsultaMedica(int costoBase, int costoAdicional, int tiempoConsulta) {
        this.costoBase = costoBase;
        this.costoAdicional = costoAdicional;
        this.tiempoConsulta = tiempoConsulta;
    }

    public int getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(int costoBase) {
        this.costoBase = costoBase;
    }

    public int getCostoAdicional() {
        return costoAdicional;
    }

    public void setCostoAdicional(int costoAdicional) {
        this.costoAdicional = costoAdicional;
    }

    public int getTiempoConsulta() {
        return tiempoConsulta;
    }

    public void setTiempoConsulta(int tiempoConsulta) {
        this.tiempoConsulta = tiempoConsulta;
    }

    @Override
    public String toString() {
        return "ConsultaMedica{" + "costoBase=" + costoBase + ", costoAdicional=" + costoAdicional + ", tiempoConsulta=" + tiempoConsulta + '}';
    }
    
    @Override
    public abstract double calcularCobroServicio();

    @Override
    public abstract double calcularCobroMedico();
    
    
}
