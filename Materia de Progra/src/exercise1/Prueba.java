package exercise1;




public class Prueba {

    public static void main(String[] args) {
        Factura factura = new Factura();
        ServiciosMédicos servicio1 = new ConsultaMedicaEspecialista(40000, 20000, 50);
        ServiciosMédicos servicio2 = new ConsultaMedicaGeneral(25000, 10000, 15);
        ServiciosMédicos servicio3 = new Inyectable(5000, 8200);
        ServiciosMédicos servicio4 = new InyectableEspecialista(8000, 5200);
        ServiciosMédicos servicio5 = new RadiografiaDentalEspecifica(15000);
        ServiciosMédicos servicio6 = new RadiografiaDentalPanoramica(10000, 2);
        factura.agregar(servicio1);
        factura.agregar(servicio2);
        factura.agregar(servicio3);
        factura.agregar(servicio4);
        factura.agregar(servicio5);
        factura.agregar(servicio6);
        System.out.println(factura.imprimirFactura());
        
    }

}
