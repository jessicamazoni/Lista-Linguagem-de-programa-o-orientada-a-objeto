package exercicio1;
import javax.swing.JOptionPane;
public class Principal {
    static CartaoWeb[] cartoes;
    public static void main(String[] args) {
        cartoes = new CartaoWeb[3];
        DiaDosNamorados cartao1 = new DiaDosNamorados("Amanda!");
        cartoes [0] = cartao1;
        Natal cartao2 = new Natal("Paulo!");
        cartoes[1] = cartao2;
        Aniversario cartao3 = new Aniversario("Fernando!");
        cartoes[2] = cartao3;
        for (CartaoWeb cartao : cartoes) {
            JOptionPane.showMessageDialog(null, cartao.retornarMensagem("Jéssica."));
        }
	}

}