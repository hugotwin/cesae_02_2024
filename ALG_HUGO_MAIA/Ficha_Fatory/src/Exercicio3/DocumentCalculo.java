package Exercicio3;

public class DocumentCalculo extends Document{


    public DocumentCalculo(String autor, String nome, String extensao) {
        super(autor, nome, extensao);



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
