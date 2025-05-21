import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWriterByNio {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        // String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\WriteFile\\example.txt";

        // Đường dẫn tương đối
        String filePath = "example.txt";

        // Đường dẫn đến file cần ghi
        Path path = Paths.get(filePath);

        try {
            // Dữ liệu cần ghi vào file
            String content = "Đây là nội dung mẫu để ghi vào file.";

            // Ghi dữ liệu vào file
            // Tự đóng tài nguyên bên trong hàm write
            Files.write(path, content.getBytes());
            System.out.println("Đã ghi dữ liệu vào file thành công.");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi ghi dữ liệu vào file: " + e.getMessage());
        }
    }
}
