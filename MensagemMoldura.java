public class MensagemMoldura implements Mensagem{
    private Mensagem mensagem;
    
    public MensagemMoldura(Mensagem umaMensagem){
        mensagem = umaMensagem;
    }
    
    public String getMsg(){
        String aux = "<<< ";
        aux += mensagem.getMsg();
        aux += " >>>";
        return(aux);
    }
}
