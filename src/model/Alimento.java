package model;
public class Alimento {
    private String name;
    private int toneladasDesperdicio;


    public Alimento(String name, int toneladasDisperdicio) {
        this.name = name;
        this.toneladasDesperdicio = toneladasDisperdicio;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setToneladasDisperdicio(int toneladasDisperdicio) {
        this.toneladasDesperdicio = toneladasDisperdicio;
    }


    public int getDisperdicio() {
        return toneladasDesperdicio;

    }
}
