import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Finanzas finanzas=new Finanzas();
        Tareas tareas=new Tareas();
        Metas metas=new Metas();

      int opcion;
      System.out.println( "  GESTION PERSONAL ");

    while (true) {
      if (Usuario.usuarioActivo == null){
        System.out.println(" MENU PRINCIPAL ");
        System.out.println("1. Iniciar sesion ");
        System.out.println("2. Registrarse ");
        System.out.println("3. Salir");
        System.out.println("Opciojn:")

          opcion = Integer.parseInt(sc.nextLine());

        if (opcion == 1){
          Usuario.iniciarSesion(sc);
        }else if (opcion == 2){
          Usurio.registrar(sc);
        }else if (opcion == 3){
          System.out.println( "Adios");
          break;
        }
      }
      else{
        System.out.println("\n-- Usuario: "+ Usuario.usuarioActivo.nombre+ "--");
        System.out.println("1. Registrar Ingreso");
        System.out.println("2. Registrar Gastos");
        System.out.println("3. Ver Balance");
        System.out.println("4. Agregar Tarea");
        System.out.println("5. Completrar Tarea");
        System.out.println("6. Ver Tareas");
        System.out.println("7. Crear Meta");
        System.out.println("8. Ahorar Para Meta");
        System.out.println("9. Ver Meta");
        System.out.println("10. Reporte Financiero");
        System.out.println("11. Cerrar Sesion");
        System.out.println("Opcion:  ");

        opcion = Integer.parseInt(sc.nextLine());

        if (opcion == 1){
          finanzas.registrarIngreso(sc);
        }else if (opcion == 2){
          finanzas.registrarGasto(sc);
        }else if (opcion == 3){
          System.out.println( "\nBlanace Actual:  "+ finanzas.calcularBalance());
        }else if (opcion == 4){
          tareas.agregarTarea(sc);
        }else if (opcion == 5){
          tareas.completarTarea(sc);
        }else if (opcion == 6){
          tareas.verTarea();
        }else if (opcion == 7){
          metas.crearMeta(sc);
        }else if (opcion == 8){
          metas.agregarAhorro(sc);
        }else if (opcion == 9){
          metas.verMetas();
        }else if (opcion == 10){
          finanzas.generarReporte();
        }else if (opcion == 11){
          Usuario.cerrarSesion();
        } 
      }
    }
      sc.close();
  }
}
