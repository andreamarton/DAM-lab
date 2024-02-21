import java.util.Scanner;

public class Incapsulare {
    private String nume;
    private int varsta;

    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getVarsta() {
        return varsta;
    }
    public void setVarsta(int varsta) {
        if (varsta >= 0) {
            this.varsta = varsta;
        } else {
            System.out.println("Varsta nu poate fi negativa");
        }
    }
    public static void main(String[] args) {
        Incapsulare person = new Incapsulare();
        person.setNume("Ion al Glanetasului");
        person.setVarsta(25);
        System.out.println("Nume: " + person.getNume());
        System.out.println("Varsta: " + person.getVarsta());
    }
}
