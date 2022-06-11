package tarea11;

public class Celular {

    private String color;

    private String tamaño;

    private Chip[] chip;

    private Wifi[] wifi;

    private int contador1;

    private int contador2;

    public Celular(int size,String color, String tamaño)
    {
        this.color = color;
        this.tamaño = tamaño;

        this.chip = new Chip[size];
        this.contador1 = 0;

        this.wifi = new Wifi[size];
        this.contador2 = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public void agregar1(String marca, int numero)
    {
        this.chip[this.contador1] = new Chip(marca, numero);
        this.contador1 ++;
    }

    public void agregar2(String nombre, String calidad)
    {
        this.wifi[this.contador2] = new Wifi(nombre, calidad);
        this.contador2 ++;
    }

    public void listar1()
    {
        for (Chip i: this.chip) {
            System.out.println("MARCA: "+i.getMarca());
            System.out.println("NUMERO: "+i.getNumero());
        }
    }

    public void listar2()
    {
        for (Wifi j: this.wifi) {
            System.out.println("NOMBRE: "+j.getNombre());
            System.out.println("CALIDAD: "+j.getCalidad());
        }
    }
}
