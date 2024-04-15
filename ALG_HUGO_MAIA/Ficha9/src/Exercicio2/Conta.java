package Exercicio2;

public class Conta {



    private int numero_conta=(int) Math.random()*1000 ;
    private double saldo =0;
    private  String titular;

    private int ano_conta=2023;
    private double margem_emprestimo=0;
    private double divida;
    private double percentagem_emprestimo =0.9;


    public Conta(String nome)
    {
        this.titular = nome;

    }
    public Conta(String nome, double saldo)
    {
        this.titular= nome;
        this.saldo = saldo;
        this.margem_emprestimo= saldo*this.percentagem_emprestimo;
    }



    /**
     * Funcao que faz a transferencia de uma conta para outra
     * @param valor  em transferencia em euros
     * @param conta para onde sera transferido o valor
     * @return
     */
    public String transferencia(double valor,Conta conta)
    {
        String dados ="";

        if (this.verificarSaldo(valor))
        {
            this.diminuirSaldo(valor);
            conta.aumentarSaldo(valor);
        }
        else
        {
            dados= "Saldo insuficiente";}
        return dados;
    }


    /**
     * Funcao que aumenta o saldo
     * @param valor em euros
     */
    public void aumentarSaldo(double valor)
    {
        this.saldo+=valor;
        this.setMargem_emprestimo();

    }


    /**
     * Funcao que diminui saldo
     * @param valor
     */
    public void diminuirSaldo(double valor)

    {

        if(this.verificarSaldo(valor) )
        {
            this.saldo-=valor;
            this.setMargem_emprestimo();
        }



    }


    /**
     * Funcao verifica saldo
     * @returnum uma string que retorna os dados da conta
     */
    public String exibirDados(){

        String dados = "Nome titular : "+this.titular+"" +
                "\nNumero comta : "+this.numero_conta+"" +
                "\nSaldo : "+this.saldo;
        return dados;

    }



    /**
     * funcao que faz a verificacao do saldo
     * @param valor de entrada que deseja comparar com o saldo
     * @return booean com true or false
     */
    public boolean verificarSaldo(double valor)
    {
        if (this.saldo>valor && valor >=0){

            return true;
        }
        return false;

    }


    /**
     * fUNCAO DE DEPOSITAR SALDO
     * @param valor a depositar em euros
     * @return sTRING COM A INDICACAO DE CONFIRMACAO
     */
    public String  depositarSaldo(double valor)
    {

        String dado = "";

        if (valor > 0)
        {
            this.saldo += valor;
            this.setMargem_emprestimo();

            dado = "deposito realizado com sucesso \n" +this.exibirDados();

        }
        else
        {
            dado = "deposito nao realizado com sucesso\n"+this.exibirDados();

        }
        return dado;
    }


    public String levantar(double valor)
    {

        String  dado ="";
        if(this.verificarSaldo(valor))
        {
            this.diminuirSaldo(valor);
            this.setMargem_emprestimo();
            dado ="levantamento realizado";
        }else{dado ="levantamento naõ realizado";}

        return dado +"\n "+ this.exibirDados();
    }

    /**
     * Funcao que defini a margem de emprestimo mediante o saldo
     */
    public void setMargem_emprestimo() {
        this.margem_emprestimo = this.saldo*this.percentagem_emprestimo;
    }


    /**
     * Fucao que avalia o pedido do emprestimo e
      * @param valor_pedido em euros o valor a pedir
     * @return true ou false se foi feito o empremestimo ou nao
     */
    public boolean pedirEmprestimo(double valor_pedido){

        if (this.margem_emprestimo>valor_pedido && this.divida==0){

            this.saldo +=valor_pedido;
            this.divida=valor_pedido;
            return true;
        }
        return false;


    }

    public double getMargem_emprestimo() {
        return margem_emprestimo;
    }

    public double getDivida() {
        return divida;
    }
}
