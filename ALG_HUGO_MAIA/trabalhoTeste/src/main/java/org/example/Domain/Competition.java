package org.example.Domain;

public class Competition {
    private String date;
    private String competition;
    private String adversary;
    private int ourGoals;
    private int theirGoals;

    public Competition(String date, String competition, String adversary, int ourGoals, int theirGoals) {
        this.date = date;
        this.competition = competition;
        this.adversary = adversary;
        this.ourGoals = ourGoals;
        this.theirGoals = theirGoals;
    }

    public void showDetails(){
        System.out.println("⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽");
        System.out.println("Date: " + date + " | Competition: " + competition + " | Adversary: " + adversary + " | Our Goals: " + ourGoals + " | Their Goals: " + theirGoals);
        System.out.println("⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽⚽");

    }

    public String getDate() {
        return date;
    }

    public String getCompetition() {
        return competition;
    }

    public String getAdversary() {
        return adversary;
    }

    public int getOurGoals() {
        return ourGoals;
    }

    public int getTheirGoals() {
        return theirGoals;
    }
}