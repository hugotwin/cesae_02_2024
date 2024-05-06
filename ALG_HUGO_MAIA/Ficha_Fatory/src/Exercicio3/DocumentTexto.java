package Exercicio3;

public class DocumentTexto extends Document{


    public DocumentTexto(String autor, String nome, String tipoFicheiro) {
        super(autor, nome, tipoFicheiro);


    }

    @Override
    public void open() {

        System.out.println("A abrir documento");
        System.out.println(super.autor+super.extensao);

    }

    @Override
    public void save() {
        System.out.println("A guardar documento pelo autor "+super.autor);

    }

    @Override
    public void close() {

        System.out.println("A fechar documento");

    }
}
