
package javabasico;


public class OperadoresLogicos {
    public void operador(){
        boolean esVerdadero = true;
        boolean esFalso = false;
        
        //Operador AND (&&)
        boolean resultado = esVerdadero && esFalso;
        System.out.println("Resultado AND: " + resultado);
        
        //Operador OR (||)
        boolean resultado1 = esVerdadero || esFalso;
        System.out.println("Resultado OR: " + resultado1);
        
        //Operador NOT (!)
        boolean resultado2 = !esVerdadero;
        System.out.println("Resultado NOT: " + resultado2);
        
    
    }
}
