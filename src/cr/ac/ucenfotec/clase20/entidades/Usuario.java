package cr.ac.ucenfotec.clase20.entidades;

import cr.ac.ucenfotec.clase20.interfaces.SerializacionCSV;

public abstract class Usuario implements SerializacionCSV {
    protected String nombre;
    protected String apellido;
    protected String id;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
