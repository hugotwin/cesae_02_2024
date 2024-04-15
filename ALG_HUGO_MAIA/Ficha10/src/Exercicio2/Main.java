package Exercicio2;

public class Main {

    public static void main(String[] args) {

        Pessoa joao = new Pessoa("joao", 43, "jaoao@",987654321);
        Pessoa paulo = new Pessoa("paulo", 43, "paulo@",987654321);
        Pessoa tiago = new Pessoa("tiago", 43, "paulo@",987654321);
        Pessoa manuel = new Pessoa("manuel", 17, "paulo@",987654321);
        Sorteio sorteio = new Sorteio(3000);
        sorteio.addPessoa(joao);
        sorteio.addPessoa(paulo);
        sorteio.addPessoa(tiago);
        sorteio.addPessoa(manuel);


        System.out.println(sorteio.sortearPremio());




    }
}
