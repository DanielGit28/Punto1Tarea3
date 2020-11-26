package cr.ac.ucenfotec.clase20.gestor;

import cr.ac.ucenfotec.clase20.entidades.*;
import cr.ac.ucenfotec.clase20.entidades.enums.FormatoAudio;
import cr.ac.ucenfotec.clase20.entidades.enums.FormatoVideo;
import cr.ac.ucenfotec.clase20.entidades.enums.TipoContrato;
import cr.ac.ucenfotec.clase20.entidades.enums.TipoNombramiento;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GestorClasico {

    //----SECCION DE MATERIALES----
    public void guardarMaterialTexto(String signatura, LocalDate fechaCompra, boolean restringido, String tema, String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        MaterialTexto unTexto = new MaterialTexto(signatura,fechaCompra,restringido,tema,titulo ,nombreAutor, fechaPublicacion, numeroPaginas, idioma);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(unTexto.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfTexto.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void guardarMaterialVideo(String signatura, LocalDate fechaCompra, boolean restringido, String tema, FormatoVideo formato, String duracion, String idioma, String director) {
        MaterialVideo unVideo= new MaterialVideo(signatura, fechaCompra,restringido,tema,formato,duracion,idioma,director);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(unVideo.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfVideo.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void guardarMaterialAudio(String signatura, LocalDate fechaCompra, boolean restringido, String tema, FormatoAudio formato, String duracion, String idioma) {
        MaterialAudio unAudio = new MaterialAudio(signatura,fechaCompra,restringido,tema,formato,duracion,idioma);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(unAudio.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfAudio.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarOtroMaterial(String signatura, LocalDate fechaCompra, boolean restringido, String tema, String descripcion) {
        OtroMaterial otro = new OtroMaterial(signatura,fechaCompra,restringido,tema,descripcion);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(otro.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfOtro.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //--SECCION DE LISTADO DE MATERIALES--
    public ArrayList<MaterialTexto> listarMaterialesTexto(){
        ArrayList<MaterialTexto> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfTexto.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new MaterialTexto(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<MaterialVideo> listarMaterialesVideo(){
        ArrayList<MaterialVideo> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfVideo.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new MaterialVideo(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<MaterialAudio> listarMaterialesAudio(){
        ArrayList<MaterialAudio> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfAudio.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new MaterialAudio(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<OtroMaterial> listarOtrosMateriales(){
        ArrayList<OtroMaterial> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfOtro.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new OtroMaterial(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    //-- FIN SECCION DE LISTADO DE MATERIALES--

    //----FIN SECCION MATERIALES----

    //----SECCION DE USUARIOS----
    public void guardarAdministrativo(String nombre, String apellido, String id, TipoNombramiento nombramiento, int cantHorasAsignadas) {
        Administrativo administrativo = new Administrativo(nombre,apellido,id,nombramiento,cantHorasAsignadas);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(administrativo.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfAdministrativo.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarEstudiante(String nombre, String apellido, String id, String carrera, int numCreditos) {
        Estudiante estudiante = new Estudiante(nombre,apellido,id,carrera,numCreditos);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(estudiante.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfEstudiante.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarProfesor(String nombre, String apellido, String id, TipoContrato contrato, LocalDate fechaContratacion) {
        Profesor profesor = new Profesor(nombre,apellido,id,contrato,fechaContratacion);
        ArrayList<String> lines = new ArrayList<>();
        lines.add(profesor.toCSVLine());
        try {                          /* /dev/listOfMaterial.csv   */
            Files.write(Paths.get("c:\\dev\\listOfProfesor.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //--SECCION DE LISTADO DE USUARIOS--
    public ArrayList<Administrativo> listarAdministrativos(){
        ArrayList<Administrativo> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfAdministrativo.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Administrativo(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Estudiante> listarEstudiantes(){
        ArrayList<Estudiante> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfEstudiante.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Estudiante(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public ArrayList<Profesor> listarProfesores(){
        ArrayList<Profesor> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfProfesor.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Profesor(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    //--FIN SECCION DE LISTADO DE USUARIOS--

    //----FIN SECCION DE USUARIOS----
}
