package Pais;

public class Main {
    public static void main(String[] args) {
        PAmericano P1 = new PAmericano("Patagonia");
        PEuropeo P2 = new PEuropeo("portugal",123,324);
        P1.mostrar();
        System.out.println(P1.getNombre());
        System.out.println(P1.getNroHabitantes());
        System.out.println(P1.getSuperficie());
        // Pais Europeo
        //  Crear y mostrar mostrar la supericie del objeto PEuropeo
        System.out.println("--- Crear y mostrar mostrar la supericie del objeto PEuropeo ---");
        System.out.println(P2.getSuperficie());
        P2.mostrar();
    }
}