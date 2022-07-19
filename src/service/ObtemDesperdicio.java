package service;

import java.util.stream.Stream;

import model.Desperdicio;

public class ObtemDesperdicio {
    Desperdicio desperdicio = new Desperdicio(0);

    public ObtemDesperdicio(Desperdicio desperdicio) {
        this.desperdicio = desperdicio;
    }


    public void addDesperdicioFromStream(Stream<String> lines) {
        
        lines.forEach(line -> {
            if (line.contains("desperdicio")){
                String[] split = line.split("=");
                desperdicio.setDesperdicio(Integer.parseInt(split[1]));
            }
        });
        
    }
}
