package service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import model.Alimento;

public class AddAlimento {
    List<Alimento> alimentos = new ArrayList<>();

    public AddAlimento(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }


    public void addAlimentoFromStream(Stream<String> lines) {
        
        lines.forEach(line -> {
            if (!line.contains("desperdicio")){
                String[] split = line.split("=");
                Alimento alimento = new Alimento(split[0], Integer.parseInt(split[1]));
                alimentos.add(alimento);
            }
        });
        
    }

    public List<Alimento> getAlimentos() {
        return alimentos;
    }


    public void addAlimento(List<String> lines) {
        addAlimentoFromStream(lines.stream());
    }

}
