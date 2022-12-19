package item9;

import java.io.Closeable;
import java.io.IOException;

public class BadInputStream implements Closeable {

    public int read(byte[] buf) throws IOException {
        System.out.println("\"Input Stream Read\" = " + "Input Stream Read");
        throw new ReadException("Input Stream Read");
    }

    public void close() throws IOException {
        System.out.println("\"Input Stream Close\" = " + "Input Stream Close");
        throw new CloseException("Input Stream Close");
    }
}
