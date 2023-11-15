package t1_listaComplejos;
public class Programa {

    public static void main(String[] args) {

        Lista lista = new Lista();
        lista.insertar(new Complejo(2, 8), 0);
        lista.insertar(new Complejo(2, 5), 1);
        lista.insertar(new Complejo(3.6, 9.2), 1);
        lista.insertar(new Complejo(3.0, 4), 0);
        lista.insertar(new Complejo(6.0, 7), 0);
        lista.insertar(new Complejo(3.9, 5), 2);
        lista.insertar(new Complejo(7.6, 8), 5);
        lista.insertar(new Complejo(7.6, 8), 1);
        lista.insertar(new Complejo(7.6, 8), 4);

        System.out.println("\nImprimiendo la lista de números complejos");
        lista.imprimir();
        lista.ordenar();

        System.out.println("\nImprimiendo la lista ordenada de números complejos");
        lista.imprimir();

        lista.suprimirDato(new Complejo(7.6, 8));
        System.out.println("\nImprimiendo la lista ordenada de números complejos");
        lista.imprimir();
    }
}