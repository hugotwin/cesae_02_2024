package Exercicio2;

public class Tacofactory {

    public static Taco createTaco(String type){

        switch (type){

            case "vaca":
                return new TacoVaca();

            case "frango":
                return new TacoFrango();

            case "vegetariano":
                return new TacoVegetariano();

            default:
                throw new IllegalArgumentException("Tipo de produto invalido "+type);




        }



    }


}
