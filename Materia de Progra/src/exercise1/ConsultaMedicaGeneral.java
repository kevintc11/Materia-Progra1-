package exercise1;

public class ConsultaMedicaGeneral extends ConsultaMedica{

    private final static int COBRO_CUARTO_HORA = 25000;
    private final static int TIEMPO_CITA_DOCTOR_GENERAL = 15;

    public ConsultaMedicaGeneral() {
    }

    public ConsultaMedicaGeneral(int costoBase, int costoAdicional, int tiempoConsulta) {
        super(costoBase, costoAdicional, tiempoConsulta);
    }

    public double calcularCobroMedico() {
        return Math.ceil(super.getTiempoConsulta() / TIEMPO_CITA_DOCTOR_GENERAL) * COBRO_CUARTO_HORA;
    }

    public double calcularCobroServicio() {
        return super.getCostoBase() + calcularCobroMedico();
    }

    @Override
    public String toString() {
        return super.toString() + "ConsultaMedicaGeneral";
    }
}
