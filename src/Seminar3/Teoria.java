// 1. Программы могут заканчивать свое выполнение внезапно (ошибка)
// 2. Программа завершается, потому что мы эти ошибки (исключительные ситуации) не обработали
// 3. Есть стандартные ошибки (IndexOutOfBound, /0, NPE)
// 4. Мы можем генерировать исключительные ситуации сами (thows)
// 5. Мы можем обрабатывать их с помощью try - catch. Если можем обработать с помощью if, то обрабатываем if
// 6. catch может быть много, обрабатываем от узкого типа к широкому
// 7. Есть объекты, которые открывают поток данные. Надо закрыть после использования, для предотвращения утечек.
package Seminar3;

public class Teoria {
    public static void main(String[] args) {
        System.out.println('1');
    }
}
