package exercicio1;
public class Aniversario extends CartaoWeb{
    public Aniversario(String destinatario) {
	super(destinatario);
    }
    @Override
    public String retornarMensagem(String remetente) {
        String mensagem = "Feliz aniversario, " + this.destinatario
                        + "\n Que todos os seus desejos se realizem e voce seja muito feliz!\n"
                        + "Com carinho, " + remetente;
        return mensagem;
    }
}