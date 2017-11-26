package exercicio1;
public class DiaDosNamorados extends CartaoWeb{
    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }
    @Override
    public String retornarMensagem(String remetente) {
        String mensagem = "Feliz dias do namorados, " + this.destinatario
                        + "\n Te amo muito e quero estar sempre contigo! \n"
                        + "Com amor, " + remetente;
        return mensagem;
    }
}
