package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 0;

        while (i <= printToInclusive) {
            if (isPrime(i)==1){
                System.out.println(i);
            }
            i++;
            }
    }
    public static int isPrime(int num)
    {
        if(num<=1)
        {
            return 0;
        }
        for(int i=2;i<num/2;i++)
        {
            if((num%i)==0)
                return 0;
        }
        return 1;
    }
}