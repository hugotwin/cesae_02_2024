package livro;

public class Livro {

private String autor;
private String categoria;
private int numeroPaginas;

private String isbn;
// deve se colocar todas os atributos no construtor senao tem-se que incializar com alguma coisa nem que seja vazio


    // deve-se criar sempe o construtor nem que seja vazio
public Livro(String
                     autor, String categoria, int numeropaginas, String isbn)
{
    this.autor = autor;
    this.categoria= categoria;
    this.numeroPaginas= numeropaginas;
    this.isbn = isbn;
}

public String exibirAtributos(){

    return "autor : "+this.autor+"\n" +
            "Categoria : "+this.categoria+"\n" +
            "numero paginas : "+this.numeroPaginas+"\n" +
            "ISBN : "+this.isbn;


}





}
