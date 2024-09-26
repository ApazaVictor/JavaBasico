
package javabasico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstructuraDatos {
    
    public void array(){
        String apellido = "Apaza";
        
        Object[] datos = {"Victor","Hugo","Daniel",23,"senati",false,23.12,"nelson"};
        
        //Obtener la cantidad de datos
       int cantidad = datos.length;
       System.out.println("Cantidad de datos de mi array:" + cantidad);
       
       System.out.println(datos[0]);
       
       /*for (Object element : datos) {
            System.out.println(element);
        }*/
       
        for(int i = 0;i <= cantidad-1; i++){
          System.out.println(datos[i]);    
          if(datos[i] == "senati" ){ //.equals()
          System.out.println("Se encontro la palabra"+ datos[i]);
          }
        }
    }     
        //iterando usar Est Cont IF() ai encuentra
        //La palabra "SENATI" print por consola
        //Se encontro la palabra "[7]"
    
    public void list(){
        List<String> nombre = new ArrayList<>();
        nombre.add("Marco");
        nombre.add("Pedro");
        nombre.add("Pablo");
        
        List<String> nombresNuevos = new ArrayList<>();
        nombresNuevos.add("Diego");
        nombresNuevos.add("Maria");
        nombresNuevos.add("Ana");
        
        //addAli
        nombre.addAll(nombresNuevos);
        //Cantidad de datos
        int cantidad = nombre.size();
        System.out.println("Cantidad de datos: " + cantidad);
        //Obtener un dato
        System.out.println("El dato: " + nombre.get(0));
        
        for(int i = 0;i <= nombre.size()-1; i+=1){
          System.out.println("El dato es: "+nombre.get(i)); 
          if(nombre.get(i) == (Object) "Diego" ){ //.equals()
          System.out.println("Se encontro la palabra"+ nombre.get(i));
          }
        }
        //Remover
        nombre.remove("Diego");
        
        //Encontrar un dato
        nombre.contains("Pablo");//boolean
        
        //El indice de un dato.
        nombre.indexOf("Pablo");//int
        
        //Ordenar una lista.
        Collections.sort(nombre);
        
        //Revertir una lista.
        Collections.reverse(nombre);
        
        //Reemplazar un dato.
        nombre.set(1, "Jose Luis");
        System.out.println("----------------------------------");
        for(String item: nombre){
            System.out.println("El dato es: "+ item);
        }
        System.out.println("----------------------------------");
        
        //Limpiar toda la lista.
        nombre.clear();
        
    }
    
    public void map(){
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Maria", 50);
        edades.put("Diego", 34);
        edades.put("Elias", 12);
        edades.put("Ana", 15);
        
        //Remover data
        edades.remove("Elias");
        
        //Cantidad de datos
        edades.size();
        
        for(String item : edades.keySet()){
            System.out.println("Clave: "+ item + "Valor: "+ edades.get(item));
            Integer edad = edades.get(item);
        if (edad != null && edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        }
    }
}
