package exercise1;

public class Factura {
    ServiciosMédicos[] factura = new ServiciosMédicos[30];

    public Factura() {
        
    }

    public ServiciosMédicos[] getFactura() {
        return factura;
    }

    public void setFactura(ServiciosMédicos[] factura) {
        this.factura = factura;
    }
    
    
    public void agregar(ServiciosMédicos servicio){
        int posiciones = 0;
            if (factura[posiciones] == null) {

            }else{
                posiciones += 1;
                factura[posiciones] = servicio;
            }
    }
    
    public String imprimirFactura(){
        for (ServiciosMédicos factura1 : factura) {
            if (factura1 instanceof ConsultaMedicaEspecialista) {
                double cobroMedico;
                double cobroServicio;
                double total;
                ConsultaMedica consulta = new ConsultaMedicaEspecialista();
                cobroMedico = consulta.calcularCobroMedico();
                cobroServicio = consulta.calcularCobroServicio();
                total = cobroMedico + cobroServicio;
                return "Consulta con medico especialista, el cobro médico es: " + cobroMedico + " y el cobro por el servicio es: " + cobroServicio + " el total a pagar es: " + total;
            }
            if (factura1 instanceof ConsultaMedicaGeneral) {
                double cobroMedico;
                double cobroServicio;
                double total;
                ConsultaMedicaGeneral consulta = new ConsultaMedicaGeneral();
                cobroMedico = consulta.calcularCobroMedico();
                cobroServicio = consulta.calcularCobroServicio();
                total = cobroMedico + cobroServicio;
                return "Consulta con medico general, el cobro médico es: " + cobroMedico + " y el cobro por el servicio es: " + cobroServicio + " el total a pagar es: " + total;
            }
            if (factura1 instanceof Inyectable) {
                double costoServicio;
                double total;
                double medicamento;
                Inyectable inyeccion = new Inyectable();
                costoServicio = inyeccion.calcularCobroServicio();
                medicamento = inyeccion.getCostoMedicamento();
                total = costoServicio + medicamento;
                return "Servicio de inyectable, el costo de la inyeccion es: " + medicamento+ " el costo del servicio es: " + costoServicio + " el costo total es de: " + total;
            }
            if (factura1 instanceof InyectableEspecialista) {
                double costoServicio;
                double total;
                double medicamento;
                double cobroDoctor;
                InyectableEspecialista inyectable = new InyectableEspecialista();
                costoServicio = inyectable.calcularCobroServicio();
                cobroDoctor = inyectable.calcularCobroMedico();
                medicamento = inyectable.getCostoMedicamento();
                total = cobroDoctor +costoServicio + medicamento;
                return "Servicio de inyectable con especialista, el costo de la inyeccion es: " + medicamento+ " el costo del servicio es: " + costoServicio + "el costo del doctor es de: " + cobroDoctor+" el costo total es de: " + total;
            }
            if (factura1 instanceof RadiografiaDentalEspecifica) {
                double total;
                RadiografiaDentalEspecifica radiografia = new RadiografiaDentalEspecifica();
                total = radiografia.calcularCobroServicio();
                return "Servicio de radiografia especifica, el total a pagar es de: " + total;
            }
            if (factura1 instanceof RadiografiaDentalPanoramica) {
                double total;
                RadiografiaDentalPanoramica radiografia = new RadiografiaDentalPanoramica();
                total = radiografia.calcularCobroServicio();
                return "Servicio de radiografia panoramica, el total a pagar es de: " + total;
            }
        }
        return null;
    }   
}
 

