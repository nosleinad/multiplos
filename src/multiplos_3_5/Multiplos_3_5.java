
package multiplos_3_5;

/**
 *
 * @author Ultimate
 */
public class Multiplos_3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int x = 3;
        int y = 5;
        int soma = 0;


        System.out.println("Multiplos de 3 ou 5 Abaixo de 1000:\n");
        for(int i = 1; i < 1000; i++){
            if(i % x == 0 || i % y == 0){
                System.out.println(i);
                soma += i;
                
            }
           
        }

        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 1000, é: " +soma);
    }
    
}
