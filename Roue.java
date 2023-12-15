public class Roue {
    private int largeur;
    private int diametreJante;

    public Roue(int largeur, int diametreJante) {
        this.largeur = largeur;
        this.diametreJante = diametreJante;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getDiametreJante() {
        return diametreJante;
    }

    public void setDiametreJante(int diametreJante) {
        this.diametreJante = diametreJante;
    }

    public String toString() {
        return " lergeur " + this.largeur + " diametre " + this.diametreJante;
    }

}
