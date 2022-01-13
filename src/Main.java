import java.util.Scanner;

public class Main {

    static int desen(int n, int m, boolean state){
       System.out.print(n + " ");
       if(state == false && n == m){
           return n;
       }
       if(n > 0 && state == true){
           return desen(n - 5, m, state);
       }else if(n <= m){
           state = false;
           return desen(n + 5, m, state);
       }
       return n;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        int n = scanner.nextInt();

        desen(n, n, true);
    }
}
