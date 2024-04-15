package produto;

public class Produto {

    private String nome;
    private double preco;
    private int stock = 0;


    /**
     * Construtor para Produto com a entrada do stock
     *
     * @param nome  do produto
     * @param preco valor em euros
     * @param stock quantidade em valores inteiros
     */
    public Produto(String nome, double preco, int stock) {

        this.nome = nome;
        this.preco = preco;
        this.stock = stock;

    }


    /**
     * Construtor para Produto
     *
     * @param nome  do produto
     * @param preco em euros do produto
     */
    public Produto(String nome, double preco) {

        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getStock() {
        return stock;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * Funcao que compara a quantidade que deseja comprar com o stock
     *
     * @param quantidade que deseja comprar
     * @return boolean
     */
    public boolean verificarStock(int quantidade) {

        if (this.stock > quantidade) {

            System.out.println("é possivel fazer a transação");

            return true;

        }
        System.out.println("Não é possivel fazer a transação");
        return false;

    }

    public String venda(int quantidade) {

        String dado;

        if (this.verificarStock(quantidade)) {
            this.stock = this.stock - quantidade;
            dado = "\nFoi feita a transacao";
        } else {
            dado = "\nNão é possivel efectuar a transação";
        }

        return dado;

    }

    public String compra(int quantidade) {

        String dado;

        if (quantidade > 0) {

            this.stock = this.stock + quantidade;
            dado = "\nFoi feita a compra";
        } else {
            dado = "\nNão é possivel efectuar a compra";
        }

        return dado;

    }


}



