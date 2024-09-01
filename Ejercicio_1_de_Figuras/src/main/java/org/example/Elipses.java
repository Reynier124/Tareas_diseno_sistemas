package org.example;

public abstract class Elipses {

    private String semiejes;

    public Elipses(String semiejes) {
        this.semiejes = semiejes;
    }

    public Elipses() {
    }

    public String getSemiejes() {
        return semiejes;
    }

    public void setSemiejes(String semiejes) {
        this.semiejes = semiejes;
    }

}
