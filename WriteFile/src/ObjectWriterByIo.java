import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriterByIo {
    public static void main(String[] args) {
        // Đối tượng cần ghi vào file
        Person person = new Person("Nga Nguyễn", 40, "Senior Developer");

        // Đường dẫn tuyệt đối
        // String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\WriteFile\\nga_nguyen.ser";
        // Đường dẫn tương đối
        String filePath = "nga_nguyen.ser";

        try (
                // Tạo một đối tượng FileOutputStream để ghi vào file
                FileOutputStream fileOut = new FileOutputStream(filePath);

                // Tạo một đối tượng ObjectOutputStream để ghi đối tượng Java vào luồng dữ liệu
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        ) {

            // Ghi đối tượng vào luồng dữ liệu
            objectOut.writeObject(person);
            System.out.println("Đã ghi đối tượng vào file thành công.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
