package granjasoluciones;

public class Caballo extends Animal {

    private String tipoDeAnimal = "Caballo";

    public Caballo(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarAnimal() {
        int numAleatorio = generarAleatorio();
        System.out.println("Nivel aleatorio de estado de ánimo: " + numAleatorio);
        if (numAleatorio >= 50) {
            alimentacion = alimentacion + 40;
            System.out.println("Alimentando ...");
        } else {
            System.out.println("Este caballo no está de ánimo para alimentarse.");
        }      
        nivelarAlimentacion();
    }

    @Override
    public void jugarConAnimal() {
        int evaluacion = evaluarSiPuedeJugar();
        if (evaluacion == 1) {
            System.out.println("Jugando ...");
            energia = energia - 12;
            alimentacion = alimentacion - 33;
        }
        nivelarAlimentacion();
        nivelarEnergia();
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"
                + "Nivel de Energía: " + energia + "\n"
                + "Nivel de Alimentación: " + alimentacion + "\n"
                + "Tipo de Animal: " + tipoDeAnimal
                + "\n\n";
    }

    @Override
    public int evaluarSiPuedeJugar() {
        int evaluacion = 0;
        if (energia < 50 || alimentacion < 75) {
            System.out.println("Este caballo no puede jugar: Para poder jugar, "
                    + "todo caballo necesita un nivel de energía de al menos 50 unidades"
                    + " y un nivel de alimentación de al menos 75 unidades."
                    + "\nLos niveles actuales de " + nombre + " son: Energía: " + energia
                    + ", Alimentación: " + alimentacion + ".\n\n");
        } else {
            evaluacion = 1;
        }
        return evaluacion;
    }

}
