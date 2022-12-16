package Seminar3;

import org.w3c.dom.css.Counter;

import java.io.IOException;

public class Task4 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.incremen();
            counter.increment();
        } catch (IOException e) {
            System.out.println("Ошибка создания счетчика");
        }
        System.out.println("закончился блок try-with-resourses");

        String login = "123";
        String login1 = "sdsdsd";
    }
}
