package Seminar1;

import java.util.Scanner;

public class main {
    //    private final static int MIN_LENGTH = 5; // константное значение
//    //реализуйте метод, принимающий в качестве аргумента целочисленный массив
//    // если длина массива меньше некоторого заданного минимума, метод возвращает -1
//    // в качестве кода ошибки, иначе - длину массива
//
//    public static void Seminar1.main(String[]args){
//        System.out.println(getSize(new int[]{1, 2}));
//        System.out.println(getSize(new int[]{1, 2, 3, 4, 5}));
//    }
//
//    public static int getSize(int[] array){
//        if(array.length < MIN_LENGTH){
//            return -1;
//        }
//        return array.length;
//    }
//}
    public static void main(String[] args) { // ввод возраста с проверкой на число
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
//        int age = Integer.parseInt(scanner.next());
        if(input.matches("\\d+")){
//            System.out.println("Некоректный ввод: " + input);
            throw new RuntimeException("Некоректный ввод: " + input);
        } else {
            int num = Integer.parseInt(input);
            System.out.println(num + 1);
        }
    }
}