package exercise1;

public class RadiografiaDentalEspecifica extends ServiciosMédicos{

    private final int PRECIO_RADIOGRAFIA_ESPECIFICA = 8000;
    private int precioBase;

    public RadiografiaDentalEspecifica() {
        this(0);
    }

    
    public RadiografiaDentalEspecifica(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }


    public double calcularCobroServicio() {
        return precioBase + PRECIO_RADIOGRAFIA_ESPECIFICA;
    }

    @Override
    public String toString() {
        return "RadiografiaEspecifica: precioBase = " + precioBase;
    }

}
