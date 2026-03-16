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

    for(Usuario u:listaUsuario){
      if(u.email.equals(em)&& u.contraseña.equals(con)){
        usuarioActivo=u;
        System.out.println("Bienvenido"+ u.nombre );
        return true;
      }
    }
    System.out.println("Email o contraseña incorrectos");
    return false;
  }   
  public static void cerrarSesion(){
    usuarioActivo=null;
    System.out.println("Sesion cerrada")
  }
}
