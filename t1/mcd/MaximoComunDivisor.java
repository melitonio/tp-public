public class MaximoComunDivisor {
    
    public static void main(String[] args) {
        MaximoComunDivisor calculadorMcd = new MaximoComunDivisor();
        int m = 280, n = 160;
        System.out.println("Cálculo del MCD entre: " + m + " y " + n + "\n");
        calculadorMcd.mcd(m, n);
        calculadorMcd.mcdEuclides(m, n);
    }


    public int mcdEuclides(int m, int n)
    {
        System.out.println(" **** INICIO EUCLIDES *****");
        int tmp;
        while(m > 0)
        {
            System.out.println("m=" + m + "; n=" + n);
            tmp = m;
            m = n % m;
            n = tmp;
        }
        System.out.println("m=" + m + "; n=" + n + " --> mcd = n = " + n);
        System.out.println(" **** FIN EUCLIDES ***** \n");        
        return n;
        
    }

    public int mcd(int m, int n)
    {
        System.out.println(" **** INICIO ALGORITMO CLÁSICO *****");
        int i = Math.min(n, m);
        while(!(m % i == 0 && n % i == 0)){            
            System.out.println("i = : " + i);
            i = i -1;
        }
        System.out.println("i = : " + i + " --> mcd");
        System.out.println(" **** FIN ALGORITMO CLÁSICO ***** \n");
        return i;
    }
}
