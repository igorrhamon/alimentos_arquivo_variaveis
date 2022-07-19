package model;
public class Desperdicio {
    private int toneladasDesperdicio;

    public Desperdicio(int toneladasDesperdicio) {
        this.toneladasDesperdicio = toneladasDesperdicio;
    }

    public int getToneladasDesperdicio() {
        return toneladasDesperdicio;
    }

    public void setToneladasDesperdicio(int toneladasDesperdicio) {
        this.toneladasDesperdicio = toneladasDesperdicio;
    }

    @Override
    public String toString() {
        return "Desperdicio [toneladasDesperdicio=" + toneladasDesperdicio + "]";
    }

    public void setDesperdicio(int toneladas) {
        this.toneladasDesperdicio = toneladas;
    }
    
}
