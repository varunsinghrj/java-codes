// CGPA calculator

import java.util.Scanner;

    public class cgpa {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("enter marks subject 1 : ");
            int  subject1 =  s.nextInt();
            System.out.print("enter marks subject 2 : ");
            int  subject2 =  s.nextInt();
            System.out.print("enter marks subject 3 : ");
            int  subject3 =  s.nextInt();
            System.out.print("enter marks subject 4 : ");
            int  subject4 =  s.nextInt();
            float cgpa =(subject1+subject2+subject3+subject4)/40f;
            System.out.println("CGPA : " + cgpa);


        }
    }

