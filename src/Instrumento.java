//Nome: Silvio Jorge de Oliveira -  RA: 2052261

public class Instrumento {
    private String nome;
    private int qtdDeCordas;
    
    public Instrumento() {
        nome = "";
        qtdDeCordas = 0;
    }
    
    public Instrumento(String nome, int qtdDeCordas) {
        this.nome = nome;
        this.qtdDeCordas = qtdDeCordas;
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getQtdDeCordas() {
        return qtdDeCordas;
    }

    public void setNome(String nome){
	this.nome = nome;
	}
    
    public void setQtdDeCordas(int qtdDeCordas) {
        this.qtdDeCordas = qtdDeCordas;
    }
}

