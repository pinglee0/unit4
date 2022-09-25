import java.util.*;

public class lesson {
}
class example{
    public static void main(String[] args){
        if (false)
            if(true)
                System.out.println("There are  primes are less than 1000");
            else
                System.out.println("There are ");
    }
}
class lab1 {

    public static int countFactors(int num){
        int i=2;
        int count=0;
        while(i<num){
            if(num%i==0)
                count++;
            i++;
        }
        return count;
    }
    public static boolean isPrime(int num){
        return countFactors(num)==0;
    }
        public static void main(String[] args){

        int count=0,i=2;
        while(i<1000){
            if(isPrime(i))
                System.out.println(i);
                count++;
            i++;
        }
        System.out.println("There are "+count+" primes are less than 1000");
    }
}
class lab2{
    public static void fourHeads (){
        int count=0;;
        int randnum;
        while(count<4){
            randnum=(int)(Math.random()*2);
            if(randnum==1){
                count++;
                System.out.print("H ");
            }
            else{
                count=0;
                System.out.print("T ");
            }
        }
        System.out.println("\nFour heads in a row!");
    }
    public static void main(String[] args){
        fourHeads ();
        fourHeads ();
        fourHeads ();
    }
}