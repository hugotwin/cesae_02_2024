package Exercicio4;

import static Exercicio4.FileManager.getFileManager;

public class Main {


    public static void main(String[] args) {

        FileManager fileManager = getFileManager();



        fileManager.createFile("tesxt.txt");

    }
}
