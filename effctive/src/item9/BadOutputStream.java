package item9;

import java.io.Closeable;
import java.io.IOException;

public class BadOutputStream implements Closeable {

    public void write(byte[] buf, int i, int n) throws IOException {
        System.out.println("\"Output Stream write\" = " + "Output Stream write");
        throw new IOException("Output Stream write");
    }

    public void close() throws IOException {
        System.out.println("\"Output Stream Close\" = " + "Output Stream Close");
        throw new IOException("Output Stream Close");
    }

}
