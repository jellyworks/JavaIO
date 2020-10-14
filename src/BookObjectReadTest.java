import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookObjectReadTest {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        ObjectOutputStream oos = null;
//        ArrayList<Book> list = new ArrayList<>();
        Book b1 = new Book("a0001", "자바완성", "정프로", 10000);
        Book b2 = new Book("a0002", "자바IO완성", "정프로1", 11000);
        Book b3 = new Book("a0003", "자바Net완성", "정프로2", 12000);
//        list.add(b1);list.add(b2);list.add(b3);

        try {
            fout = new FileOutputStream("booklist.dat");
            oos = new ObjectOutputStream(fout);

            oos.writeObject(b1);
            oos.writeObject(b2);
            oos.writeObject(b3);
            oos.reset();
            System.out.println("저장완료");

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                oos.close();
                fout.close();
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }

        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("booklist.dat");
            ois = new ObjectInputStream(fis);

            Book br1 = (Book)ois.readObject();
            Book br2 = (Book)ois.readObject();
            Book br3 = (Book)ois.readObject();
            System.out.println(br1);
            System.out.println(br2);
            System.out.println(br3);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

}
