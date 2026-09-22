import java.util.ArrayList;
import java.util.Scanner;

/**
 * Programa principal para gestionar una lista de tareas desde la consola.
 */
public class test {
    /**
     * Inicia el menu de la aplicacion.
     *
     * Este metodo no devuelve ningun valor porque solo muestra el menu
     * y modifica la lista de tareas.
     */
    public static void main() {
        // Creamos el Scanner para leer los datos del usuario.
        Scanner sc= new Scanner(System.in);
        // Guarda la opcion elegida en el menu.
        int opcion;
        // Lista donde se guardan todas las tareas.
        ArrayList<Tarea> Tareas = new ArrayList<>();


        do {
            // Mostramos las opciones disponibles.
            System.out.println("1.Añadir Tarea |2. ver Tarea |3.Marcar Tarea |4.Eliminar Tarea |5.Filtrar por prioridad |6.salir ");
            System.out.println("Elige una opcion: ");
            opcion = sc.nextInt();


            if(opcion == 1){
                // Pedimos los datos necesarios para crear una tarea.
                sc.nextLine();
               System.out.println("Descripcion de la tarea: ");
               String descripcion = sc.nextLine();
                 String prioridad;
                 // Repetimos la pregunta hasta que la prioridad sea correcta.
                 do {
                     System.out.println("Prioridad (alta, media o baja): ");
                     prioridad = sc.nextLine().toLowerCase();
                 } while (!prioridad.equals("alta")
                         && !prioridad.equals("media")
                         && !prioridad.equals("baja"));

                 // Creamos la tarea y la guardamos en la lista.
                 Tarea t =new Tarea(descripcion, prioridad);
                Tareas.add(t);
                System.out.println("Se ha añadido la tarea correctamente");

            } else if (opcion== 2) {
                // Comprobamos si hay tareas antes de mostrarlas.
                if (Tareas.isEmpty()){
                    System.out.println("No hay Tareas");
                }else
                    System.out.println("Ver Tarea");
                // Mostramos los datos de cada tarea.
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
                // Pedimos el id de la tarea que se quiere completar.
                System.out.println("Dime que tarea quieres completar: ");
                int idbuscar =  sc.nextInt();

                // Buscamos la tarea y cambiamos su estado.
                for (Tarea t: Tareas){
                    if (t.id==idbuscar){

                        t.estado= true;
                        System.out.println("Tarea completada");
                    }
                }
            }else if (opcion==4){
                System.out.println("Dime que tarea quieres eliminar: ");
                int idbuscar= sc.nextInt();
                // Recorremos la lista y eliminamos la tarea encontrada.
                for (int i= 0; i < Tareas.size(); i++){
                    if (Tareas.get(i).id==idbuscar){
                        Tareas.remove(i);
                        System.out.println("Tarea Eliminada");
                    }
                }
            } else if (opcion==5) {
                // Pedimos la prioridad que se quiere buscar.
                sc.nextLine();
                String prioridadBuscar;
                do {
                    System.out.println("Prioridad que quieres ver (alta, media o baja): ");
                    prioridadBuscar = sc.nextLine().toLowerCase();
                } while (!prioridadBuscar.equals("alta")
                        && !prioridadBuscar.equals("media")
                        && !prioridadBuscar.equals("baja"));

                // Mostramos solo las tareas que tienen esa prioridad.
                boolean hayTareas = false;
                for (Tarea t : Tareas) {
                    if (t.prioridad.equals(prioridadBuscar)) {
                        System.out.println("id:" + t.id);
                        System.out.println("Descripcion: " + t.descripcion);
                        System.out.println("Prioridad: " + t.prioridad);
                        if (t.estado) {
                            System.out.println("estado completado");
                        } else {
                            System.out.println("estado no completado");
                        }
                        hayTareas = true;
                    }
                }

                if (!hayTareas) {
                    System.out.println("No hay tareas con esa prioridad");
                }
            }

        // Volvemos al menu hasta que el usuario elija la opcion 6.
        }while(opcion !=6);
    }
}
