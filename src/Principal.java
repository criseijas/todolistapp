import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion;
        GestorDeTareas gestor = new GestorDeTareas();

        do {
            System.out.println("****** Gestor de Tareas ******");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Marcar tarea como completada");
            System.out.println("4. Eliminar tarea");
            System.out.println("0. Salir");
            System.out.println("Elegí una opción:");
            opcion = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la tarea que quiere agregar: ");
                    String tareaUsuario = teclado.nextLine();
                    gestor.agregarTarea(tareaUsuario);
                    break;
                case 2:
                    System.out.println("Tareas registradas: ");
                    gestor.mostrarTareas();
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la tarea completada: ");
                    int id = teclado.nextInt();
                    gestor.marcarTareaComoCompletada(id);
                    break;
                case 4:
                    System.out.println("Ingrese el ID de la tarea que quiere eliminar:");
                    int idEliminar = teclado.nextInt();
                    gestor.eliminarTarea(idEliminar);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar el gestor de tareas!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
            }
        }
        while (opcion != 0);

            teclado.close();

    }
}
