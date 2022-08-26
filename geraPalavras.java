package visao;

import java.util.Random;
import java.util.Scanner;
class Main {  
  public static void main(String args[]) { 
          Random caracter = new Random();
    String senha = "aaaaa";
    int i = 0;
    //char a, b, c, d, e, f, g, h;
       String senhaa = new String("Rutin");
    while(!senha.equals(senhaa)){  
          char a = (char) (caracter.nextInt(26) + 'a');
       
          char b = (char) (caracter.nextInt(26) + 'a');
      
          char c = (char) (caracter.nextInt(26) + 'a');
     
          char d = (char) (caracter.nextInt(26) + 'a');
       
          char e = (char) (caracter.nextInt(26) + 'a');
             
         // char f = (char) (caracter.nextInt(26) + 'a');
              
          //char g = (char) (caracter.nextInt(26) + 'a');
             
         // char h = (char) (caracter.nextInt(26) + 'a');

         
          String aa = String.valueOf(a);
          String bb = String.valueOf(b);
          String cc = String.valueOf(c);
          String dd = String.valueOf(d);
          String ee = String.valueOf(e);
          //String ff = String.valueOf(f);
         // String gg = String.valueOf(g);
          //String hh = String.valueOf(h);  
          senha = (aa+bb+cc+dd+ee);
          System.out.println(senha);
          i++;
          
        }
    System.out.println(i + " Tentativas depois");
    System.out.println("Sua senha descoberta é: "+ senha);
  }
}
