package Seminar2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Task3 {
    public static void main(String[] args) {
        InputStream inputStream;
        String[] strings = {"sddf", "fgfg"};
        String string = strings[0];
        try {
            inputStream = new FileInputStream("44");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("Выполненно");
        }
    }
}
// если несколько catch, обрабатывать от более узкого к более широкому
