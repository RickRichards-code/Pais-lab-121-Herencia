package Pais;

public class PLatino extends PAmericano{
    public PLatino(String nombre, int superficie, int nroHabitantes, String ubicacion) {
        super(nombre, superficie, nroHabitantes, ubicacion);
    }

    public PLatino(String ubicacion) {
        super(ubicacion);
    }

    public PLatino(String nombre, String ubicacion) {
        super(nombre, ubicacion);
    }
    public PLatino(){
        super();
    }
    public void mostrar(){
        super.mostrar();
    }

}
