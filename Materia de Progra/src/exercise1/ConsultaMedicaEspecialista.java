package exercise1;

public class ConsultaMedicaEspecialista extends ConsultaMedica{

    private final static int COBRO_MEDIA_HORA = 40000;
    private final static int COBRO_HORA = 50000;
    private final static int HORA_MINIMA = 1;
    private final static int TIEMPO_CITA_DOCTOR_ESPECIALISTA = 30;

    public ConsultaMedicaEspecialista() {
        this(0,0,0);
    }

    public ConsultaMedicaEspecialista(int costoBase, int costoAdicional, int tiempoConsulta) {
        super(costoBase, costoAdicional, tiempoConsulta);
    }
    
    @Override
    public double calcularCobroMedico() {
        double tiempo = Math.ceil(super.getTiempoConsulta() / TIEMPO_CITA_DOCTOR_ESPECIALISTA);
        return (tiempo == HORA_MINIMA) ? COBRO_MEDIA_HORA : tiempo * COBRO_HORA;
    }

    @Override
    public double calcularCobroServicio() {
        return super.getCostoBase() + calcularCobroMedico();
    }

    @Override
    public String toString() {
        return super.toString() + "ConsultaMedicaEspecialista";
    }


}
