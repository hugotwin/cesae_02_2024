package Exercicio10Funcionario;

public class Funcionario {

    private String nome ;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento)
    {
        this.nome=nome;
        this.salario= salario;
        this.departamento=departamento;

    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    /**
     * Funcao de aumento de salario perante uma percentagem
     * @param aumento percentagem de aumento de salario
     */
    public String aumentarSalrio(double aumento)
    {
        String dado;
        if (aumento>0 && aumento <=1)
        {
            double aumento_valor = aumento*this.salario;
            this.salario=this.salario+aumento_valor;

            dado = "salario actualizado";

        }else{

            dado="valor de percentagem de aumento invalido valor percentual de  0 a 1 ";
        }

        return dado;

    }

    public String exibirdados()
    {
        String dados;
        dados = "Nome : "+this.nome+"" +
                "\n Departamento : "+this.departamento+"" +
                "\n Salario : "+this.salario;

        return dados;
    }



}
