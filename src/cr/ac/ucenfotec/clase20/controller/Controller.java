package cr.ac.ucenfotec.clase20.controller;

import cr.ac.ucenfotec.clase20.entidades.*;
import cr.ac.ucenfotec.clase20.entidades.enums.FormatoAudio;
import cr.ac.ucenfotec.clase20.entidades.enums.FormatoVideo;
import cr.ac.ucenfotec.clase20.entidades.enums.TipoContrato;
import cr.ac.ucenfotec.clase20.entidades.enums.TipoNombramiento;
import cr.ac.ucenfotec.clase20.gestor.GestorClasico;
import cr.ac.ucenfotec.clase20.gestor.MaterialGestor;
import cr.ac.ucenfotec.clase20.ui.UI;

import java.time.LocalDate;
import java.util.List;

public class Controller {

    private UI ui = new UI();

    //private MaterialGestor gestor = new MaterialGestor();
    private GestorClasico gestor = new GestorClasico();

    public void ejecutarPrograma(){
        int opcion = 0;
        do {
            ui.mostrarMenu();
            opcion = ui.leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 7);
    }

    private void ejecutarOpcion(int opcion) {
        switch (opcion){
            case 1:
                ejecutarCrearMaterial();
                break;
            case 2:
                ejecutarCrearUsuario();
                break;
            case 3:
                ejecutarListarMaterial();
                break;
            case 4:
                ejecutarListarUsuario();
                break;
            case 5:
                //prestamo();
                break;
            case 6:
                //devolucion();
                break;
            case 7:
                break;
        }

    }

    //----SECCION DE MATERIALES----

    //--SECCION DE CREACION DE MATERIALES--
    public void ejecutarCrearMaterial(){
        int opcion = 0;
        do {
            ui.mostrarMenuCrearMaterial();
            opcion = ui.leerOpcion();
            ejecutarOpcionCrearMaterial(opcion);
        } while (opcion != 5);
    }

    private void ejecutarOpcionCrearMaterial(int opcion) {
        switch (opcion){
            case 1:
                crearMaterialTexto();
                break;
            case 2:
                crearMaterialAudio();
                break;
            case 3:
                crearMaterialVideo();
                break;
            case 4:
                crearOtroMaterial();
                break;
            case 5:
                break;
        }

    }
    private void crearMaterialTexto() {
        ui.imprimirMensaje("Signatura: ");
        String signatura = ui.leerTexto();
        boolean isSignatura = verificacionSignatura(signatura);
        if(isSignatura == false) {
            ui.imprimirMensaje("Fecha de compra: ");
            LocalDate fechaCompra = LocalDate.parse(ui.leerTexto());
            ui.imprimirMensaje("El material es restringido (true o false): ");
            boolean restringido = Boolean.parseBoolean(ui.leerTexto());
            ui.imprimirMensaje("Tema: ");
            String tema = ui.leerTexto();
            ui.imprimirMensaje("Título: ");
            String titulo = ui.leerTexto();
            ui.imprimirMensaje("Nombre del autor: ");
            String nombreAutor = ui.leerTexto();
            ui.imprimirMensaje("Fecha de publicación: ");
            LocalDate fechaPublicacion = LocalDate.parse(ui.leerTexto());
            ui.imprimirMensaje("Numero de paginas: ");
            int numeroPaginas = Integer.parseInt(ui.leerTexto());
            ui.imprimirMensaje("Idioma: ");
            String idioma = ui.leerTexto();
            gestor.guardarMaterialTexto(signatura,fechaCompra,restringido,tema,titulo,
                    nombreAutor,fechaPublicacion,numeroPaginas,idioma);
            System.out.println("Material creado con éxito");
        } else {
            System.out.println("Signatura repetida");
        }

        /*MaterialTexto texto = new MaterialTexto(signatura,fechaCompra,restringido,tema,titulo,
                nombreAutor,fechaPublicacion,numeroPaginas,idioma);
        System.out.println(texto.toCSVLine());*/
    }
    private void crearMaterialAudio() {
        ui.imprimirMensaje("Signatura: ");
        String signatura = ui.leerTexto();
        boolean isSignatura = verificacionSignatura(signatura);
        if(isSignatura == false) {
            ui.imprimirMensaje("Fecha de compra: ");
            LocalDate fechaCompra = LocalDate.parse(ui.leerTexto());
            ui.imprimirMensaje("El material es restringido (true o false): ");
            boolean restringido = Boolean.parseBoolean(ui.leerTexto());
            ui.imprimirMensaje("Tema: ");
            String tema = ui.leerTexto();
            boolean datoValido = false;
            FormatoAudio formato = null;
            while(datoValido == false){
                try{
                    ui.menuFormatoAudio();
                    int opcion = ui.leerOpcion();
                    if(opcion >= 1 && opcion <= 3){
                        datoValido = true;
                        if(opcion == 1) {
                            formato = FormatoAudio.CASETE;
                        } else if (opcion == 2) {
                            formato = FormatoAudio.CD;
                        } else {
                            formato = FormatoAudio.DVD;
                        }
                    }
                } catch (Exception e){
                    System.out.println("Debe ingresar el número de alguna de las opciones de formato");
                }
            }
            ui.imprimirMensaje("Duración: ");
            String duracion = ui.leerTexto();
            ui.imprimirMensaje("Idioma: ");
            String idioma = ui.leerTexto();
            gestor.guardarMaterialAudio(signatura,fechaCompra,restringido,tema,formato,
                    duracion,idioma);
            System.out.println("Material creado con éxito");
        } else {
            System.out.println("Signatura repetida");
        }

    }

    private void crearMaterialVideo() {
        ui.imprimirMensaje("Signatura: ");
        String signatura = ui.leerTexto();
        boolean isSignatura = verificacionSignatura(signatura);
        if(isSignatura == false) {
            ui.imprimirMensaje("Fecha de compra: ");
            LocalDate fechaCompra = LocalDate.parse(ui.leerTexto());
            ui.imprimirMensaje("El material es restringido (true o false): ");
            boolean restringido = Boolean.parseBoolean(ui.leerTexto());
            ui.imprimirMensaje("Tema: ");
            String tema = ui.leerTexto();
            boolean datoValido = false;
            FormatoVideo formato = null;
            while(datoValido == false){
                try{
                    ui.menuFormatoVideo();
                    int opcion = ui.leerOpcion();
                    if(opcion >= 1 && opcion <= 3){
                        datoValido = true;
                        if(opcion == 1) {
                            formato = FormatoVideo.VHS;
                        } else if (opcion == 2) {
                            formato = FormatoVideo.VCD;
                        } else {
                            formato = FormatoVideo.DVD;
                        }
                    }
                } catch (Exception e){
                    System.out.println("Debe ingresar el número de alguna de las opciones de formato");
                }
            }
            ui.imprimirMensaje("Duración: ");
            String duracion = ui.leerTexto();
            ui.imprimirMensaje("Idioma: ");
            String idioma = ui.leerTexto();
            ui.imprimirMensaje("Director: ");
            String director = ui.leerTexto();
            gestor.guardarMaterialVideo(signatura,fechaCompra,restringido,tema,formato,
                    duracion,idioma,director);
            System.out.println("Material creado con éxito");
        } else {
            System.out.println("Signatura repetida");
        }

    }
    private void crearOtroMaterial() {
        ui.imprimirMensaje("Signatura: ");
        String signatura = ui.leerTexto();
        boolean isSignatura = verificacionSignatura(signatura);
        if(isSignatura == false) {
            ui.imprimirMensaje("Fecha de compra: ");
            LocalDate fechaCompra = LocalDate.parse(ui.leerTexto());
            ui.imprimirMensaje("El material es restringido (true o false): ");
            boolean restringido = Boolean.parseBoolean(ui.leerTexto());
            ui.imprimirMensaje("Tema: ");
            String tema = ui.leerTexto();
            ui.imprimirMensaje("Descripción: ");
            String descripcion = ui.leerTexto();
            gestor.guardarOtroMaterial(signatura,fechaCompra,restringido,tema,descripcion);
            System.out.println("Material creado con éxito");
        }else{
            System.out.println("Signatura repetida");
        }
    }
    //--FIN SECCION DE CREACION DE MATERIALES

    //--SECCION DE LISTAR MATERIALES--
    public void ejecutarListarMaterial(){
        int opcion = 0;
        do {
            ui.mostrarMenulistarMaterial();
            opcion = ui.leerOpcion();
            ejecutarOpcionListarMaterial(opcion);
        } while (opcion != 5);
    }

    private void ejecutarOpcionListarMaterial(int opcion) {
        switch (opcion){
            case 1:
                listarMaterialTexto();
                break;
            case 2:
                listarMaterialAudio();
                break;
            case 3:
                listarMaterialVideo();
                break;
            case 4:
                listarOtroMaterial();
                break;
            case 5:
                break;
        }
    }
    public void listarMaterialTexto() {
        List<MaterialTexto> textos = gestor.listarMaterialesTexto();
        for (MaterialTexto unMaterial: textos) {
            ui.imprimirMensaje(unMaterial.toCSVLine());
        }
    }
    public void listarMaterialAudio() {
        List<MaterialAudio> audios = gestor.listarMaterialesAudio();
        for (MaterialAudio unMaterial: audios) {
            ui.imprimirMensaje(unMaterial.toCSVLine());
        }
    }
    public void listarMaterialVideo() {
        List<MaterialVideo> videos = gestor.listarMaterialesVideo();
        for (MaterialVideo unMaterial: videos) {
            ui.imprimirMensaje(unMaterial.toCSVLine());
        }
    }
    public void listarOtroMaterial() {
        List<OtroMaterial> otros = gestor.listarOtrosMateriales();
        for (OtroMaterial unMaterial: otros) {
            ui.imprimirMensaje(unMaterial.toCSVLine());
        }
    }

    //--FIN SECCION DE LISTAR MATERIALES--

//----FIN SECCION DE MATERIALES----

    //----SECCION DE USUARIOS----
    public void ejecutarCrearUsuario(){
        int opcion = 0;
        do {
            ui.mostrarMenuCrearUsuario();
            opcion = ui.leerOpcion();
            ejecutarOpcionCrearUsuario(opcion);
        } while (opcion != 4);
    }

    private void ejecutarOpcionCrearUsuario(int opcion) {
        switch (opcion){
            case 1:
                crearAdministrativo();
                break;
            case 2:
                crearEstudiante();
                break;
            case 3:
                crearProfesor();
                break;
            case 4:
                break;
        }

    }
    private void crearAdministrativo() {
        ui.imprimirMensaje("Nombre: ");
        String nombre = ui.leerTexto();
        ui.imprimirMensaje("Apellido: ");
        String apellido = ui.leerTexto();
        ui.imprimirMensaje("Identificación: ");
        String id = ui.leerTexto();
        boolean isID = verificacionID(id);
        if(isID == false) {
            boolean datoValido = false;
            TipoNombramiento nombramiento = null;
            while (datoValido == false) {
                try {
                    ui.menuTipoNombramiento();
                    int opcion = ui.leerOpcion();
                    if (opcion >= 1 && opcion <= 3) {
                        datoValido = true;
                        if (opcion == 1) {
                            nombramiento = TipoNombramiento.A;
                        } else if (opcion == 2) {
                            nombramiento = TipoNombramiento.B;
                        } else {
                            nombramiento = TipoNombramiento.C;
                        }
                    }
                } catch (Exception e) {
                    System.out.println("Debe ingresar el número de alguna de las opciones de nombramiento");
                }
            }
            ui.imprimirMensaje("Cantidad de horas asignadas: ");
            int cantHorasAsignadas = Integer.parseInt(ui.leerTexto());
            gestor.guardarAdministrativo(nombre, apellido,id,nombramiento,cantHorasAsignadas);
            System.out.println("Usuario creado con éxito");
        } else {
            System.out.println("Identificación repetida");
        }

    }
    private void crearEstudiante() {
        ui.imprimirMensaje("Nombre: ");
        String nombre = ui.leerTexto();
        ui.imprimirMensaje("Apellido: ");
        String apellido = ui.leerTexto();
        ui.imprimirMensaje("Identificación: ");
        String id = ui.leerTexto();
        boolean isID = verificacionID(id);
        if(isID == false) {
            ui.imprimirMensaje("Carrera: ");
            String carrera = ui.leerTexto();
            ui.imprimirMensaje("Número de créditos: ");
            int numCreditos = Integer.parseInt(ui.leerTexto());
            gestor.guardarEstudiante(nombre,apellido,id,carrera,numCreditos);
            System.out.println("Usuario creado con éxito");
        } else {
            System.out.println("Identificación repetida");
        }

    }

    private void crearProfesor() {
        ui.imprimirMensaje("Nombre: ");
        String nombre = ui.leerTexto();
        ui.imprimirMensaje("Apellido: ");
        String apellido = ui.leerTexto();
        ui.imprimirMensaje("Identificación: ");
        String id = ui.leerTexto();
        boolean isID = verificacionID(id);
        if(isID == false) {
            boolean datoValido = false;
            TipoContrato contrato = null;
            while(datoValido == false){
                try{
                    ui.menuTipoContrato();
                    int opcion = ui.leerOpcion();
                    if(opcion == 1 || opcion == 2){
                        datoValido = true;
                        if(opcion == 1) {
                            contrato = TipoContrato.TIEMPOCOMPLETO;
                        } else if (opcion == 2) {
                            contrato = TipoContrato.MEDIOTIEMPO;
                        }
                    }
                } catch (Exception e){
                    System.out.println("Debe ingresar el número de alguna de las opciones de contrato");
                }
            }
            ui.imprimirMensaje("Fecha de contratación: ");
            LocalDate fechaContratacion = LocalDate.parse(ui.leerTexto());
            gestor.guardarProfesor(nombre,apellido,id,contrato,fechaContratacion);
            System.out.println("Usuario creado con éxito");
        } else {
            System.out.println("Identificación repetida");
        }

    }

    //--SECCION DE LISTAR USUARIOS--
    public void ejecutarListarUsuario(){
        int opcion = 0;
        do {
            ui.mostrarMenulistarUsuario();
            opcion = ui.leerOpcion();
            ejecutarOpcionListarUsuario(opcion);
        } while (opcion != 4);
    }

    private void ejecutarOpcionListarUsuario(int opcion) {
        switch (opcion){
            case 1:
                listarAdministrativo();
                break;
            case 2:
                listarEstudiante();
                break;
            case 3:
                listarProfesor();
                break;
            case 4:
                break;
        }

    }
    public void listarAdministrativo() {
        List<Administrativo> admins = gestor.listarAdministrativos();
        for (Administrativo usuario: admins) {
            ui.imprimirMensaje(usuario.toCSVLine());
        }
    }
    public void listarEstudiante() {
        List<Estudiante> estudiantes = gestor.listarEstudiantes();
        for (Estudiante usuario: estudiantes) {
            ui.imprimirMensaje(usuario.toCSVLine());
        }
    }
    public void listarProfesor() {
        List<Profesor> profesores = gestor.listarProfesores();
        for (Profesor usuario: profesores) {
            ui.imprimirMensaje(usuario.toCSVLine());
        }
    }

    //--FIN SECCION DE LISTAR USUARIOS--

    //----FIN SECCION DE USUARIOS----

    //VERIFICACION DE IDS Y SIGNATURAS
    public boolean verificacionID(String id) {
        boolean estado = false;
        List<Administrativo> admins = gestor.listarAdministrativos();
        for (Administrativo admin: admins) {
            if(admin.getId().equals(id)) {
                estado = true;
            }
        }
        List<Estudiante> estudiantes = gestor.listarEstudiantes();
        for (Estudiante estudiante: estudiantes) {
            if(estudiante.getId().equals(id)) {
                estado = true;
            }
        }
        List<Profesor> profesores = gestor.listarProfesores();
        for (Profesor profesor: profesores) {
            if(profesor.getId().equals(id)) {
                estado = true;
            }
        }
        return estado;
    }
    public boolean verificacionSignatura(String signatura) {
        boolean estado = false;
            List<MaterialTexto> textos = gestor.listarMaterialesTexto();
            for (MaterialTexto texto: textos) {
                if(texto.getSignatura().equals(signatura)) {
                    estado = true;
                    System.out.println("Texto sig repetida");
                }
            }
            List<MaterialAudio> audios = gestor.listarMaterialesAudio();
            for (MaterialAudio audio: audios) {
                if(audio.getSignatura().equals(signatura)) {
                    estado = true;
                }
            }
            List<MaterialVideo> videos = gestor.listarMaterialesVideo();
            for (MaterialVideo video: videos) {
                if(video.getSignatura().equals(signatura)) {
                    estado = true;
                }
            }
            List<OtroMaterial> otros = gestor.listarOtrosMateriales();
            for (OtroMaterial otro: otros) {
                if(otro.getSignatura().equals(signatura)) {
                    estado = true;
                }
            }
        return estado;
    }

}
