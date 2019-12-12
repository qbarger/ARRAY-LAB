import java.util.Arrays;
import java.util.Scanner;
public class PrimeSieve {
    public static boolean[] sieve = new boolean [1000];
    
    public static void main(String[] args) {
        System.out.println("This program outputs all the prime numbers from 1 to 1000.");
        System.out.println("Then it gives the prime factorization of the number you input...");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        
        boolean[] collectPrimes = findPrimes();
        printPrimeFactors(collectPrimes);
        int[] primes = new int [1000];
        int index = 0;
        for(int i = 0; i < collectPrimes.length; i++){
            if(collectPrimes[i] == true){
                
                primes[index] = i;
                index++;
                
            }
        }
        System.out.println();
        System.out.println("Prime Factorization of "+ a);
        int i = 0;
        while(a != 1){
            int prime = primes[i];
            int counter = 0;
            
            while(a%prime == 0){
                a = a/prime;
                counter++;
            }
            if(counter > 0){
                System.out.println(prime + ": " + counter);
            }
            
            i++;
        }
           
    }
    
    public static boolean[] findPrimes(){
        Arrays.fill(sieve, true); //sets all values to true
        sieve[0] = false;
        sieve[1] = false;
        
        for(int i=2; i<sieve.length; i++){
            
            for(int q=2; q*i<sieve.length; q++){
                int w = q*i;
                
                sieve[w] = false;
            }
        }
        return sieve;
        
    }
    
    public static void printPrimeFactors (boolean[] primes){
        for(int i = 0; i < primes.length; i++){
            if(primes[i] == true){
                System.out.println(i);
            }
        }
    }
}
     

                
                    
                
                    
                     
                
                    
                    
                
                
                
            
        
        //write and implement the sieve algorithm
        
        //print a list of prime numbers to the console
        
    
    /*collectPrimes is its own method, using the info from changed universal 
     *sieve[] 
     *printPrimeFactors is then a second method, using info from collectPrimes
     */

    

