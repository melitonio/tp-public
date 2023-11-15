

import java.util.ArrayList;

public class Lista {
    
    private ArrayList<Complejo> items;

    public Lista()
    {
        items = new ArrayList<Complejo>();
    }

    public void insertar(Complejo x, int p) {
        items.add(p, x);
    }

    public Complejo recuperar(int p) {
        return items.get(p);
    }

    public int localizar(Complejo x) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getReal() == x.getReal() && items.get(i).getImg() == x.getImg()) {
                return i;
            }
        }
        return -1;
    }

    public void suprimir(int p) {
        items.remove(p);
    }

    public void suprimirDato(Complejo x) {
        int p = localizar(x);
        while(p >= 0){
            suprimir(p);
            p = localizar(x);
        }
    }

    public void anula() {
        items.clear();
    }

    public Complejo primero() {
        return recuperar(0);
    }

    public Complejo fin() {
        return recuperar(items.size() - 1);
    }

    public void imprimir()
    {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(
            "p = " + (i + 1) + 
            "\t x = " + String.format("%.04f", items.get(i).modulo()) + 
            "\t real = " + items.get(i).getReal() + 
            "\t imag = " + items.get(i).getImg()
            );
        }
    }

    public void ordenar()
    {
        int i,k;
        Complejo temp;
        for (i = 1; i < items.size(); i++)
        {
            temp = items.get(i);
            k = i - 1;
            while ((k >= 0) && (items.get(k).modulo() > temp.modulo()))
            {
                items.set(k + 1, items.get(k));
                k--;
            }
            items.set(k + 1, temp);
        }
    }
    
}