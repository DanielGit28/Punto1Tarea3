package cr.ac.ucenfotec.clase20.gestor;


import cr.ac.ucenfotec.clase20.entidades.*;
import cr.ac.ucenfotec.clase20.entidades.enums.TipoMaterial;
import cr.ac.ucenfotec.clase20.persistencia.MaterialFAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MaterialGestor {
/*
    private AudioDAO audioDao = new AudioDAO();
    private TextoDAO textoDAO = new TextoDAO();
    private VideoDAO videoDAO = new VideoDAO();
    private OtroDAO otroDAO = new OtroDAO();


    public boolean guardar(Material nuevoMaterial){
        try{
            MaterialDAO objPersistente = determinarObjetoDAO(nuevoMaterial);
            return objPersistente.save(nuevoMaterial);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }

    public List<Material> listAll(TipoMaterial tipoMaterial) {
        try{
            MaterialDAO objPersistente = determinarObjetoDAO(tipoMaterial);
            return objPersistente.findAll();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<Material>();
    }

    private MaterialDAO determinarObjetoDAO(Material nuevoMaterial) throws Exception {
        if (nuevoMaterial instanceof MaterialAudio) {
            return this.audioDao;
        }
        if (nuevoMaterial instanceof MaterialVideo) {
            return this.videoDAO;
        }
        if (nuevoMaterial instanceof MaterialTexto) {
            return this.textoDAO;
        }
        if (nuevoMaterial instanceof OtroMaterial) {
            return this.otroDAO;
        }
        throw new Exception("Tipo de Material Desconocido");
    }

    private MaterialDAO determinarObjetoDAO(TipoMaterial tipo) throws Exception {
        if (TipoMaterial.AUDIO.equals(tipo)) {
            return this.audioDao;
        }
        if (TipoMaterial.VIDEO.equals(tipo)) {
            return this.videoDAO;
        }
        if (TipoMaterial.TEXTO.equals(tipo)) {
            return this.textoDAO;
        }
        throw new Exception("Tipo de Material Desconocido");
    }
*/
}
