package cr.ac.ucenfotec.clase20.entidades;

import cr.ac.ucenfotec.clase20.entidades.enums.FormatoAudio;

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

public class MaterialAudio extends Material{
    private FormatoAudio formato;
    private String duracion;
    private String idioma;

    public FormatoAudio getFormato() {
        return formato;
    }

    public void setFormato(FormatoAudio formato) {
        this.formato = formato;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public MaterialAudio() {}

    @Override
    public String toCSVLine() {
        return this.signatura + "," + this.fechaCompra + "," + this.restringido + "," + this.tema + ","+ this.formato + "," + this.duracion + "," + this.idioma;
    }

    /*public void save(MaterialAudio nuevoMaterial) {
        //Path path = Paths.get("c:\\dev\\listOfMaterial.csv");
        ArrayList<String> lines = new ArrayList<>();
        lines.add(nuevoMaterial.toCSVLine());
        try {
            Files.write(Paths.get("c:\\dev\\listOfMaterialAudio.csv"),lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public MaterialAudio(String signatura, LocalDate fechaCompra, boolean restringido, String tema, FormatoAudio formato, String duracion, String idioma) {
        this.signatura = signatura;
        this.fechaCompra = fechaCompra;
        this.restringido = restringido;
        this.tema = tema;
        this.formato = formato;
        this.duracion = duracion;
        this.idioma = idioma;
    }

    public MaterialAudio(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.signatura = datos[0];
        this.fechaCompra = LocalDate.parse(datos[1]);
        this.restringido = Boolean.parseBoolean(datos[2]);
        this.tema = datos[3];
        this.formato = FormatoAudio.valueOf(datos[4]);
        this.duracion = datos[5];
        this.idioma = datos[6];
    }

    @Override
    public String toString() {
        return "MaterialAudio{" +
                "formato=" + formato +
                ", duracion='" + duracion + '\'' +
                ", idioma='" + idioma + '\'' +
                ", signatura='" + signatura + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                '}';
    }



}
