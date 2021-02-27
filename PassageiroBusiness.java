public class PassageiroBusiness extends Passageiro{
    
    PassageiroBusiness(String Nome, String CPF){super(Nome, CPF);}
    public boolean isBusiness(){return true;}
}
