package Pais;

public class PAmericano extends Pais {
    private String ubicacion;

    public PAmericano(String nombre, int superficie, int nroHabitantes, String ubicacion) {
        super(nombre, superficie, nroHabitantes);
        this.ubicacion = ubicacion;
    }
    public PAmericano(){
        super();
    }
    // son metodos para mostrar diferentes.
    public void mostrar(){
        super.mostrar();
        System.out.println("ubicacion: "+ubicacion);
    }
    // Otro tipo de mostrar
    public void mostrarPA(){
        mostrar();
        System.out.println("ubicacion: "+ubicacion);
    }

    public PAmericano(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public PAmericano(String nombre, String ubicacion) {
        super(nombre);
        this.ubicacion = ubicacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
