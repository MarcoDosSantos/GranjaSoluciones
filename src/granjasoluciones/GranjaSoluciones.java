
package granjasoluciones;

import java.util.ArrayList;

public class GranjaSoluciones {

    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();
        
        Caballo horacio = new Caballo("Horacio");
        Vaca mercedes = new Vaca("Mercedes");
        Gallina esther = new Gallina("Esther");
        Caballo hector = new Caballo("Héctor");
        Vaca clarita = new Vaca("Clarita");
        Gallina gladys = new Gallina("Gladys");
        Caballo eduardo = new Caballo("Eduardo");
        Vaca ximena = new Vaca("Ximena");
        Gallina clotilde = new Gallina("Clotilde");
        
        animales.add(horacio);
        animales.add(mercedes);
        animales.add(esther);
        animales.add(hector);
        animales.add(clarita);
        animales.add(gladys);
        animales.add(eduardo);
        animales.add(ximena);
        animales.add(clotilde);
        
        AdministradorGranja administrador = new AdministradorGranja(animales);
        
        System.out.println("*****************************************************************");
        System.out.println("*Bienvenid@ al sistema de administración de la Granja Soluciones*");
        System.out.println("**************(de Juan Carlos Soluciones e Hijos)****************");
        System.out.println("*****************************************************************");
        
        administrador.mostrarMenu();               
       
    }
    
}
