/**
 * Representa una tarea de la lista.
 */
public class Tarea {
    /** Número que se usa para dar un id diferente a cada tarea. */
    private static int contador=1;

    /** Identificador de la tarea. */
    public int id;

    /** Texto que explica lo que hay que hacer. */
    public  String descripcion;

    /** Prioridad de la tarea: alta, media o baja. */
    public String prioridad;

    /** Indica si la tarea está completada. */
    public boolean estado;

    /**
     * Crea una tarea nueva sin completar.
     *
     * @param descripcion texto que explica la tarea
     * @param prioridad prioridad de la tarea: alta, media o baja
     */
    public  Tarea(String descripcion, String prioridad) {
        this.id=contador++;
        this.descripcion= descripcion;
        this.prioridad= prioridad;
        this.estado=false;
    }

}
