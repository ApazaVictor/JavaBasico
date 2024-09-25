
package javabasico;


public class TipoDato {
        public void dato(){
        int myInteger = 10;
        double myDouble = 0;
        String myString  = "Hola";
        boolean esVerdadero = true;
        Object myObject = "persona";
        
        
        
        //Tipo de Dato INT
        System.out.println("myInteger es de tipo" + ((Object)myInteger).getClass().getSimpleName());
        System.out.println("myDouble es de tipo" + ((Object)myDouble).getClass().getSimpleName());
        System.out.println("myString es de tipo" + ((Object)myString).getClass().getSimpleName());
        System.out.println("esVerdadero es de tipo" + ((Object)esVerdadero).getClass().getSimpleName());
        System.out.println("myObject es de tipo" + ((Object)myObject).getClass().getSimpleName());

    }
}
