//Nome: Silvio Jorge de Oliveira -  RA: 2052261

/*
Uso EFETIVO da  Collection List/ArrayList
Que o sistema a utilize List/ArrayList como base de dados;
A(s) Collection(s) deve(m) estar classes em separada(s) a dos Formulários. O(s) nome(s) desta(s) classe(s) deverá(ão) se iniciar com as letras "BD";
Mínima e obrigatoriamente deve conter métodos para as 4 operações básicas na(s) Collection(s): inserção, consulta, alteração e exclusão. 
*/


import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDGuitarra {

    static List<Guitarra> bdGui;
    private static BDGuitarra BDGuitarraGui;

    private BDGuitarra() {
        bdGui = new ArrayList<Guitarra>();
    }

    public static BDGuitarra getBanco() {
        if (BDGuitarraGui == null) {
            BDGuitarraGui = new BDGuitarra();
        }
        return BDGuitarraGui;
    }

    public List<Guitarra> getBdGui() {
        return bdGui;
    }

    public static void impAllGui() {
        for (int i = 0; i < bdGui.size(); i++) {
            System.out.println(
                "Id da guitarra: " + bdGui.get(i).getIdGui()+
                "Nome do instrumento: " + bdGui.get(i).getNome()+
                "Quantidade de cordas" + bdGui.get(i).getQtdDeCordas()+
                "Quantidade de casas: " + bdGui.get(i).getQtdDeCasas() +
                "Tipo alavanca: " + bdGui.get(i).getTipoDeAlavanca()
            );
        }
    }

    public static Guitarra cadGuitarra(Guitarra p) {
        if (consGuiId(p) == null) {
            bdGui.add(p);
            return p;
        }
        return null;
    }

    public static Guitarra consGuiId(Guitarra g) {
        for (int i = 0; i < bdGui.size(); i++) {
            if (g.getIdGui() == bdGui.get(i).getIdGui()) {
                return bdGui.get(i);
            }
        }
        return null;
    }
    
        public static Guitarra altGuitaId(Guitarra g) {
        for (int i = 0; i < bdGui.size(); i++) {
            if (g.getIdGui() == bdGui.get(i).getIdGui()) {

                String nQtdCordasStr = JOptionPane.showInputDialog(
                    null,
                    "NOVA QUANTIDADE DE CORDAS",
                    "ATUALIZAR QUANTIDADE DE CORDAS",
                    1 // ICONE
                );

                String nQtdDeCasasStr = JOptionPane.showInputDialog(
                    null,
                    "NOVA QUANTIDADE DE CASAS",
                    "ATUALIZAR QUANTIDADE DE CASAS",
                    1 // ICONE
                );

                String nTipoDeAlavancaStr = JOptionPane.showInputDialog(
                    null,
                    "NOVO TIPO DE ALAVANCA",
                    "ATUALIZAR TIPO DE ALAVANCA",
                    1 // ICONE
                );

                int nQtdCordas = Integer.parseInt(nQtdCordasStr);
                g.setQtdDeCordas(nQtdCordas);

                int nQtdDeCasas = Integer.parseInt(nQtdDeCasasStr);
                g.setQtdDeCasas(nQtdDeCasas);

                g.setTipoDeAlavanca(nTipoDeAlavancaStr);

                bdGui.set(i, g);
                return bdGui.get(i);
            }
        }
        return null;
    }
        
    public static Guitarra delGuitaIdGui(Guitarra g){
            for(int i = 0; i < bdGui.size(); i++){
                    if(g.getIdGui() == bdGui.get(i).getIdGui()){
                            bdGui.remove(bdGui.get(i));
                            return null;
                    }
            }
            return g;	
    }   
}