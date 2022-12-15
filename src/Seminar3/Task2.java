package Seminar3;

import java.io.IOException;

// Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
// тело самого метода прописывать не обязательно. Вызовите этот метод из main иобработайте в нем исклчение,
// которое вызвал метод doSomething().
public class Task2 {
    public static void main(String[] args) {
        try{
            findPerson();
        } catch (Exception exception){
            System.out.println("Не удалось выполнить обновление");
            throw new RuntimeException("Не удалось выполнить обновление");
        }
    }

    private static void findPerson() throws IOException{
        throw new IOException();
    }
}
