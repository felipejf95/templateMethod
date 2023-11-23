public abstract class Equipe {

    String treinador;
    String equipe;


    public String getTreinador() {
        return treinador;
    }

    public void setTreinador(String treinador) {
        this.treinador = treinador;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public abstract String treinarEquipe();
    public String getTipo() {
        return "Equipe profissional";
    }

    public String getInfo(){
        return this.equipe + "{" +
                "Treinador: " + this.treinador +
                " " + getTipo();

    }

}
