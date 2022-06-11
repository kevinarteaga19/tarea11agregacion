package tarea11;

public class Chip {

    private String marca;

    private int numero;

    public Chip(String marca, int numero) {
        this.marca = marca;
        this.numero = numero;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
