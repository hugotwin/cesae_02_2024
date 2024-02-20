package ExerciciosDiversos;
@FunctionalInterface
interface A {
    int add( int i, int j);

}

public class Lambda {
    public static void main(String[] args) {

        A obj = ((i, j) -> i+j);

        int resul = obj.add(1,2);
        System.out.println(resul);
    }
}
