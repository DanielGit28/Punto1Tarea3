package cr.ac.ucenfotec.clase20.entidades;

public class Estudiante extends Usuario{
    private String carrera;
    private int numeroCreditos;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }
    public Estudiante(){}

    public Estudiante(String nombre, String apellido, String id, String carrera, int numeroCreditos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.carrera = carrera;
        this.numeroCreditos = numeroCreditos;
    }
    public Estudiante (String sourceLines) {//EN EL CONSTRUCTOR SE INICIALIZAN LAS VARIABLES DEL OBJETO
        String[] datos = sourceLines.split(",");
        this.nombre = datos[0];
        this.apellido = datos[1];
        this.id = datos[2];
        this.carrera = datos[3];
        this.numeroCreditos = Integer.parseInt(datos[4]);
    }
    @Override
    public String toString() {
        return "Estudiante{" +
                "carrera='" + carrera + '\'' +
                ", numeroCreditos=" + numeroCreditos +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public String toCSVLine() {
        return this.nombre + "," + this.apellido + "," + this.id + "," + this.carrera + ","+ this.numeroCreditos;
    }
}
