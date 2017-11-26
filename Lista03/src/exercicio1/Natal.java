package exercicio1;
    public class Natal extends CartaoWeb{
        public Natal(String destinatario) {
            super(destinatario);
        }
        @Override
        public String retornarMensagem(String remetente) {
            String mensagem ="Feliz natal, " + this.destinatario
                            + "\n Que Deus te abençoes e sua familia seja muito feliz!\n"
                            + "Com carinho, " + remetente;
            return mensagem;
        }
    }

