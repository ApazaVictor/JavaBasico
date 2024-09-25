
package javabasico;

import java.util.Scanner;

//Victor Hugo
public class Excepciones {
    public void manejoError(){
        Scanner sc = new Scanner(System.in);
        
        try{ //intentar
            System.out.println("Ingresar un numero");
            int num =sc.nextInt();
        }catch(Exception e){ //Capturar
            System.out.println("Ocurrio un error:" + e.getMessage());
            
        }finally{ //finalizar
            System.out.println("Este bloque de se ejeuta siempre");
            sc.close();
            
        }
    }
}
