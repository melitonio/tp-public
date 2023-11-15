package listaComplejos;

/**
 * Autor Melitón Pablo Mangué
 * Tecnología de la Programación. Nov. 2020
 */
public class Complejo {

    private double real;
    private double img;

    public Complejo(double r, double i) {
        real = r;
        img = i;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double r) {
        this.real = r;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double i) {
        this.img = i;
    }

    public double modulo() {
        return Math.sqrt(real * real + img * img);
    }

    public Boolean esMenor(Complejo c) {
        return this.modulo() < c.modulo();
    }

    public Boolean esMayor(Complejo c) {
        return this.modulo() > c.modulo();
    }

    public Boolean esIgual(Complejo c) {
        return this.modulo() == c.modulo();
    }
}