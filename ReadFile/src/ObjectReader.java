import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        // String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\ReadFile\\nga_nguyen.ser";

        // Đường dẫn tương đối
        String filePath = "nga_nguyen.ser";

        try (
                FileInputStream fileInputStream = new FileInputStream(filePath);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ) {
            Person person = (Person) objectInputStream.readObject();
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Role: " + person.getRole());

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}
