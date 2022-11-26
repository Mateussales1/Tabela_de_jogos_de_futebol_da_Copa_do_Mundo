package copa;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main (String [] args){
    Scanner leitura;
    leitura = new Scanner(System.in);


    ArrayList<Selecao> selecoes = new ArrayList<Selecao>();
    ArrayList<Copa> copas = new ArrayList<Copa>();


        Copa dadosCopa = new Copa();

        Selecao dados = new Selecao();

        System.out.println("Digite o nome da Seleção");
            dados.setNome(leitura.next());

        System.out.println("Digite o numero de jogos");
        dados.setJogos(leitura.nextInt());

        System.out.println("Digite o numero de vitorias");
        dados.setVitorias(leitura.nextInt());

        System.out.println("Digite o numero de empates");
        dados.setEmpates(leitura.nextInt());

        System.out.println("Digite o numero de derrotas");
        dados.setDerrotas(leitura.nextInt());

        System.out.println("Digite o numero de gols a favor");
        dados.setGolFavor(leitura.nextInt());

        System.out.println("Digite o numero de gols contra");
        dados.setGolContra(leitura.nextInt());

        //adiciona no arrayList
        selecoes.add(dados);

        System.out.println("deseja continuar cadastrando seleções para essa copa?");


        dadosCopa.setSelecoes(selecoes);
        copas.add(dadosCopa);

        System.out.println("cadastrar outra copa?");


}
}