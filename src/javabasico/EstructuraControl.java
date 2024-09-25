
package javabasico;


public class EstructuraControl {
    private int edad;

    public EstructuraControl(int edad) {
        this.edad = edad;
    }
       
    
    /*public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    */
    
    public void estructura(){
        //int edad = 18;      
        if(this.edad >= 18 && this.edad < 45){
            System.out.println("Es mayor de edad");
        }else if(edad >= 45){
            System.out.println("Es adulto");        
        }else{
            System.out.println("Es menor de edad");        
        }
    
    }
    
    /*public void tablaMultiplicar(){        
        for(int i = 1;i <= 10; i++){
            System.out.println("2 x 2 = "+ i*2);
        }
    }*/
        public void tablaMultiplicar(int d){        
        for(int i = 1;i <= 10; i++){
            System.out.println(i+" x "+d+" = "+ i*d);
        }    
    }
}
