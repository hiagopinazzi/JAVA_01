public abstract class Passageiro {
  
    private String Nome;
    private String CPF;

    public Passageiro(String Nome, String CPF){
     
        this.Nome = Nome;
        this.CPF = CPF;
    }

    public String getNome(){return this.Nome;}
    public String getCPF(){return this.CPF;}

    public abstract boolean isBusiness();
}
