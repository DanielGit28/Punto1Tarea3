package cr.ac.ucenfotec.clase20.entidades;

import java.time.LocalDate;

public class OtroMaterial extends Material{
    private String descripción;

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    public OtroMaterial(){}

    @Override
    public String toCSVLine() {
        return this.signatura + "," + this.fechaCompra + "," + this.restringido + "," + this.tema + ","+ this.descripción;
    }

    public OtroMaterial(String signatura, LocalDate fechaCompra, boolean restringido, String tema, String descripción) {
        this.signatura = signatura;
        this.fechaCompra = fechaCompra;
        this.restringido = restringido;
        this.tema = tema;
        this.descripción = descripción;
    }

    public OtroMaterial(String sourceLines) {
        String[] datos = sourceLines.split(",");
        this.signatura = datos[0];
        this.fechaCompra = LocalDate.parse(datos[1]);
        this.restringido = Boolean.parseBoolean(datos[2]);
        this.tema = datos[3];
        this.descripción = datos[4];
    }

    @Override
    public String toString() {
        return "OtroMaterial{" +
                "descripción='" + descripción + '\'' +
                ", signatura='" + signatura + '\'' +
                ", fechaCompra=" + fechaCompra +
                ", restringido=" + restringido +
                ", tema='" + tema + '\'' +
                '}';
    }
}
