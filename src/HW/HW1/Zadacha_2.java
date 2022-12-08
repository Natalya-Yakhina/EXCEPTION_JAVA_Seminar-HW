package HW.HW1;

//2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
public class Zadacha_2 {

    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3"}, {null, null, null}}; //NullPointerException
        System.out.println(sum2d(array));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // ArrayIndexOutOfBoundsException - если в столбцах значение меньше
                int val = Integer.parseInt(arr[i][j]);  // NumberFormatException - если строка символы и не преобразовать в число
                sum += val;
            }
        }
        return sum;
    }
}
