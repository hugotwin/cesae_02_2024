import Exerc_1.Pessoa;
import aluno.Aluno;
import calculadora.Calculadora;
import livro.Livro;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("hugo", 43, 1.63);

        //System.out.println(pessoa.getNome);
        //System.out.println(pessoa.getIdade);
        //System.out.println(pessoa.getAltura);

        Cao cao = new Cao("bobi", "poodle");

        //System.out.println(cao.getLatido());
        //cao.setLatido("baubau");
        //System.out.println(cao.getLatido());

        Rectangulo rectangulo = new Rectangulo(5,2);

        //System.out.println(rectangulo.area());
        //System.out.println(rectangulo.perimetro());

        circulo circulo = new circulo(3);

        //System.out.println(circulo.circun());
        //System.out.println(circulo.area());

        //Carro carro = new Carro("volkswagen", "golf", 1995);

        //System.out.println(carro.ligar());

        //Calculadora calc = new Calculadora();

        //System.out.println(calc.multip(2,3));

        //Livro livro1 = new Livro("hugo maia", "aventura",300, "dfhjfjd");
        //Livro livro2 = new Livro("tiago maia", "accao",360, "dfkjfdfhsdh");

        //System.out.println(livro1.exibirAtributos());
        //System.out.println(livro2.exibirAtributos());

        Aluno aluno = new Aluno("hugo", "mecanica", 10);

        System.out.println(aluno.aprovado());

        aluno.setMedia(5);
        System.out.println(aluno.aprovado());



    }




}