import java.util.ArrayList;
import java.util.Scanner;

public class Usuario{
  String nombre;
  String email;
  String contraseña;

  static ArrayList<Usuario> listaUsuarios=new ArrayList<>();
  static Usuario usuarioActivo=null;

  public Usuario(String nombre, String email, String contraseña){
    this.nombre=nombre;
    this.email=email;
    this.contraseña=contraseña;
  }
  public static void regustrar(Scanner sc){
    System.out.println("\n--REGISTRO--");
    Syatem.out.print("Nombre: ");
    String nom=sc.nextLine();
    System.out.print("Email: ");
    String em=sc.nextLine();
    System.out.print("Contraseña: ");
    String con=sc.nextLine();

    Usuario u=new Usuario(nom, em, con);
    listaUsuarios.add(u);
    Syatem.out.println("Usuario registrado");
  }
  public static boolean iniciarSesion(Scanner sc){
    System.out.println("\n--INICIAR SESION--");
    System.out.print("Email: ");
    String em=sc.nextLine();
    System.out.print("Contraseña: ");
    String con=sc.nextLine();

    
  } 
  
}
