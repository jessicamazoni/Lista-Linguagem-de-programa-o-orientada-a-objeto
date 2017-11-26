package exercicio1;
import javax.swing.JOptionPane;
public class CockerTeste {
    public static void main(String[] args) {
        int opcao;
        boolean tosa = false;
        
        String cor = JOptionPane.showInputDialog("Qual a cor?");
        String tipo = JOptionPane.showInputDialog ("Qual o tipo?");
        String nome = JOptionPane.showInputDialog("Qual o nome?");
        String raca = JOptionPane.showInputDialog("Qual a raça?");
        opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Precisa tosar \n 2 - Não precisa tosar"));
        switch (opcao) {
            case 1:
                tosa = true;
                break;
            case 2:
                tosa = false;
                break;
        }
        Cocker teste = new Cocker (tosa, cor, tipo, nome, raca);
        JOptionPane.showMessageDialog(null, "Cor "+ cor +"\n" +  "Tipo: "+ tipo +"\n" +  "Nome: "+ nome +"\n" + "Raça: "+ raca +"\n" +  "Precisa tosar? "+ tosa);       
    }
    
}