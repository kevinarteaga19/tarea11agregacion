package tarea11;

public class Main {

    public static void main(String[] args) {
        Celular celular = new Celular(2,"Blanco","Grande");

        celular.agregar1("Claro",934088577);
        celular.agregar1("Movistar",934872681);
        celular.agregar2("Casa","buena");
        celular.agregar2("Hotel","mala");

        System.out.println("------CELULAR------");
        System.out.println("COLOR: "+ celular.getColor());
        System.out.println("TAMAÑO: "+celular.getTamaño());

        System.out.println("------CHIP------");
        //celular.listar1();

        System.out.println("------WIFI------");
        //celular.listar2();
    }
}
