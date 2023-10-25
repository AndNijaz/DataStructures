import javax.sound.midi.Soundbank;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void towersOfHanoi(int n, char src, char aux, char dst)  {
        if(n==0) return;
        towersOfHanoi(n-1, src, dst, aux);
        System.out.println("Move disk " + n + " from " + src + " to " + dst);
        towersOfHanoi(n-1, aux, src, dst);
    }
    static void numbersInReverse(int num){
        if(num == 0) return;
        System.out.println(num);
        numbersInReverse(num-1);
    }
    static int sumInReverse(int num){
        if(num == 0) return 0;
        return num + sumInReverse(num-1);

    }
    static int fibonacci(int n){
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34
        if (n==0) return 0;
        else if (n ==1) return 1;
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int digitSum(int num){
        if(num == 0) return 0;
        return num % 10 + digitSum(num/10);
    }

    static int power(int num, int exp){
        if(exp == 0) return 1;
        return num * power(num, exp-1);
    }

    private static void TOH(int n, char s, char a, char d ) {
        if(n==0) return;
        towersOfHanoi(n-1, s, d, a);
        System.out.println("Move disk " + n + " from " + s + " to " + d);
    }

    public static void main(String[] args) {

        //numbersInReverse(10);
        //System.out.println(sumInReverse(5));
        //System.out.println( fibonacci(7));
        //System.out.println(digitSum(15));
        //System.out.println(power(2, 3));
        TOH(3, 'S', 'A', 'D');
        System.out.println("--------------");
        towersOfHanoi(3, 'S', 'A', 'D');
    }


}