public class Tarea {
    private static int contador=1;
    public int id;
    public  String descripcion;
    public boolean estado;

    public  Tarea(String descripcion) {
        this.id=contador++;
        this.descripcion= descripcion;
        this.estado=false;
    }

}
