package ex02_Part02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IO;
import java.io.IOException;
import java.util.StringTokenizer;

public class Lab18File_Read_Token {
    public static void main(String[] args) {
        String filePath = "Path/to/file.txt"; // change your file path

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
             String line;
             while ((line = reader.readLine()) != null) {
                 tokenizeLine(line);
             }
        } catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(reader != null)reader.close();

            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }
    private static void tokenizeLine(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line,",.!?");

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

}

