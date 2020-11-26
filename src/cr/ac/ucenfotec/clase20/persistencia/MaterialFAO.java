package cr.ac.ucenfotec.clase20.persistencia;

import cr.ac.ucenfotec.clase20.entidades.Material;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class MaterialFAO {

    //HACER ESTA CLASE ABSTRACTA Y PONERLE LOS METODOS DE SALVAR, LISTAR Y CREAR. ASÍ SE VAN A PODER USAR LOS DIFERENTES TIPOS DE MATERIALES
/*
    public void save(Material nuevoMaterial) {
        //Path path = Paths.get("c:\\dev\\listOfMaterial.csv");
            ArrayList<String> lines = new ArrayList<>();
            lines.add(nuevoMaterial.toCSVLine());
        try {
            Files.write(Paths.get("c:\\dev\\listOfMaterial.csv"),lines,StandardCharsets.UTF_8,StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public List<Material> getAll(){
        ArrayList<Material> result = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("c:\\dev\\listOfMaterial.csv"));
            String currentLine = reader.readLine();
            while (currentLine != null) {
                result.add(new Material(currentLine));
                currentLine = reader.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
*/
}
