package cr.ac.ucenfotec.clase20.ui;

import java.io.PrintStream;
import java.util.Scanner;

public class UI {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    //MENÚ PRINCIPAL
    public void mostrarMenu() {
        output.println("Bievenido, escoja una opcion:");
        output.println("1. Crear material");
        output.println("2. Crear usuario");
        output.println("3. Listar material");
        output.println("4. Listar usuario");
        output.println("5. Realizar préstamo");
        output.println("6. Realizar devolución");
        output.println("7. Salir");
    }

    //----IU DE MATERIALES----
    public void mostrarMenuCrearMaterial() {
        output.println("Bievenido al menú de crear materiales:");
        output.println("1. Crear material de texto");
        output.println("2. Crear material de audio");
        output.println("3. Crear material de video");
        output.println("4. Crear otro tipo de material");
        output.println("5. Salir");
    }
    public void menuFormatoAudio() {
        output.println("Escoja el tipo de formato del audio");
        output.println("1. CASETE");
        output.println("2. CD");
        output.println("3. DVD");
    }
    public void menuFormatoVideo() {
        output.println("Escoja el tipo de formato del video");
        output.println("1. VHS");
        output.println("2. VCD");
        output.println("3. DVD");
    }

    //Listado
    public void mostrarMenulistarMaterial() {
        output.println("Bievenido al menú de listar materiales:");
        output.println("1. Listar materiales de texto");
        output.println("2. Listar materiales de audio");
        output.println("3. Listar materiales de video");
        output.println("4. Listar los otros tipos de materiales");
        output.println("5. Salir");
    }
    //----FIN IU DE MATERIALES----

    //----IU DE USUARIOS----
    public void mostrarMenuCrearUsuario() {
        output.println("Bievenido al menú de crear usuarios:");
        output.println("1. Crear usuario administrativo");
        output.println("2. Crear usuario estudiante");
        output.println("3. Crear usuario profesor");
        output.println("4. Salir");
    }
    //LISTADO
    public void mostrarMenulistarUsuario() {
        output.println("Bievenido al menú de listar usuarios:");
        output.println("1. Listar los usuarios administrativos");
        output.println("2. Listar los usuarios estudiantes");
        output.println("3. Listar los usuarios profesores");
        output.println("4. Salir");
    }
    public void menuTipoNombramiento() {
        output.println("Escoja el tipo de nombramiento");
        output.println("1. A");
        output.println("2. B");
        output.println("3. C");
    }
    public void menuTipoContrato() {
        output.println("Escoja el tipo de contrato");
        output.println("1. TIEMPOCOMPLETO");
        output.println("2. MEDIOTIEMPO");
    }

    //----FIN IU DE USUARIOS----


    public int leerOpcion() {
        output.println("Su opcion es: ");
        return input.nextInt();
    }

    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }

    public String leerTexto() {
        return input.next();
    }

}
