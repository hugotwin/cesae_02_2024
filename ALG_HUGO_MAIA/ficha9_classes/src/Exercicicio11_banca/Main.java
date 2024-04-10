package Exercicicio11_banca;

public class Main {
    public static void main(String[] args) {

        Conta conta1= new Conta("Hugo Maia");
        Conta conta2= new Conta("tiago", 54);
        Conta conta3= new Conta("manuel", 54);
        System.out.println(conta1.depositarSaldo(1000));
        System.out.println(conta1.exibirDados());
        System.out.println(conta1.levantar(120));


        System.out.println(conta1.transferencia(300, conta2));
        System.out.println("");
        System.out.println(conta1.exibirDados());
        System.out.println("");
        System.out.println(conta2.exibirDados());
        System.out.println("");
        System.out.println(conta3.exibirDados());





    }




}
