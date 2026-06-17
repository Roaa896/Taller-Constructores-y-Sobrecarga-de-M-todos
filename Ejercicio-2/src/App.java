public class App {

    public static void main(String[] args) throws Exception {

        Vuelo vuelo1 = new Vuelo();

        Vuelo vuelo2 = new Vuelo();
        vuelo2.setNumero("MJ909");
        vuelo2.setOrigen("Bogota");
        vuelo2.setDestino("Suiza");

        Vuelo vuelo3 = new Vuelo();
         vuelo3.setNumero("GR811");
        vuelo3.setOrigen("Bogota");
        vuelo3.setDestino("Finlandia");
        vuelo3.setCapacidadMaxima(150);
        vuelo3.setOcupacion(80);

        System.out.println("VUELO 1 - CONSTRUCTOR VACIO");
        vuelo1.mostrarInfo();

        System.out.println("VUELO 2 - CONSTRUCTOR DE RUTA");
        vuelo2.mostrarInfo();

        System.out.println("VUELO 3 - CONSTRUCTOR COMPLETO");
        vuelo3.mostrarInfo();

        System.out.println("EMBARCANDO PASAJEROS EN EL VUELO 3");
        vuelo3.embarcar(50);
        vuelo3.embarcar(30);

        System.out.println();

        System.out.println("DESEMBARCANDO PASAJEROS EN EL VUELO 3");
        vuelo3.desembarcar(40);
        vuelo3.desembarcar(200);

        System.out.println();

        System.out.println("ESTADO FINAL DEL VUELO 3");
        vuelo3.mostrarInfo();

    }

}