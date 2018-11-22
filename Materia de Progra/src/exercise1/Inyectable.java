package exercise1;

public class Inyectable extends ServiciosMédicos{

    private int precioBase;
    private int costoMedicamento;

    public Inyectable() {
    this(0,0);
    }
    
    

    public Inyectable(int precioBase, int costoMedicamento) {
        this.precioBase = precioBase;
        this.costoMedicamento = costoMedicamento;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getCostoMedicamento() {
        return costoMedicamento;
    }

    public void setCostoMedicamento(int costoMedicamento) {
        this.costoMedicamento = costoMedicamento;
    }

    public double calcularCobroServicio() {
        return precioBase + costoMedicamento;
    }

    @Override
    public String toString() {
        return "Inyectable: precioBase = " + precioBase + ", costoMedicamento = " + costoMedicamento;
    }

}
