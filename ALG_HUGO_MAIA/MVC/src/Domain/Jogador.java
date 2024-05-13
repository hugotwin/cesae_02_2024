package Domain;

public class Jogador {
    private int number;
    private String name;
    private int age;
    private String nationality;
    private int defenseRanking;
    private int attackRanking;
    private double buyValue;

    public Jogador(int number, String name, int age, String nationality, int defenseRanking, int attackRanking, double buyValue) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
        this.defenseRanking = defenseRanking;
        this.attackRanking = attackRanking;
        this.buyValue = buyValue;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public int getDefenseRanking() {
        return defenseRanking;
    }

    public int getAttackRanking() {
        return attackRanking;
    }

    public double getBuyValue() {
        return buyValue;
    }
}
