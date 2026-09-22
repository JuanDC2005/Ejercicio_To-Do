public class Tarea {
    private static int contador=1;
    public int id;
    public  String descripcion;
    public String prioridad;
    public boolean estado;

    public  Tarea(String descripcion, String prioridad) {
        this.id=contador++;
        this.descripcion= descripcion;
        this.prioridad= prioridad;
        this.estado=false;
    }

}
