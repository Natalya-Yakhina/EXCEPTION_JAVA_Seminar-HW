package Seminar3;

import Seminar3.custon_eception.ChangePermissionException;
import Seminar3.custon_eception.UpdatePersonException;

import java.io.IOException;

// // Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
//// тело самого метода прописывать не обязательно. Вызовите этот метод из main иобработайте в нем исклчение,
//// которое вызвал метод doSomething().
public class Task3 {
    public static void main(String[] args) {
        //changePermission(0, "abc");
//        updatePerson();
    }

    public static void findPerson(int id) throws IOException {
        throw new IOException();
    }

    private static void changePermission(int id, String newPermision) throws ChangePermissionException {
        try {
            findPerson(0);
        } catch (Exception exception) {
            System.out.println("Не удалось обновить права");
            throw new ChangePermissionException("Не удалось обновить права", exception);
        }
    }

    private static void updatePerson() throws UpdatePersonException {
        try {
            findPerson(0);
        } catch (Exception exception) {
            System.out.println("Не удалось выполнить обновление");
            throw new UpdatePersonException("Не удалось выполнить обновление");
        }
    }
}
