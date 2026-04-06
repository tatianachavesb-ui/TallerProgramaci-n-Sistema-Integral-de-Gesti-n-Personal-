import java.util.ArrayList;
import java.util.Scanner;

class Gasto {
  String descripcion;
  double valor;
  String categoria;

  public Gasto(String descripcion, double valor, String categoria){
    this.descripcion=descripcion;
    this.valor=valor;
    this.categoria=categoria;
  }
}
class Ingreso{
  String descripcion;
  double valor;
  String categoria;

  public Ingreso(String descripcion, double valor, String categoria){
    this.descripcion=descripcion;
    this.valor=valor;
    this.categoria=categoria;
  }
}
public class Finanzas{
  ArrayList<Ingreso> ingresos=new ArrayList<>();
  ArrayList<Gasto> gastos=new ArrayList<>();

  public void registarrIngreso(Scanner sc){
    System.out.println("\n--NUEVO INGRESO--");
    System.out.println("Descripcion: ");
    String desc=sc.nextLine();
    System.out.print("Valor: ");
    double val=Double.perseDouble(sc.nextLine());
    System.out.print("Categoria: ");
    String cat=sc.nextLine();
    Ingreso ing=new Ingreso(desc, val, cat);
    ingreso.add(ing);
    System.out.println("Ingreso guardado");
  } 
  public void registrarGastos(Scanner sc){
    System.out.println("\n--- NUEVO GASTO ---");
        System.out.print("Descripción: ");
        String desc = sc.nextLine();
        System.out.print("Valor: $");
        double val = Double.parseDouble(sc.nextLine());
        System.out.print("Categoría: ");
        String cat = sc.nextLine();
        
        Gasto gas = new Gasto(desc, val, cat);
        gastos.add(gas);
        System.out.println("¡Gasto guardado!");
  }
  public double calcularBalance() {
        double totalIngresos = 0;
        double totalGastos = 0;
        
        // Sumar todos los ingresos
        for (Ingreso i : ingresos) {
            totalIngresos = totalIngresos + i.valor;
        }
        
        // Sumar todos los gastos
        for (Gasto g : gastos) {
            totalGastos = totalGastos + g.valor;
        }
        
        return totalIngresos - totalGastos;
    }

    // Reporte sencillo
    public void generarReporte() {
        System.out.println("\n=== REPORTE FINANCIERO ===");
        System.out.println("Ingresos:");
        for (Ingreso i : ingresos) {
            System.out.println("  + $" + i.valor + " - " + i.descripcion + " (" + i.categoria + ")");
        }
        
        System.out.println("Gastos:");
        for (Gasto g : gastos) {
            System.out.println("  - $" + g.valor + " - " + g.descripcion + " (" + g.categoria + ")");
        }
        
        System.out.println("Balance total: $" + calcularBalance());
    }
}
