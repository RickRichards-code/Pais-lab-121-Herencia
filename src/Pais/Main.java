package Pais;

public class Main {
    public static void main(String[] args) {
        PAmericano P1 = new PAmericano("surEste");
        PEuropeo P2 = new PEuropeo("portugal",123,324);
        PLatino P3 = new PLatino("Argentina",235321,325,"sur");
        PAmericano P4 =new PAmericano("Canada",3242,423,"Norte");
        P1.mostrar();
        System.out.println(P1.getNombre());
        System.out.println(P1.getNroHabitantes());
        System.out.println(P1.getSuperficie());
        // Pais Europeo
        //  Crear y mostrar mostrar la supericie del objeto PEuropeo
        System.out.println("--- Crear y mostrar mostrar la supericie del objeto PEuropeo ---");
        System.out.println(P2.getSuperficie());
        P2.mostrar();
        P4.mostrar();
        P3.mostrar();
        // mostrar la ubicacion de un Pais Latino
        System.out.println("---- mostrar la ubicacion de un Pais Latino ----");
        System.out.println(P3.getUbicacion());
        // problemas
        // sean 2 paises mostar el nombre del pais con mayor superficie
        System.out.println("---- sean 2 paises mostar el nombre del pais con mayor superficie ---- ");
        P4.mayorSuperficie(P3);
    }
}