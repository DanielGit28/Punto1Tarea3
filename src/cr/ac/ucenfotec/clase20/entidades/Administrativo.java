package cr.ac.ucenfotec.clase20.entidades;

import cr.ac.ucenfotec.clase20.entidades.enums.TipoNombramiento;

public class Administrativo extends Usuario{
    private TipoNombramiento nombramiento;
    private int cantHorasAsignadas;

    public TipoNombramiento getNombramiento() {
        return nombramiento;
    }

    public void setNombramiento(TipoNombramiento nombramiento) {
        this.nombramiento = nombramiento;
    }

    public int getCantHorasAsignadas() {
        return cantHorasAsignadas;
    }

    public void setCantHorasAsignadas(int cantHorasAsignadas) {
        this.cantHorasAsignadas = cantHorasAsignadas;
    }
    public Administrativo(){}

    public Administrativo(String nombre, String apellido, String id, TipoNombramiento nombramiento, int cantHorasAsignadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.nombramiento = nombramiento;
        this.cantHorasAsignadas = cantHorasAsignadas;
    }
    public Administrativo (String sourceLines) {//EN EL CONSTRUCTOR SE INICIALIZAN LAS VARIABLES DEL OBJETO
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.id = datos[2];
        this.nombramiento = TipoNombramiento.valueOf(datos[3]);
        this.cantHorasAsignadas = Integer.parseInt(datos[4]);
    }

    @Override
    public String toString() {
        return "Administrativo{" +
                "nombramiento=" + nombramiento +
                ", cantHorasAsignadas=" + cantHorasAsignadas +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return this.nombre + "," + this.apellido + "," + this.id + "," + this.nombramiento + ","+ this.cantHorasAsignadas;
    }
}
