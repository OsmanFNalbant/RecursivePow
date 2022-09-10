import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayımız:");
        int a = scan.nextInt();
        System.out.println("Üssü:");
        int b = scan.nextInt();
        int sonuc = main(a,b);
        System.out.println("Sonuc:"+sonuc);
    }
    public static int main(int a,int b)
    {
        if(b==0)
        {
            return 1;
        }
        return a* main(a,b-1);
    }
}