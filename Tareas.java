import java.util.ArrayList;
import java.util.Scanner;

class Tarea {
    String descripcion;
    String fechaLimite;
    boolean completada; // false = pendiente, true = completada
    
    public Tarea(String descripcion, String fechaLimite) {
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.completada = false; // Por defecto está pendiente
    }
}

public class Tareas {
    ArrayList<Tarea> listaTareas = new ArrayList<>();

    // Agregar una tarea nueva
    public void agregarTarea(Scanner sc) {
        System.out.println("\n--- NUEVA TAREA ---");
        System.out.print("Descripción: ");
        String desc = sc.nextLine();
        System.out.print("Fecha límite (ej: 30/12/2024): ");
        String fecha = sc.nextLine();
        
        Tarea t = new Tarea(desc, fecha);
        listaTareas.add(t);
        System.out.println("¡Tarea agregada!");
    }

    // Marcar tarea como completada
    public void completarTarea(Scanner sc) {
        System.out.println("\n--- COMPLETAR TAREA ---");
        
        // Mostrar solo tareas pendientes
        System.out.println("Tareas pendientes:");
        int contador = 1;
        for (Tarea t : listaTareas) {
            if (!t.completada) {
                System.out.println(contador + ". " + t.descripcion + " (hasta: " + t.fechaLimite + ")");
                contador++;
            }
        }
        
        if (contador == 1) {
            System.out.println("No hay tareas pendientes");
            return;
        }
        
        System.out.print("¿Cuál tarea completaste? (número): ");
        int opc = Integer.parseInt(sc.nextLine());
        
        // Buscar y marcar la tarea
        contador = 1;
        for (Tarea t : listaTareas) {
            if (!t.completada) {
                if (contador == opc) {
                    t.completada = true;
                    System.out.println("¡Tarea completada!");
                    return;
                }
                contador++;
            }
        }
    }

    // Ver todas las tareas
    public void verTareas() {
        System.out.println("\n=== MIS TAREAS ===");
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas");
            return;
        }
        
        for (Tarea t : listaTareas) {
            String estado;
            if (t.completada) {
                estado = "COMPLETADA";
            } else {
                estado = "PENDIENTE";
            }
            System.out.println(estado + " - " + t.descripcion + " (límite: " + t.fechaLimite + ")");
        }
    }
}
