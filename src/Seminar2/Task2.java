package Seminar2;

public class Task2 {

    // Обработайте возможные исключительные ситуации.
    // "Битые" значения в исходном массиве считайте нулями.
    // Можно внести в код правки, которые считаете необходимыми

    //    public static int sum(String[][] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 0; j < 5; j++){
//                int val = Integer.parseInt(arr[i][j]);
//                sum += val;
//            }
//        }
//        return sum;
//    }
    public static void main(String[] args) {
        String[][] arr = {{"1", "1"}, {"-1", "q"}};
        sum2d(arr);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
//        if(arr == null){
//            throw new IllegalArgumentException("массив не может быть NULL");
//        }
//        if(arr[0].length >= 5){
//            throw new IllegalArgumentException("Размер массива меньше 5");
//        }
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j].matches("-?\\d+")){
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return sum;
    }
}
