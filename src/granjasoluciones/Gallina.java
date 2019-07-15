package granjasoluciones;

public class Gallina extends Animal {

    private String tipoDeAnimal = "Gallina";

    public Gallina(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarAnimal() {
        alimentacion = alimentacion + 30;
        System.out.println("Alimentando ...");
        nivelarAlimentacion();
    }

    @Override
    public void jugarConAnimal() {
        int evaluacion = evaluarSiPuedeJugar();
        if (evaluacion == 1) {
            int numAleatorio = generarAleatorio();
            if (numAleatorio < 20 || numAleatorio > 50) {
                numAleatorio = generarAleatorio();
            }
            System.out.println("Jugando ...");
            energia = energia - numAleatorio;
            alimentacion = alimentacion - 20;
        }

        nivelarEnergia();
        nivelarAlimentacion();
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
        if (energia < 20 || alimentacion < 60) {
            System.out.println("Esta gallina no puede jugar: Para poder jugar, "
                    + "toda gallina necesita un nivel de energía de al menos 20 unidades"
                    + " y un nivel de alimentación de al menos 60 unidades."
                    + "\nLos niveles actuales de " + nombre + " son: Energía: " + energia
                    + ", Alimentación: " + alimentacion + ".\n\n");
        } else {
            evaluacion = 1;
        }
        return evaluacion;
    }
}
