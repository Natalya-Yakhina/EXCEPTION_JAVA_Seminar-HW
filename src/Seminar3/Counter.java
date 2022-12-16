package Seminar3;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable {
    boolean isClosed = false;
    int count = 0;

    @Override
    public void close() throws IOException {
        isClosed = true;
        System.out.println("Счетчик");
    }

    public void increment(){
        count++;
    }

    public int get(){
        return count;
    }
}
