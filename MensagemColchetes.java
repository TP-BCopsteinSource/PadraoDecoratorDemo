public class MensagemColchetes implements Mensagem{
    private Mensagem mensagem;
    
    public MensagemColchetes(Mensagem umaMensagem){
        mensagem = umaMensagem;
    }
    
    public String getMsg(){
        String aux = "[[[ ";
        aux += mensagem.getMsg();
        aux += " ]]]";
        return(aux);
    }
}
