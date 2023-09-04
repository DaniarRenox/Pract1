public class Factorial {
    int Factorial(int number){
        for (int i=number-1;i>1;i--){
            number*=i;
        }
        return number;
    }
}
