public class App {

    public static void main(String[] args) throws Exception {

        Libro libro1 = new Libro();

        Libro libro2 = new Libro();
        libro2.setTitulo("La Voragine");
        libro2.setAutor("Jose Eustasio Rivera");

        Libro libro3 = new Libro();
        libro3.setTitulo("El Principito");
        libro3.setAutor("Antoine de Saint-Exupery");
        libro3.setDisponible(false);
        

        System.out.println("LIBRO 1");
        libro1.mostrarInfo();

        System.out.println("LIBRO 2");
        libro2.mostrarInfo();

        System.out.println("LIBRO 3");
        libro3.mostrarInfo();

    }

}