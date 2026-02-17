import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Actividad> lista = new ArrayList<>();

        System.out.print("Ingresa tu nombre: ");
        Usuario usuario = new Usuario(sc.nextLine());
        usuario.saludar();

        int opcion;

        do {
            System.out.println("\n________ MENU ________");
            System.out.println("1) Agregar actividad");
            System.out.println("2) Mostrar actividades");
            System.out.println("3) Eliminar actividad");
            System.out.println("4) Salir\n");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre de actividad: ");
                    String nombre = sc.nextLine();
                    System.out.print("Hora (ejem 08:00): ");
                    String hora = sc.nextLine();
                    lista.add(new Actividad(nombre, hora));
                    System.out.println("\n/// Actividad agregada correctamente ///");
                    break;

                case 2:
                    System.out.println("Lista de actividades:");
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println((i + 1) + ". "
                                + lista.get(i).nombre
                                + " - "
                                + lista.get(i).hora);
                    }
                    break;

                case 3:
                    System.out.print("Actividad a eliminar(numero): ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    if (num > 0 && num <= lista.size()) {
                        lista.remove(num - 1);
                        System.out.println("\n Actividad eliminada");
                    } else {
                        System.out.println("Numero invalido.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        } while (opcion != 4);
        sc.close();
    }

}
