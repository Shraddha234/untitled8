package main;


import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final Scanner scanner=new Scanner(System.in);
        int numberOfLEDs=Integer.parseInt(scanner.nextLine());
        LED[] array=new LED[numberOfLEDs];
        for (int i=0;i<array.length;i++){
            String colour_name=scanner.next();
            boolean working=scanner.nextBoolean();
            array[i]=new LED(colour_name,working);
        }
        Ledstrip strip=new Ledstrip(array);
        strip.printStripStatus();
        scanner.close();
    }
}