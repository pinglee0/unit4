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
class lab3{
    public static void main(String[] args){
        for(double i=19;i<=33;i+=1.4)
            System.out.println((int)i+" "+i);
    }
}
class lab4{
    public static void printTwoDigit(int n){
        boolean a=false;
        int num;
        for(int i=0;i<n;i++){
            num=(int)(10*Math.random()+10);
            System.out.println("next= "+num);
            if(num==13)
                a=true;
        }
        if(a)
            System.out.println("we saw a 13");
        else
            System.out.println("no 13 was seen");
    }
    public static void main(String[] args){
        printTwoDigit(3);
    }
}
class lab5{
    public static void printLadder (int n){
        boolean a=false;
        int num;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(1+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void multiplicationTable  (int n){
        boolean a=false;
        int num;
        for(int i=0;i<n;i++){
            for(int j=1;j<=10;j++){
                System.out.print((i+1)*j+"\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args){
        printLadder (5);
        multiplicationTable(6);
    }
}
class example2{
    public static void main(String[] args){
        int i=32512;
        while(i!= 0){
            System.out.println(i% 10);
            i/= 10;
        }
        System.out.println();
        for(int j=32512;j!= 0;j/= 10 ){
            System.out.println(j%10);
        }
    }
}
class example3{
    public static void main(String[] args){
        int i=1;
        for(i=1;i<5;i++){

        }
        System.out.println(i);
        for(int j=1;j<5;j++){

        }
        //System.out.println(j);

    }
}