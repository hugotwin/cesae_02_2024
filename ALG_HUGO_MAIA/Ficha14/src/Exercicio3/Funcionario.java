package Exercicio3;

public class Funcionario extends Pessoa{

private TiposFuncao tipoFuncao;


    public Funcionario(String nome, int anoNascimento, String email, String telemovel, TiposFuncao tipoFuncao) {
        super(nome, anoNascimento, email, telemovel);
        this.tipoFuncao = tipoFuncao;
    }


    @Override
    public String obterFuncao() {

        String funcao = this.tipoFuncao.toString();
        return funcao;
    }

    @Override
    public void imprimirHorario() {

    }


}
