//Desenvolvedor: Silvio Jorge de Oliveira

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class BDBaixo {

    private List<Baixo> bdBai;
    private static BDBaixo BDBaixoBai;

    private BDBaixo() {
        bdBai = new ArrayList<Baixo>();
    }

    public static BDBaixo getBDBaixo() {
        if (BDBaixoBai == null) {
            BDBaixoBai = new BDBaixo();
        }
        return BDBaixoBai;
    }

    public List<Baixo> getBdBai() {
        return bdBai;
    }

    public void impAllBai() {
        for (int i = 0; i < bdBai.size(); i++) {
            System.out.println(
                "Id do baixo: " + bdBai.get(i).getIdBai() +
                " Nome do instrumento: " + bdBai.get(i).getNome() +
                " Quantidade de cordas: " + bdBai.get(i).getQtdDeCordas() +
                " Grossura das cordas: " + bdBai.get(i).getGrossuraDasCordas() +
                " Quantidade de captadores: " + bdBai.get(i).getQtdDeCaptadores()
            );
        }
    }

    public Baixo cadBaixo(Baixo b) {
        if (consBaiId(b) == null) {
            bdBai.add(b);
            return b;
        }
        return null;
    }

    public Baixo consBaiId(Baixo b) {
        for (int i = 0; i < bdBai.size(); i++) {
            if (b.getIdBai() == bdBai.get(i).getIdBai()) {
                return bdBai.get(i);
            }
        }
        return null;
    }
    
    public Baixo altBaiId(Baixo b) {
        for (int i = 0; i < bdBai.size(); i++) {
            if (b.getIdBai() == bdBai.get(i).getIdBai()) {

                String nQtdCordasStr = JOptionPane.showInputDialog(
                    null,
                    "NOVA QUANTIDADE DE CORDAS",
                    "ATUALIZAR QUANTIDADE DE CORDAS",
                    JOptionPane.PLAIN_MESSAGE
                );

                String nGrossuraDasCordas = JOptionPane.showInputDialog(
                    null,
                    "NOVA GROSSURA DAS CORDAS",
                    "ATUALIZAR GROSSURA DAS CORDAS",
                    JOptionPane.PLAIN_MESSAGE
                );

                String nQuantidadeDeCapStr = JOptionPane.showInputDialog(
                    null,
                    "NOVA QUANTIDADE DE CAPTADORES",
                    "ATUALIZAR QUANTIDADE DE CAPTADORES",
                    JOptionPane.PLAIN_MESSAGE
                );

                int nQtdCordas = Integer.parseInt(nQtdCordasStr);
                b.setQtdDeCordas(nQtdCordas);

                int nGrossuraCordas = Integer.parseInt(nGrossuraDasCordas);
                b.setGrossuraDasCordas(nGrossuraCordas);

                int nQuantidadeDeCap = Integer.parseInt(nQuantidadeDeCapStr);
                b.setQtdDeCaptadores(nQuantidadeDeCap);

                bdBai.set(i, b);
                return bdBai.get(i);
            }
        }
        return null;
    }
    
    public static Baixo delBaixoIdBai(Baixo b) {
        List<Baixo> bdBai = getBDBaixo().getBdBai();
        for (int i = 0; i < bdBai.size(); i++) {
            if (b.getIdBai() == bdBai.get(i).getIdBai()) {
                bdBai.remove(i);
                return null;
            }
        }
        return b;
    }
     
}
