import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Actividad> lista = new ArrayList<>();

        System.out.print("Ingresa tu nombre: ");
        Usuario usuario = new Usuario(sc.nextLine());
        usuario.saludar();

        int opcion = 0;

        do {
            System.out.println("\n1) Agregar");
            System.out.println("2) Mostrar");
            System.out.println("3) Eliminar");
            System.out.println("4) Salir");
            System.out.print("Opcion: ");

            if (!sc.hasNextInt()) {
                System.out.println("Escribe un numero.");
                sc.nextLine();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Nombre Actividad: ");
                    String nombre = sc.nextLine();
                    System.out.print("Hora: ");
                    String hora = sc.nextLine();
                    lista.add(new Actividad(nombre, hora));
                    break;

                case 2:
                    if (lista.isEmpty()) {
                        System.out.println("No hay actividades.");
                    } else {
                        for (int i = 0; i < lista.size(); i++) {
                            System.out.println((i + 1) + ". "
                                    + lista.get(i).getNombre()
                                    + " - "
                                    + lista.get(i).getHora());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Numero: ");
                    if (sc.hasNextInt()) {
                        int num = sc.nextInt();
                        if (num > 0 && num <= lista.size()) {
                            lista.remove(num - 1);
                        }
                    }
                    sc.nextLine();
                    break;
            }

        } while (opcion != 4);

        sc.close();
    }
}
