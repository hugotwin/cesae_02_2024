package Exercicio3;

public class DocumentFactory {


    public static Document createDocument(String autor, String name, String tipoDocumento){

        switch (tipoDocumento) {
            case "texto":

                return new DocumentTexto(autor, name, tipoDocumento);
            case "folha calculo":
                return new DocumentCalculo(autor, name, tipoDocumento);

            case "apresentação":
                return new DocumentApresentacao(autor, name, tipoDocumento);

            default:

                throw new  IllegalArgumentException("argumento mal enserido ");

        }


    }




}
