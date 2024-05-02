package Exercicio3;

public class Main {
    public static void main(String[] args) {


        UserSessionManager userSessionManager = UserSessionManager.getUserSessionManager();

        System.out.println(userSessionManager.getSessionToken());
        System.out.println(userSessionManager.getLastAcess());






    }




}
