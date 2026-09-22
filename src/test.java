import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        int opcion;
        ArrayList<Tarea> Tareas = new ArrayList<>();


        do {
            System.out.println("1.Añadir Tarea |2. ver Tarea |3.Marcar Tarea |4.Eliminar Tarea |5.salir ");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();


            if(opcion == 1){
                sc.nextLine();
               System.out.println("Descripcion de la tarea: ");
               String descripcion = sc.nextLine();
                 String prioridad;
                 do {
                     System.out.println("Prioridad (alta, media o baja): ");
                     prioridad = sc.nextLine().toLowerCase();
                 } while (!prioridad.equals("alta")
                         && !prioridad.equals("media")
                         && !prioridad.equals("baja"));

                 Tarea t =new Tarea(descripcion, prioridad);
                Tareas.add(t);
                System.out.println("Se ha añadido la tarea correctamente");

            } else if (opcion== 2) {
                if (Tareas.isEmpty()){
                    System.out.println("No hay Tareas");
                }else
                    System.out.println("Ver Tarea");
                for (Tarea t: Tareas){
                    System.out.println("id:" + t.id);
                    System.out.println("Descripcion: " + t.descripcion);
                    System.out.println("Prioridad: " + t.prioridad);
                    if (t.estado){
                        System.out.println("estado completado");
                    }else{
                        System.out.println("estado no completado");
                    }

                }


            } else if (opcion==3) {
                System.out.println("Dime que tarea quieres completar: ");
                int idbuscar =  sc.nextInt();

                for (Tarea t: Tareas){
                    if (t.id==idbuscar){

                        t.estado= true;
                        System.out.println("Tarea completada");
                    }
                }

            }else if (opcion==4){
                System.out.println("Dime que tarea quieres eliminar: ");
                int idbuscar= sc.nextInt();
                for (int i= 0; i < Tareas.size(); i++){
                    if (Tareas.get(i).id==idbuscar){
                        Tareas.remove(i);
                        System.out.println("Tarea Eliminada");
                    }
                }
            }


        }while(opcion !=5);
    }
}
