public class Tarea {

    private int id;
    private String descripcion;
    private boolean completada;

    public Tarea(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void marcarComoCompletada() {

        this.completada = true;
    }

    @Override
    public String toString() {
        return  " Id: " + this.id + ", " +
                " Descripcion: " + this.descripcion + ", " +
                " Completada: " + this.completada;
    }
}
