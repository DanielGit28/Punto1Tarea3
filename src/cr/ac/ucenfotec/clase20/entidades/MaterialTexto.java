package cr.ac.ucenfotec.clase20.entidades;

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

public class MaterialTexto extends Material{
    private String titulo;
    private String nombreAutor;
    private LocalDate fechaPublicacion;
    private int numeroPaginas;
    private String idioma;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    public MaterialTexto() {}

    public MaterialTexto(String signatura, LocalDate fechaCompra, boolean restringido, String tema, String titulo, String nombreAutor, LocalDate fechaPublicacion, int numeroPaginas, String idioma) {
        this.signatura = signatura;
        this.fechaCompra = fechaCompra;
        this.restringido = restringido;
        this.tema = tema;
        this.titulo = titulo;
        this.nombreAutor = nombreAutor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.idioma = idioma;
    }
    public MaterialTexto (String sourceLines) { //EN EL CONSTRUCTOR SE INICIALIZAN LAS VARIABLES DEL OBJETO
        String[] datos = sourceLines.split(",");
        this.signatura = datos[0];
        this.fechaCompra = LocalDate.parse(datos[1]);
        this.restringido = Boolean.parseBoolean(datos[2]);
        this.tema = datos[3];
        this.titulo = datos[4];
        this.nombreAutor = datos[5];
        this.fechaPublicacion = LocalDate.parse(datos[6]);
        this.numeroPaginas = Integer.parseInt(datos[7]);
        this.idioma = datos[8];
    }

    @Override
    public String toString() {
        return "MaterialTexto{" +
                "titulo='" + titulo + '\'' +
                ", nombreAutor='" + nombreAutor + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", numeroPaginas=" + numeroPaginas +
                ", idioma='" + idioma + '\'' +
                ", signatura='" + signatura + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        //               "123    ,       2020-11-11       ,          false         ,    ciencias"
        return this.signatura + "," + this.fechaCompra + "," + this.restringido + "," + this.tema + ","+ this.titulo + "," + this.nombreAutor + "," + this.fechaPublicacion + "," + this.numeroPaginas + ","+this.idioma;
    }


}
