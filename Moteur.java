public class Moteur {
    private String nom;
    private int puissance;
    private Voiture v;

    public Moteur(String nom, int puissance, Voiture v) {
        this.nom = nom;
        this.puissance = puissance;
        this.v = v;
    }

    public Voiture getV() {
        return v;
    }

    public void setV(Voiture v) {
        this.v = v;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

}
