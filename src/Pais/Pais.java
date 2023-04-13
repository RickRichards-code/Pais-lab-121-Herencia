package Pais;

public class Pais {
    private String nombre;
    private int superficie, nroHabitantes;

    public Pais(String nombre, int superficie, int nroHabitantes) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.nroHabitantes = nroHabitantes;
    }
    public Pais() {
        this.nombre = "Bolivia";
        this.superficie = 413;
        this.nroHabitantes = 13515;
    }
    public Pais(String nombre) {
        this.nombre = nombre;
        this.superficie = 413;
        this.nroHabitantes = 13515;
    }

    public void mostrar(){
        System.out.println("---- Pais ----");
        System.out.println("nombre: "+ nombre);
        System.out.println("superficie: "+superficie);
        System.out.println("nroHabitantes: "+nroHabitantes);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(int nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }
}
