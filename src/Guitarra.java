//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Guitarra extends Instrumento{

    private int idGui;
    private int qtdDeCasas;
    private String tipoDeAlavanca;
    
    public Guitarra (){
        idGui = 0;
        qtdDeCasas = 0;
        tipoDeAlavanca = "";
    }
    
    public Guitarra(int idGui, int qtdDeCasas, String tipoDeAlavanca) {
        this.idGui = idGui;
        this.qtdDeCasas = qtdDeCasas;
        this.tipoDeAlavanca = tipoDeAlavanca;
    }
    
    public int getIdGui() {
        return idGui;
    }

    public int getQtdDeCasas() {
        return qtdDeCasas;
    }

    public String getTipoDeAlavanca() {
        return tipoDeAlavanca;
    }
    
    public void setIdGui(int idGui) {
        this.idGui = idGui;
    }

    public void setQtdDeCasas(int qtdDeCasas) {
        this.qtdDeCasas = qtdDeCasas;
    }

    public void setTipoDeAlavanca(String tipoDeAlavanca)  {
        this.tipoDeAlavanca = tipoDeAlavanca;
    }

}
