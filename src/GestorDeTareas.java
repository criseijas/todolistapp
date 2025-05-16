import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {

    private List<Tarea> tareas = new ArrayList<>();
    private int siguienteId = 1;

    public void agregarTarea(String descripcion) {
        tareas.add(new Tarea(siguienteId++, descripcion));
    }

    public void mostrarTareas() {
        if (tareas.isEmpty()) {
            System.out.println("No hay tareas registradas");
        }else {
            for (Tarea tarea : tareas) {
                System.out.println(tarea);
            }
        }
    }

    public void marcarTareaComoCompletada(int id) {
        for (Tarea tarea: tareas) {
            if (tarea.getId() == id) {
                tarea.marcarComoCompletada();
                System.out.println("Tarea marcada como completada [✔]");
                return; // <- el return sale del método tan pronto como encuentra la tarea con el id indicado.
                        //Así evita que se siga ejecutando el resto del código.
            }
        }
        System.out.println("No se encontró una tarea con ese ID");
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id); //Esto es una expresión lambda, es decir, una función anónima.
                                                     // “Para cada elemento t (que es una Tarea) en la lista, evaluá si t.getId() es igual a id.”
                                                     // removeIf Es un método de las listas de Java (ArrayList) que elimina todos los elementos que cumplan cierta condición.
                                                     //Recibe una función que devuelve true o false para cada elemento.
        //por lo tanto: “Recorré la lista tareas y eliminá todos los elementos cuyo id sea igual al valor que te pasé.”

        System.out.println("Tarea eliminada!");
    }

}
