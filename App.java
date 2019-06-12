public class App{
    public static void main(String args[]){
        MensagemDeTexto mt = new MensagemDeTexto("Aviso urgente");
        MensagemMoldura mm = new MensagemMoldura(mt);
        MensagemColchetes mc = new MensagemColchetes(mm);
        System.out.println(mt.getMsg());
        System.out.println(mm.getMsg());
        System.out.println(mc.getMsg());
    }
  }
  