//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Bateria extends Instrumento {
    
    private int qtdDeTons;
    private String tipoDeBumbo;
    private int idBat;

    public int getIdBat() {
        return idBat;
    }

    public void setIdBat(int idBat) {
        this.idBat = idBat;
    }
    
    public Bateria() {
        qtdDeTons = 0;
        tipoDeBumbo = "";
    }

    public int getQtdDeTons() {
        return qtdDeTons;
    }

    public String getTipoDeBumbo() {
        return tipoDeBumbo;
    }
    
    public void setQtdDeTons(int qtdDeTons){
            this.qtdDeTons = qtdDeTons;
    }
    
    public void setTipoDeBumbo(String tipoDeBumbo) {
        this.tipoDeBumbo = tipoDeBumbo;
    }
}