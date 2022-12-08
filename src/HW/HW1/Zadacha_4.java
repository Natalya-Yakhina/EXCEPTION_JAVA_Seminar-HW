package HW.HW1;

import java.util.Arrays;

//4. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов
// в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException,
// т.е. ваше
public class Zadacha_4 {
    public static void main(String[] args) {
//        int[] array1 = null;
        int[] array1 = {1, 4, 5};
        int[] array2 = {1, 0, 5};
        System.out.println(Arrays.toString(arrNewDivision(array1, array2)));
    }
    public static int[] arrNewDivision(int[] array1, int[] array2) {

        if (array1 == null || array2 == null) { // проверка на null
            throw new RuntimeException("Массив не может быть NULL!");
        }
        if (array1.length != array2.length) { // проверка на длину массива
            throw new RuntimeException("Массивы должны быть равной длины!");
        }
        int[] newArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("ДЕЛЕНИЕ НА НОЛЬ НЕВОЗМОЖНО!!!");
            }
            newArray[i] = array1[i] / array2[i];
        }
        return newArray;
    }
}
// хотела проверку деления на 0 вынести отдельным методом
//    private static void divisionByZero(int num) {
//        if (num == 0) {
//            throw new RuntimeException("ДЕЛЕНИЕ НА НОЛЬ НЕВОЗМОЖНО!!!");
//        }
//    }