import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter marks subject 1 : ");
        int  a =  s.nextInt();
        System.out.print("enter marks subject 2 : ");
        int  b =  s.nextInt();
        System.out.print("enter marks subject 3 : ");
        int  c =  s.nextInt();
        System.out.print("enter marks subject 4 : ");
        int  d =  s.nextInt();
        System.out.print("enter marks subject 5 : ");
        int  e =  s.nextInt();
     int sum =a+b+c+d+e;
        System.out.println("addition : "+sum);
        System.out.print("percentage : ");
        int total=500;
        float p = sum*100/total;
        System.out.println(p+"%");
    }
}
