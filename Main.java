import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Potęga");
        System.out.println("5.Pierwiastek");
      int wybor = scan.nextInt();

      switch(wybor){

        case 1: 
          {
            System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a+b;
            System.out.println("Wynik"+" "+c);
            break;
          }
        case 2:
          {
             System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a-b;
            System.out.println("Wynik" + " "+c);
            break;
          }
        case 3:
          {
            System.out.println("Podaj 1 liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj 2 liczbe");
            double b = scan.nextDouble();
            double c = a*b;
            System.out.println("Wynik"+ " " +c);
            break;
          }
          case 4:
          {
            System.out.println("Podaj liczbe");
            double a = scan.nextDouble();
            System.out.println("Podaj potęge");
            double potega = scan.nextDouble();
            double wynik=0;
                wynik= Math.pow(a, potega);
            System.out.println("Wynik"+ " " +wynik);
            break;

          }
          case 5:
          {
            System.out.println("Podaj liczbe");
             double a = scan.nextDouble();
             double wynik=0;
             wynik = Math.sqrt(a);
             System.out.println("Wynik"+ " " + wynik);
            break;
          }




          
      }
    }
}