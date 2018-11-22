package exercise1;

public class RadiografiaDentalPanoramica extends ServiciosMédicos{

    private static final int TIPO_RADIOGRAFIA_SUPERIOR = 1;
    private static final int TIPO_RADIOGRAFIA_INFERIOR = 2;
    private static final int COSTO_RADIOGRAFIA_SUPERIOR = 20000;
    private static final int COSTO_RADIOGRAFIA_INFERIOR = 22000;
    private static final int COSTO_RADIOGRAFIA_GLOBAL = 30000;
    private int tipoRadiografia;
    private int precioBase;

    public RadiografiaDentalPanoramica() {
    }

    
    public RadiografiaDentalPanoramica(int precioBase, int tipoRadiografia) {
        this.precioBase = precioBase;
        this.tipoRadiografia = tipoRadiografia;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public int getTipoRadiografia() {
        return tipoRadiografia;
    }

    public void setTipoRadiografia(int tipoRadiografia) {
        this.tipoRadiografia = tipoRadiografia;
    }

    public double calcularCobroServicio() {
        if (tipoRadiografia == TIPO_RADIOGRAFIA_INFERIOR) {
            return precioBase + COSTO_RADIOGRAFIA_INFERIOR;
        }
        if (tipoRadiografia == TIPO_RADIOGRAFIA_SUPERIOR) {
            return precioBase + COSTO_RADIOGRAFIA_SUPERIOR;
        }
        return precioBase + COSTO_RADIOGRAFIA_GLOBAL;
    }

    @Override
    public String toString() {
        return "RadiografiaPanorámica: precioBase = " + precioBase + ", tipo de radiografía = " + tipoRadiografia;
    }

}
