package exercise1;

public class InyectableEspecialista extends ServiciosMédicos implements CostosMedicos{

    private final static double PORCENTAJE_ESPECIALISTA = 0.25;
    private int precioBase;
    private int costoMedicamento;

    public InyectableEspecialista() {
        this(0,0);
    }
    
    
    public InyectableEspecialista(int precioBase, int costoMedicamento) {
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

    public double calcularCobroMedico() {
        return costoMedicamento * PORCENTAJE_ESPECIALISTA;
    }

    public double calcularCobroServicio() {
        return precioBase + costoMedicamento + calcularCobroMedico();
    }

    @Override
    public String toString() {
        return "Especialista: precioBase = " + precioBase + ", costoMedicamento = " + costoMedicamento;
    }

}
