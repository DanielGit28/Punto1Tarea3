package cr.ac.ucenfotec.clase20.entidades;

import cr.ac.ucenfotec.clase20.entidades.enums.TipoContrato;

import java.time.LocalDate;

public class Profesor extends Usuario{
    private TipoContrato contrato;
    private LocalDate fechaContratacion;


    public TipoContrato getContrato() {
        return contrato;
    }

    public void setContrato(TipoContrato contrato) {
        this.contrato = contrato;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
    public Profesor(){}

    public Profesor(String nombre, String apellido, String id, TipoContrato contrato, LocalDate fechaContratacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.contrato = contrato;
        this.fechaContratacion = fechaContratacion;
    }
    public Profesor (String sourceLines) {//EN EL CONSTRUCTOR SE INICIALIZAN LAS VARIABLES DEL OBJETO
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.id = datos[2];
        this.contrato = TipoContrato.valueOf(datos[3]);
        this.fechaContratacion = LocalDate.parse(datos[4]);
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "contrato=" + contrato +
                ", fechaContratacion=" + fechaContratacion +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return this.nombre + "," + this.apellido + "," + this.id + "," + this.contrato + ","+ this.fechaContratacion;
    }
}
