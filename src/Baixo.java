//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Baixo extends Instrumento implements ColocaZeroEmCor {

    private int idBai;
    private int grossuraDasCordas;
    private int qtdDeCaptadores;

    public Baixo() {
        idBai = 0;
        grossuraDasCordas = 0;
        qtdDeCaptadores = 0;
    }

    public int getIdBai() {
        return idBai;
    }

    public int getGrossuraDasCordas() {
        return grossuraDasCordas;
    }

    public int getQtdDeCaptadores() {
        return qtdDeCaptadores;
    }

    public void setIdBai(int idBai) {
        this.idBai = idBai;
    }

    public void setGrossuraDasCordas(int grossuraDasCordas) {
        this.grossuraDasCordas = grossuraDasCordas;
    }

    public void setQtdDeCaptadores(int qtdDeCaptadores) {
        this.qtdDeCaptadores = qtdDeCaptadores;
    }

    public float ColocaZeroEmCor(int valor) {
        float ret = valor / 100.0f; 
        return ret;
    }
}