public class CalculadoraUsandoWhile{

    /**
     * m�todo para multiplos de 5 entre el 10 y el 95 (ambos exluidos)
     */
    public void multiplosDeCinco(){
        int multiplo = 10;
        while(multiplo < 90){
            System.out.println(multiplo + 5);
            multiplo = multiplo + 5;
        }
    }

    /**
     * imprime por pantalla la suma de los n�meros comprendidos 
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
     * recibe dos par�metros enteros a y b y devuelve la suma de los 
     * valores comprendidos entre dichos par�metros (ambos incluidos)
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
            System.out.println("Introduce n�meros positivos");
            suma = -1;
        }
        System.out.println(suma);
    }

    /**
     * m�todo para introducir un n�mero y ver si es primo o no
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
            System.out.println("El n�mero debe ser mayor que 1");
        }
        return numeroPrimo;
    }
}