import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {
    public static void main(String[] args) {
        byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        byte[] outSrc = null;

        ByteArrayInputStream in = new ByteArrayInputStream(inSrc);
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        int data = 0;
        while ((data = in.read())!=-1){
            out.write(data);
        }
        outSrc = out.toByteArray();
        try {
            in.close();
            out.close();
        }catch (Exception e){
            e.printStackTrace();

        }
        System.out.println("Input Data : "+ Arrays.toString(inSrc));
        System.out.println("Ouput Data : "+Arrays.toString(outSrc));

    }
}
