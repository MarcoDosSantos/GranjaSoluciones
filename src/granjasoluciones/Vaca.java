package granjasoluciones;

public class Vaca extends Animal {

    private String tipoDeAnimal = "Vaca";

    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public void alimentarAnimal() {
        alimentacion = alimentacion + 23;
        System.out.println("Alimentando ...");
        nivelarAlimentacion();
    }

    @Override
    public void jugarConAnimal() {
        int evaluacion = evaluarSiPuedeJugar();
        if (evaluacion == 1) {
            System.out.println("Jugando ...");
            energia = energia - 15;
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
        if (energia < 30 || alimentacion < 80) {
            System.out.println("Esta vaca no puede jugar: Para poder jugar, "
                    + "toda vaca necesita un nivel de energía de al menos 30 unidades"
                    + " y un nivel de alimentación de al menos 80 unidades."
                    + "\nLos niveles actuales de " + nombre + " son: Energía: " + energia
                    + ", Alimentación: " + alimentacion + ".\n\n");
        } else {
            evaluacion = 1;
        }
        return evaluacion;
    }

}
