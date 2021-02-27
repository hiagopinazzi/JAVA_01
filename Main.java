import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Instanciando o voo com suas respectivas configurações
        Voo dados = new Voo(4642,"09-10-2020");

        //Criando um vetor de passageiros
        Passageiro[] lista_Passageiros = new Passageiro[100];
        int i;

        //Instanciando passageiros da classe economy
        lista_Passageiros[0] = new PassageiroEconomy("Ulisses", "2424242424");
        lista_Passageiros[1] = new PassageiroEconomy("Baltazar", "124923823");
        lista_Passageiros[2] = new PassageiroEconomy("Tati", "4967599");
        lista_Passageiros[3] = new PassageiroEconomy("Junim", "00909090990");
        lista_Passageiros[4] = new PassageiroEconomy("O CARA", "2983749725");
        lista_Passageiros[5] = new PassageiroEconomy("tarcisio", "515");
        lista_Passageiros[6] = new PassageiroEconomy("assintota", "45848");
        lista_Passageiros[7] = new PassageiroEconomy("juventino", "12545");
        lista_Passageiros[8] = new PassageiroEconomy("micheli", "15241554");
        lista_Passageiros[9] = new PassageiroEconomy("pedro", "155454451");

        //Instanciando passageiros da classe business
        lista_Passageiros[10] = new PassageiroBusiness("Carol", "2424242424");
        lista_Passageiros[11] = new PassageiroBusiness("Heduarda", "124923823");
        lista_Passageiros[12] = new PassageiroBusiness("O CARA 2", "4967599");
        lista_Passageiros[13] = new PassageiroBusiness("Diego", "00909090990");
        lista_Passageiros[14] = new PassageiroBusiness("Eu", "2983749725");

        //Ocupando os assentos do avião
        for(i = 0; i < 100; i++)
        dados.ocupa(i, lista_Passageiros[i]);

        //Informações do Voo
        System.out.println("VAGAS RESTANTES NO VOO -> "+dados.vagas());
        System.out.println("DATA DO VOO -> "+dados.getData());
        System.out.println("NUMERO DO VOO -> "+dados.getVoo());
        System.out.println("PROXIMA CADEIRA LIVRE -> "+dados.proximoLivre());
        
        //Impressão de todos os passageiros
        Passageiro[] Passageiros = new Passageiro[100];
        Passageiros = dados.getPassageiros();

        ArrayList<Passageiro> Passageiros_List = new ArrayList<Passageiro>();
        for(i = 0; i < 100; i++)
        Passageiros_List.add(Passageiros[i]);

        for(i = 0; i < Passageiros_List.size(); i++){

            if(Passageiros_List.get(i) != null){

                System.out.println("\nPassageiro " + i + ":");
                System.out.println("Nome: " + Passageiros_List.get(i).getNome());
                System.out.println("CPF: " + Passageiros_List.get(i).getCPF());
            }
        }

        //Impressão somente dos passageiros business
        Passageiro[] Passageiros_Business = new Passageiro[100];
        Passageiros_Business = dados.getPassageirosBusiness();

        ArrayList<Passageiro> Passageiros_Business_List = new ArrayList<Passageiro>();
        for(i = 0; i < 100; i++)
        Passageiros_Business_List.add(Passageiros_Business[i]);

        for(i = 0; i < Passageiros_Business_List.size(); i++){

            if(Passageiros_Business_List.get(i) != null){

                System.out.println("\nPassageiro Business " + i + ":");
                System.out.println("Nome: " + Passageiros_Business_List.get(i).getNome());
                System.out.println("CPF: " + Passageiros_Business_List.get(i).getCPF());
            }
        }
    }
}