public class Voiture {
    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemarre;
    private Roue[] roues = new Roue[4];
    private Roue roueDep;
    private Moteur m;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean isEstDemarre() {
        return estDemarre;
    }

    public void setEstDemarre(boolean estDemarre) {
        this.estDemarre = estDemarre;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public void setRoues(Roue[] roues) {
        this.roues = roues;
    }

    public Roue getRoueDep() {
        return roueDep;
    }

    public void setRoueDep(Roue roueDep) {
        this.roueDep = roueDep;
    }

    public Moteur getM() {
        return m;
    }

    public void setM(Moteur m) {
        this.m = m;
    }

    public Voiture(String modele, String marque, double vitesse, boolean estDemarre, Roue[] roues, String nom,
            int puissance) {
        this.modele = modele;
        this.marque = marque;
        this.vitesse = vitesse;
        this.estDemarre = estDemarre;
        m = new Moteur(nom, puissance, this);
        if (roues.length == 4) {
            this.roues = roues;
        } else {
            System.out.println("Veuillez verifier les renseignement des roues.");
        }
    }

    public String toString() {
        String s = "Voiture :" + this.getMarque() + " " + this.getModele() + " de vitesse " + this.getVitesse();
        for (Roue roues : roues) {
            s += roues.toString();
        }
        return s;
    }

}
