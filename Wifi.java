package tarea11;

public class Wifi {

    private String nombre;

    private String calidad;

    public Wifi(String nombre, String calidad) {
        this.nombre = nombre;
        this.calidad = calidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }
}
