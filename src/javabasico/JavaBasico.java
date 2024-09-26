
package javabasico;

import java.util.Scanner;

//Victor hugo
public class JavaBasico {

    public void principal(){
        System.out.println("Bienvenido Java Basico");
        System.out.println("1. Operadores logicos");
        System.out.println("2. Tipo de Dato");
        System.out.println("3. Estructura de control");
        System.out.println("4. Excepciones");
        System.out.println("5. Estructura de Datos");
        
        System.out.println("Eligir una opcion:");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        
        switch(data){
            case 1:
                OperadoresLogicos o1 = new OperadoresLogicos();
                o1.operador();
                break;
            case 2:
                TipoDato o2 = new TipoDato();
                o2.dato();
                break;
            case 3:
                EstructuraControl ec = new EstructuraControl(80);
                //ec.estructura();
                ec.tablaMultiplicar(7);
                break;
            case 4:
                Excepciones ex = new Excepciones();
                ex.manejoError();
            case 5:
                EstructuraDatos ed = new EstructuraDatos();
                //ed.array();
                //ed.list();
                ed.map();
                break;
        
        }
    }

    public static void main(String[] args) {
       // Practica prac = new Practica();
        JavaBasico jb = new JavaBasico();
        jb.principal();
        //prac.menu();
    }   
}
