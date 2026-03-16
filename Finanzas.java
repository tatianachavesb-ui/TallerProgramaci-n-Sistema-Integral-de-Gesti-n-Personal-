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
  }
}
