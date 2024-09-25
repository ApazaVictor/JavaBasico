
package javabasico;

import java.util.Scanner;


public class Practica {
     public void menu(){
        System.out.println("Elige una opcion");
        System.out.println("Desayuno");
        System.out.println("Almuerzo");
        System.out.println("Cena");
        System.out.println("Extras");
        System.out.println("Salir");
        
        System.out.println("Eligir una opcion:");
        Scanner sc = new Scanner(System.in);
        int ValorqueInsertElUusuario = sc.nextInt();
        
        switch(ValorqueInsertElUusuario){
            case 1:
                System.out.println("Jugo de papaya");
                System.out.println("Caldo de cabeza");
                System.out.println("Lomo saltado");
                break;
            case 2:
                System.out.println("Estofado");
                break;
            case 3:
                System.out.println("Pollo a la brasa");
                break;
            case 4:
                System.out.println("No tenemos extras");
                break;
            case 5:
                System.out.println("Gracias por visitarnos");
            break;
            
            default:
                System.out.println("Vuelva pronto");
            break;
        }
    }
}
