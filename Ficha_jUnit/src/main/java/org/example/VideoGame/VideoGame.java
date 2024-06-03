package org.example.VideoGame;

import java.util.ArrayList;

class VideoGame {


    private String name;
    private String publisher;
    private double costPrice;
    private double sellingPrice;
    public VideoGame(String name, String publisher, double costPrice, double sellingPrice) {
        this.name = name;
        this.publisher = publisher;
        this.costPrice = costPrice;
        this.sellingPrice = sellingPrice;
    }
    public String getName() {
        return name;
    }
    public String getPublisher() {
        return publisher;
    }
    public double getCostPrice() {
        return costPrice;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
}
class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;
    public GameStore() {
        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }
    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }


    public void sellGame(int index) {
        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(),
                game.getSellingPrice()));
    }
    public void displayStock() {
        System.out.println("Stock:");
        for (VideoGame game : stock) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }
    public void displaySales() {
        System.out.println("Sales:");
        for (VideoGame game : sales) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }
}
