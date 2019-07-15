package granjasoluciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AdministradorGranja {
    
    private Scanner intro = new Scanner(System.in);
    private ArrayList<Animal> animales = new ArrayList<>();
    

    public AdministradorGranja(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public void listarAnimal() {
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Por favor, ingrese el nombre del animal que desea buscar y luego presione Enter: ");
        String nombre = intro.nextLine();
        char[] caracteres = nombre.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        nombre = new String(caracteres);

        ArrayList<String> nombres = new ArrayList<>();
        Animal mAnimal = new Animal();
        for (Animal animal : animales) {
            nombres.add(animal.nombre);
            if (animal.nombre.equals(nombre)) {
                mAnimal = animal;
            }
        }
        if (nombres.contains(nombre)) {
            System.out.println("Ya existe un animal registrado en la lista bajo el nombre " + nombre + ".");
            System.out.println(mAnimal.toString());
        } else {
            System.out.println("No existe un animal registrado en la lista bajo el nombre " + nombre + ".");
        }
        
        admin.mostrarMenu();

    }

    public void listarAnimales() {
        AdministradorGranja admin = new AdministradorGranja(animales);
        if (animales.isEmpty()) {
            System.out.println("No hay animales registrados en la granja.");
        } else {
            System.out.println("Lista completa de animales registrados en la granja:\n");
            for (Animal animal : animales) {
                System.out.println(animal.toString());
            }
        }
        admin.mostrarMenu();
    }

    public void agregarAnimal() {
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Por favor, ingrese el nombre del animal que desea agregar y luego presione Enter: ");
        String nombre = intro.nextLine();
        char[] caracteres = nombre.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        nombre = new String(caracteres);

        ArrayList<String> nombres = new ArrayList<>();
        Animal mAnimal = new Animal();
        for (Animal animal : animales) {
            nombres.add(animal.nombre);
            if (animal.nombre.equals(nombre)) {
                mAnimal = animal;
            }
        }
        if (nombres.contains(nombre)) {
            System.out.println("No es posible registrar un animal bajo el nombre " + nombre + ".\nYa existe un animal con ese nombre en la lista, y no se admiten nombres repetidos.");
            System.out.println(mAnimal.toString());            
        } else {
            System.out.println("Por favor, elija el tipo del animal que desea agregar: "
                    + " \nPara elegir \"Gallina\" presione 1"
                    + " \nPara elegir \"Vaca\" presione 2"
                    + " \nPara elegir \"Caballo\" presione 3: ");

            int tipo = intro.nextInt();

            switch (tipo) {
                case 1:
                    animales.add(new Gallina(nombre));
                    System.out.println("La gallina de nombre " + nombre + " ha sido agregada satisfactoriamente a la lista.");
                    break;
                case 2:
                    animales.add(new Vaca(nombre));
                    System.out.println("La vaca de nombre " + nombre + " ha sido agregada satisfactoriamente a la lista.");
                    break;
                case 3:
                    animales.add(new Caballo(nombre));
                    System.out.println("El caballo de nombre " + nombre + " ha sido agregado satisfactoriamente a la lista.");
                    break;
                default:
                    System.out.println("Opción no válida. Si desea volver a intentarlo presione 1, de lo contrario, presione cualquier otra tecla.");
                    int intento = intro.nextInt();
                    if(intento == 1){
                        agregarAnimal();
                    }
            }
        }
        admin.mostrarMenu();
    }
    
    public void alimentarAnimal(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Por favor, ingrese el nombre del animal que desea alimentar y luego presione Enter: ");
        String nombre = intro.nextLine();
        char[] caracteres = nombre.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        nombre = new String(caracteres);
        
        ArrayList<String> nombres = new ArrayList<>();
        Animal mAnimal = new Animal();
        for (Animal animal : animales) {
            nombres.add(animal.nombre);
            if (animal.nombre.equals(nombre)) {
                mAnimal = animal;
            }
        }
        if (nombres.contains(nombre)) {            
            System.out.println(mAnimal.toString());
            mAnimal.alimentarAnimal();
            System.out.println(mAnimal.toString());            
        } else {
            System.out.println("Lo sentimos, el animal que desea alimentar no se encuentra registrado en la lista.");
        }
        admin.mostrarMenu();
    }
    
    public void alimentarAnimales(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        if(animales.isEmpty()){
            System.out.println("Lo sentimos, no es posible alimentar a los animales, la lista está vacía.");
        } else{
            for(Animal animal: animales){
                System.out.println(animal.toString());
                animal.alimentarAnimal();
                System.out.println(animal.toString());
            }
        }
        admin.mostrarMenu();
    }
    
    public void jugarConAnimal(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Por favor, ingrese el nombre del animal con el que desea jugar y luego presione Enter: ");
        String nombre = intro.nextLine();
        char[] caracteres = nombre.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        nombre = new String(caracteres);
        
        ArrayList<String> nombres = new ArrayList<>();
        Animal mAnimal = new Animal();
        for (Animal animal : animales) {
            nombres.add(animal.nombre);
            if (animal.nombre.equals(nombre)) {
                mAnimal = animal;
            }
        }
        if (nombres.contains(nombre)) {            
            System.out.println(mAnimal.toString());
            mAnimal.jugarConAnimal();
            System.out.println(mAnimal.toString());            
        } else {
            System.out.println("Lo sentimos, el animal con el que desea jugar no se encuentra registrado en la lista.");
        }
        admin.mostrarMenu();
    }
    
    public void jugarConAnimales(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        if(animales.isEmpty()){
            System.out.println("Lo sentimos, no es posible jugar con los animales, la lista está vacía.");
        } else{
            for(Animal animal: animales){
                System.out.println(animal.toString());
                animal.jugarConAnimal();
                System.out.println(animal.toString());
            }
        }
        admin.mostrarMenu();
    }
    
    public void descansarAnimal(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Por favor, ingrese el nombre del animal que desea hacer descansar y luego presione Enter: ");
        String nombre = intro.nextLine();
        char[] caracteres = nombre.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        nombre = new String(caracteres);
        
        ArrayList<String> nombres = new ArrayList<>();
        Animal mAnimal = new Animal();
        for (Animal animal : animales) {
            nombres.add(animal.nombre);
            if (animal.nombre.equals(nombre)) {
                mAnimal = animal;
            }
        }
        if (nombres.contains(nombre)) {            
            System.out.println(mAnimal.toString());
            mAnimal.descansarAnimal();
            System.out.println(mAnimal.toString());            
        } else {
            System.out.println("Lo sentimos, el animal que desea hacer descansar no se encuentra registrado en la lista.");
        }        
        admin.mostrarMenu();
    }
    public void descansarAnimales(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        if(animales.isEmpty()){
            System.out.println("Lo sentimos, no es posible hacer descansar a los animales, la lista está vacía.");
        } else{
            for(Animal animal: animales){
                System.out.println(animal.toString());
                animal.descansarAnimal();
                System.out.println(animal.toString());
            }
        }
        admin.mostrarMenu();        
    }
    
    public void salir(){
        System.out.println("Si desea salir del sistema, por favor escriba \"exit\" :");
        String salida = intro.nextLine();
        if(salida.equalsIgnoreCase("exit")){
            System.out.println("Gracias por haber utilizado el Sistema de Administración "
                + "de Granja Soluciones.\nEsperamos que haya sido de su agrado. Hasta pronto.");
            
        System.exit(0);
        } else {
            System.out.println("Lo sentimos, el comando \"" + salida + "\" no es reconocido por el sistema.");
            salir();
        }
        
    }
    
    public void guardarDatos(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        try{
            String ruta= System.getProperty("user.home");
            ObjectOutputStream outputStream = new ObjectOutputStream(new
         FileOutputStream(ruta + "/Desktop/Granja Soluciones/GranjaSoluciones.txt"));
            outputStream.writeObject(animales);
            outputStream.close();
            System.out.println("Por favor, revise la carpeta \"Granja Soluciones\" en el Escritorio.\n");
        }catch(Exception e){
            System.out.println("Error al guardar el archivo: " + e);            
        }        
        admin.mostrarMenu();
    }
    
    public void recuperarDatos(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        try{
            String ruta= System.getProperty("user.home");
            ObjectInputStream inputStream = new ObjectInputStream(new
         FileInputStream(ruta + "/Desktop/Granja Soluciones/GranjaSoluciones.txt"));
            ArrayList<Animal> animalesRecuperados = (ArrayList<Animal>)inputStream.readObject();
            inputStream.close();
            System.out.println("Datos recuperados del archivo:\n");
            for(Animal animal : animalesRecuperados){
                System.out.println(animal.toString());
            }
        }catch(Exception e){
            System.out.println("Error al recuperar el archivo: " + e);            
        }
        admin.mostrarMenu();
    }
    
    public void limpiarPantalla(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.print("Si desea limpiar la pantalla, por favor ingrese la palabra \"clean\": ");
        
        String limpiar = intro.nextLine();
        if(limpiar.equalsIgnoreCase("clean")){
            try{
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println("Error:" + e);
        }
        } else{
            System.out.println("No se reconoce el comando \"" + limpiar + "\".");
        }        
        admin.salir();                
    }
    
    public void mostrarMenu(){
        AdministradorGranja admin = new AdministradorGranja(animales);
        System.out.println("\nPara indicar la operación que desea realizar, elija el número correspondiente y luego presione Enter:");
        System.out.println("1. Listar animal (Buscar animal por su nombre en la lista de animales registrados en la granja).");
        System.out.println("2. Listar animales (Mostrar todos los animales registrados en la granja).");
        System.out.println("3. Agregar animal (Agregar animal indicando nombre y tipo).");
        System.out.println("4. Alimentar animal (Alimentar animal indicando su nombre).");
        System.out.println("5. Alimentar animales (Alimentar a todos los animales registrados en la granja).");
        System.out.println("6. Jugar con un animal (Jugar con un animal de la granja, indicando su nombre).");
        System.out.println("7. Jugar con todos los animales de la granja.");
        System.out.println("8. Descansar animal.(Hacer descansar a un animal de la granja, indicando su nombre)");
        System.out.println("9. Descansar a todos los animales de la granja.");
        System.out.println("10. Salir.");
        System.out.println("11. Guardar datos en la computadora.");
        System.out.println("12. Recuperar datos guardados en la computadora.");
        System.out.println("13. Limpiar pantalla.");
        System.out.print("Selección: ");
        int seleccion = intro.nextInt();
        
        switch(seleccion){
            case 1: admin.listarAnimal();
            break;
            case 2: admin.listarAnimales();
            break;
            case 3: admin.agregarAnimal();
            break;
            case 4: admin.alimentarAnimal();
            break;
            case 5: admin.alimentarAnimales();
            break;
            case 6: admin.jugarConAnimal();
            break;
            case 7: admin.jugarConAnimales();
            break;
            case 8: admin.descansarAnimal();
            break;
            case 9: admin.descansarAnimales();
            break;
            case 10: admin.salir();
            break;
            case 11: admin.guardarDatos();
            break;
            case 12: admin.recuperarDatos();
            break;
            case 13: admin.limpiarPantalla();
            break;
            default: System.out.println("No se reconoce el comando.");           
            break;            
        }
            
    }
    
    
}
