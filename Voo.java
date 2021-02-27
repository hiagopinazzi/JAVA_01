public class Voo{

    private int Voo, i;
    private String Data;
    private Passageiro[] passageiros = new Passageiro[100];

    Voo(int Voo, String Data){

        this.Voo = Voo;
        this.Data = Data;
    }
    
    public int getVoo(){return Voo;}
    public String getData(){return Data;}
    public Passageiro[] getPassageiros(){return this.passageiros;}

    public Passageiro[] getPassageirosBusiness(){

        Passageiro[] passageiros_Business = new Passageiro[100];
        int j;

        for(i = 0, j = 0; i < 100; i++)
        if(passageiros[i] != null && passageiros[i].isBusiness()){

            passageiros_Business[j] = passageiros[i];
            j++;
        }

        return passageiros_Business;
    }

    public int proximoLivre(){

        int i = 0;
        for(i = 0; this.passageiros[i] != null; i++);
        return i + 1;
    }

    public boolean verifica(int i){

        if(this.passageiros[i] != null) return true;
        else return false;
    }

    public boolean ocupa(int Numero, Passageiro passageiro){

        if(this.passageiros[Numero] != null)
        return false;
        else{
            
            this.passageiros[Numero] = passageiro;
            return true;
        }
    }

    public int vagas(){

        int i, Vagas_Livres = 0;

        for(i = 0; i < 100; i++)
            if(this.passageiros[i] != null)
                Vagas_Livres++;
        return 100 - Vagas_Livres;
    }
}