public class CalculadoraUsandoWhile{
    
    /**
     * método para multiplos de 5 entre el 10 y el 95
     */
    public void multiplosDeCinco(){
        int multiplo = 10;
        while(multiplo < 90){
            System.out.println(multiplo + 5);
            multiplo = multiplo + 5;
        }
    }
}