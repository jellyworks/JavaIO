import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {
    public static void main(String[] args) {
        byte[] inArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outArray = null;
        byte[] temp = new byte[10];

        ByteArrayInputStream in = new ByteArrayInputStream(inArray);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        in.read(temp, 0, temp.length);
        out.write(temp, 5, 5);

        outArray = out.toByteArray();

        System.out.println("Input Source : "+ Arrays.toString(inArray));
        System.out.println("Temp Source : "+ Arrays.toString(temp));
        System.out.println("Ouput Source : "+ Arrays.toString(outArray));
    }
}
