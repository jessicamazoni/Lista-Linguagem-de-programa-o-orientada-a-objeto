package exercicio2;
import javax.swing.JOptionPane;

public class EmpregadoTeste {
    public static void main(String[] args) {     
        
        String nome = JOptionPane.showInputDialog ("Qual o nome:");
        String sexo = JOptionPane.showInputDialog ("Qual o sexo: ");
	int idade = Integer.parseInt (JOptionPane.showInputDialog ("Qual a idade: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog ("Qual a altura: "));
        double salario = Double.parseDouble (JOptionPane.showInputDialog ("Qual o salário: "));
        
        Empregado teste = new Empregado (salario, nome, idade, altura, sexo);
        
        JOptionPane.showMessageDialog(null, "Nome: " + nome +"\n" + "Sexo: "+ sexo +"\n" + "Idade: " + idade +"\n" + "Altura: " + altura +"\n" + "Salario: "+ salario);
    }  
}

