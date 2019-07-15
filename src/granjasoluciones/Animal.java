
package granjasoluciones;

import java.io.Serializable;

public class Animal implements Serializable{
    protected String nombre;
    protected int energia = 100;
    protected int alimentacion = 100;
    

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    Animal() {}

             
    public void alimentarAnimal(){
        
    }
    
    public void descansarAnimal(){
        System.out.println("Descansando ...");
        energia = 100;
        alimentacion = alimentacion - 35;
        nivelarAlimentacion();    
    }
    
    public void jugarConAnimal(){
        
    }
       
    public int generarAleatorio(){
        int aleatorio = (int)(Math.random()*100);
        return aleatorio;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "\n" +
                "Nivel de Energía: " + energia+ "\n" +
                "Nivel de Alimentación: " + alimentacion +                 
                "\n\n";
    }
    
    public void nivelarEnergia(){
        if(energia < 0)energia = 0;
        if(energia > 100)energia = 100;
    }
    
    public void nivelarAlimentacion(){
        if(alimentacion < 0)alimentacion = 0;
        if(alimentacion > 100)alimentacion = 100;
    }
    
    public int evaluarSiPuedeJugar(){
        int evaluacion = 0;
        return evaluacion;
    }
    
    
}
