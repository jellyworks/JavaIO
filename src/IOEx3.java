import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {
    public static void main(String[] args) {
        byte[] indata = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outdata = null;
        byte[] buf = new byte[4];

        ByteArrayInputStream bis = new ByteArrayInputStream(indata);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        System.out.println("Input Data : "+Arrays.toString(indata));
        try {
            while(bis.available()>0){
                int len = bis.read(buf);
                bos.write(buf, 0, len);
                outdata = bos.toByteArray();
                System.out.println("temp : "+ Arrays.toString(buf));
                System.out.println("Output Data : "+ Arrays.toString(outdata));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

