package cr.ac.ucenfotec.clase20.entidades;

import cr.ac.ucenfotec.clase20.interfaces.SerializacionCSV;

import java.time.LocalDate;
import java.util.List;

public abstract class Material implements SerializacionCSV {

    protected String signatura;
    protected LocalDate fechaCompra;
    protected boolean restringido;
    protected String tema;


    public String getSignatura() {
        return signatura;
    }

    public void setSignatura(String signatura) {
        this.signatura = signatura;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isRestringido() {
        return restringido;
    }

    public void setRestringido(boolean restringido) {
        this.restringido = restringido;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }


}
