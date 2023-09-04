// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose the prog number 1 to 5");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        switch(a) {
            case 1:
            {
                int[] Array = new int[10];
                int summ = 0;

                for (int i = 0; i < 10; i++) {
                    Array[i] = scanner.nextInt();
                    summ += Array[i];
                }
                System.out.println(summ + " " + summ / 10.0);
                break;
            }
            case 2:
                ArrayList<Integer> array=new ArrayList<>();
                int summ=0;
                int maxim=0;
                int minim=Integer.MAX_VALUE;
                String buff=scanner.next();
                while(buff.charAt(0)-'0'<=10) {
                    array.add(Integer.valueOf(buff));
                    summ+=Integer.valueOf(buff);
                    maxim=Math.max(Integer.valueOf(buff),maxim);
                    minim= Math.min(Integer.valueOf(buff),minim);
                    buff=scanner.next();
                }
                System.out.println("summ = " + summ + "\nmax is " + maxim + "\nmin is " + minim);
                break;
            case 3:
                //idk whacha do here bro
                break;
            case 4:
                System.out.print("1");
                for (int i=1;i<11; i++) {
                    System.out.print(", 1/"+i);
                }
                break;
            case 5:
                System.out.println("input the number");
                Factorial factorial= new Factorial();
                System.out.println(factorial.Factorial(scanner.nextInt()));
        }

    }
}