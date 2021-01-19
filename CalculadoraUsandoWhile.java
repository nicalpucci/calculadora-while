public class CalculadoraUsandoWhile{

    /**
     * método para multiplos de 5 entre el 10 y el 95 (ambos exluidos)
     */
    public void multiplosDeCinco(){
        int multiplo = 10;
        while(multiplo < 90){
            System.out.println(multiplo + 5);
            multiplo = multiplo + 5;
        }
    }

    /**
     * imprime por pantalla la suma de los números comprendidos 
     * entre el 0 y el 10 (ambos incluidos)
     */
    public void sumaDeValores(){
        int numero = 0;
        int suma = 0;
        while (numero <= 10){
            suma = suma + numero;
            numero ++;
        }
        System.out.println(suma);    
    }

    /**
     * recibe dos parámetros enteros a y b y devuelve la suma de los 
     * valores comprendidos entre dichos parámetros (ambos incluidos)
     */
    public void sumaDeValoresEnElIntervalo(int a, int b){
        int suma = 0;
        int nuevaA = a;
        if(a >= 0 && b >= 0){
            if(a == b){
                suma = a;
            }
            else{
                if(a > b){
                    a = b;
                    b = nuevaA;
                }
                while(a <= b){
                    suma = suma + a;
                    a++;
                }
            }
        }
        else{
            System.out.println("Introduce números positivos");
            suma = -1;
        }
        System.out.println(suma);
    }

    /**
     * método para introducir un número y ver si es primo o no
     */
    public boolean esPrimo(int n){
        boolean numeroPrimo = true;
        int divisor = 2;
        if(n > 1){
            while(divisor <= n - 1 && numeroPrimo){
                if(n % divisor != 0){
                    divisor++;
                }
                else{
                    numeroPrimo = false;
                }
            }
        }
        else{
            numeroPrimo = false;
            System.out.println("El número debe ser mayor que 1");
        }
        return numeroPrimo;
    }
}