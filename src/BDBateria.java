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

public class BDBateria {

    private List<Bateria> bdBat;
    private static BDBateria BDBateriaBat;

    private BDBateria() {
        bdBat = new ArrayList<Bateria>();
    }

    public static BDBateria getBDBateria() {
        if (BDBateriaBat == null) {
            BDBateriaBat = new BDBateria();
        }
        return BDBateriaBat;
    }

    public List<Bateria> getBdBat() {
        return bdBat;
    }

    public void impAllBat() {
        for (int i = 0; i < bdBat.size(); i++) {
            System.out.println(
                "Id da bateria: " + bdBat.get(i).getIdBat() +
                " Nome do instrumento: " + bdBat.get(i).getNome() +
                " Quantidade de cordas: " + bdBat.get(i).getQtdDeCordas() +
                " Quantidade de tons: " + bdBat.get(i).getQtdDeTons() +
                " Tipo de bumbo: " + bdBat.get(i).getTipoDeBumbo()
            );
        }
    }

    public Bateria cadBateria(Bateria ba) {
        if (consBatId(ba) == null) {
            bdBat.add(ba);
            return ba;
        }
        return null;
    }

    public Bateria consBatId(Bateria ba) {
        for (int i = 0; i < bdBat.size(); i++) {
            if (ba.getIdBat() == bdBat.get(i).getIdBat()) {
                return bdBat.get(i);
            }
        }
        return null;
    }
    
    public Bateria altBatId(Bateria ba) {
        for (int i = 0; i < bdBat.size(); i++) {
            if (ba.getIdBat() == bdBat.get(i).getIdBat()) {

                String nQuantidadeTonsStr = JOptionPane.showInputDialog(
                    null,
                    "NOVA QUANTIDADE DE TONS",
                    "ATUALIZAR QUANTIDADE DE TONS",
                    JOptionPane.PLAIN_MESSAGE
                );

                String nTipoBumboStr = JOptionPane.showInputDialog(
                    null,
                    "NOVO TIPO DE BUMBO",
                    "ATUALIZAR TIPO DE BUMBO",
                    JOptionPane.PLAIN_MESSAGE
                );

                int nQuantidadeTons = Integer.parseInt(nQuantidadeTonsStr);
                ba.setQtdDeTons(nQuantidadeTons);

                ba.setTipoDeBumbo(nTipoBumboStr);

                bdBat.set(i, ba);
                return bdBat.get(i);
            }
        }
        return null;
    }
    
    public static Bateria delBatIdBat(Bateria ba) {
        List<Bateria> bdBat = getBDBateria().getBdBat();
        for (int i = 0; i < bdBat.size(); i++) {
            if (ba.getIdBat() == bdBat.get(i).getIdBat()) {
                bdBat.remove(i);
                return null;
            }
        }
        return ba;
    }
} 