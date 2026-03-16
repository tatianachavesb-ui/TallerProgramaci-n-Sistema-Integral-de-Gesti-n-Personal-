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

  
}
