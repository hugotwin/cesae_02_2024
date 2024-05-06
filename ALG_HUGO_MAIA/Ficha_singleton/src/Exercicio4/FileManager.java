package Exercicio4;

import java.io.File;

public class FileManager {

   private static FileManager fileManager;
   private String root="";


    private  FileManager() {
    }


    public static FileManager getFileManager(){

        if(fileManager==null)
        {
            fileManager = new FileManager();
        }
        return fileManager;
    }

    public void createFile(String nome){

        File file = new File(this.root+nome);
        try{
        file.createNewFile();}catch (Exception ignored){

        }



    }

    public void deleteFile(String nome) {
        File file = new File(this.root+nome);
        try{
            file.delete();}catch (Exception ignored){

        }
    }

    public void setRoot(String root) {
        this.root = root;
    }
}
