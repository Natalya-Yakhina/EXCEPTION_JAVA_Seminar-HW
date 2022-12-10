package Seminar2;

import java.util.Scanner;

public class Task1 {
    // исправить код
    // public static void main(String[] args) {
    // Scanner iScanner = new Scanner(System.in);
    // int[] arr = new int[10];
    // System.out.println("Укажите индекс элементов массива, в который хотите записать значение 1");
    //int index = iScanner.nextInt();
    // try{
    //   arr[index] = 1;
    //} catch (Exception e){
    // System.out.println("Указан индекс за пределами массива");
    //}
    //}

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Укажите индекс:");
        String input = iScanner.next();
        if(!input.matches("\\d+")){
            System.out.println("Введите число");
            return;
        }

        int index = Integer.parseInt(input);
        if(index >= arr.length){
            System.out.println("Индекс за пределами массива");
            return;
        }
        System.out.println(arr[index]);
    }
}
