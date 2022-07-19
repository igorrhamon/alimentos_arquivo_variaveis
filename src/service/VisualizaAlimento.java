package service;

import java.util.ArrayList;
import java.util.List;

import model.Alimento;

public class VisualizaAlimento {
    List<Alimento> alimentos = new ArrayList<>();

    public VisualizaAlimento(List<Alimento> alimentos) {
        this.alimentos = alimentos;
    }

    public void visualizaAlimento() {
        alimentos.forEach(alimento -> {
            System.out.println(alimento.getName() + " - " + alimento.getDisperdicio());
        });
    }
    
}
