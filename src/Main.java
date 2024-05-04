import java.util.Scanner;

public class Main {
   static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //todo: kullanıcıdan 2 tane sayı alalım ve sonrasında (+,-,/,*) işlemlerini alarak ilgili operatöre göre işlemi yaptıran kod parçasını yazınız.
     String operator = getOperator();
     double sayi1 = getFirstNumber();
     double sayi2 = getSecondNumber();
     calculate(sayi1,sayi2,operator);
        // referans tiplerde == kullanımı referanslarının karşılaştırılması demektir. equals() metodu ise değerlerini karşılaştırır.
        // Stringler : Değer tip gibi çalışan referans tiptir.
        // değer tipler : null değer alamazlar , new anahtar sözcüğü ile kullanmya gerek yoktur : int, boolean , char ...
        // referans tipler : null değer alabilir , new anahtar sözcüğü ile kullanılır , String , interface , class
        
        // 11.47 de dersteyizz...
    }

    public static  void calculate(double sayi1, double sayi2, String operator){
        if (operator.equals("+")){
            System.out.println(sayi1+" + "+ sayi2+ "= "+sum(sayi1,sayi2));
        }
        else  if (operator.equals("-")){
            System.out.println(sayi1+" - "+ sayi2+ "= "+difference(sayi1,sayi2));
        }
        else  if (operator.equals("*")){
            System.out.println(sayi1+" * "+ sayi2+ "= "+multiply(sayi1,sayi2));
        }else if (operator.equals("/")){
            System.out.println(sayi1+" / "+ sayi2+ "= "+divide(sayi1,sayi2));
        }else {
            System.out.println("Yanlış karakter girdiniz.");
        }
    }


    public static  double getSecondNumber(){
        System.out.println("Lütfen 2. sayıyı giriniz :");
        double sayi2 =  scanner.nextDouble();
        return sayi2;
    }

    public static String getOperator(){
        System.out.println("Lütfen bir tane işlem giriniz: (+,-,/,*)");
        String operator = scanner.nextLine();
        return  operator;

    }

    public static double  getFirstNumber(){
        System.out.println("Lütfen 1. sayıyı giriniz :");
        double sayi1 =  scanner.nextDouble();
        return  sayi1;
    }

    public static double divide(double number1, double number2){

        // Exception Handling
        if (number2==0.0){
            System.out.println("Girdiğiniz bölüm kısmı 0 olamaz");
            return 0;
        }
        else {
            return number1 / number2;
        }


    }

    public static double difference(double number1, double number2){
        return  number1-number2;
    }
    public static double multiply(double number1, double number2){
        return number1*number2;
    }
    public static double sum(double number1, double number2){
        return number1 + number2;
    }






    // değer döndüren , değer döndürmeyen

    // değer döndürmeyen parametresiz metod.
    public static void sayHello(){
        System.out.println("Merhaba");
    }

    // değer döndürmeyen parametreli metod
    public static void  info(String name, String surname, int age){
        System.out.println("Adınız : "+name+", Soyadınız: "+surname+", Yaşınız:"+age);
    }

    // değer döndüren parametresiz metod;

    public static  double pi(){
        return 3.14;
    }

    // değer döndüren parametreli metodlar :
    // Kuvvetin Formülü : F = m * a

    public static double f(double m , double a){
        return m * a;
    }

}