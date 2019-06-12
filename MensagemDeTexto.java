public class MensagemDeTexto implements Mensagem{
    private String texto;
    
    public MensagemDeTexto(String umTexto){
        texto = umTexto;
    }
    
    public String getMsg(){
        return(texto);
    }
  }
  