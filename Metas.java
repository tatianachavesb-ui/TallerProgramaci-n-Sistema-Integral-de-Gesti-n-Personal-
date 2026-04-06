import java.util.ArrayList;
import java.util.Scanner;

class Meta {
    String nombre;
    double metaTotal;      // Cuánto quiero ahorrar
    double ahorrado;        // Cuánto llevo ahorrado
    
    public Meta(String nombre, double metaTotal) {
        this.nombre = nombre;
        this.metaTotal = metaTotal;
        this.ahorrado = 0; // Empieza en cero
    }
    
    // Calcular porcentaje de avance
    public double porcentaje() {
        return (ahorrado * 100) / metaTotal;
    }
}

public class Metas {
    ArrayList<Meta> listaMetas = new ArrayList<>();

    // Crear una nueva meta
    public void crearMeta(Scanner sc) {
        System.out.println("\n--- NUEVA META ---");
        System.out.print("Nombre de la meta: ");
        String nom = sc.nextLine();
        System.out.print("Total a ahorrar: $");
        double total = Double.parseDouble(sc.nextLine());
        
        Meta m = new Meta(nom, total);
        listaMetas.add(m);
        System.out.println("¡Meta creada!");
    }

    // Agregar dinero a una meta
    public void agregarAhorro(Scanner sc) {
        System.out.println("\n--- AHORRAR PARA META ---");
        
        if (listaMetas.isEmpty()) {
            System.out.println("No hay metas creadas");
            return;
        }
        
        // Mostrar metas
        for (int i = 0; i < listaMetas.size(); i++) {
            Meta m = listaMetas.get(i);
            System.out.println((i+1) + ". " + m.nombre + " - $" + m.ahorrado + "/$" + m.metaTotal);
        }
        
        System.out.print("¿A qué meta quieres ahorrar? (número): ");
        int opc = Integer.parseInt(sc.nextLine());
        
        if (opc > 0 && opc <= listaMetas.size()) {
            Meta m = listaMetas.get(opc-1);
            System.out.print("¿Cuánto vas a ahorrar? $");
            double cantidad = Double.parseDouble(sc.nextLine());
            
            m.ahorrado = m.ahorrado + cantidad;
            if (m.ahorrado > m.metaTotal) {
                m.ahorrado = m.metaTotal; // No puede pasar la meta
            }
            System.out.println("¡Ahorro agregado!");
        }
    }

    // Ver todas las metas con su porcentaje
    public void verMetas() {
        System.out.println("\n=== MIS METAS ===");
        if (listaMetas.isEmpty()) {
            System.out.println("No hay metas");
            return;
        }
        
        for (Meta m : listaMetas) {
            System.out.println(m.nombre);
            System.out.println("  Progreso: $" + m.ahorrado + " de $" + m.metaTotal);
            System.out.println("  Avance: " + m.porcentaje() + "%");
            // Barrita de progreso simple
            System.out.print("  [");
            int barras = (int)(m.porcentaje() / 10);
            for (int i = 0; i < 10; i++) {
                if (i < barras) {
                    System.out.print("█");
                } else {
                    System.out.print("░");
                }
            }
            System.out.println("]");
        }
    }
}
