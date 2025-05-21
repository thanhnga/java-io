import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterByIo {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        // String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\WriteFile\\example.txt";

        // Đường dẫn tương đối
        String filePath = "example.txt";

        String content = "Nội dung bạn muốn ghi vào tệp.";

        // Sử dụng try with resource
        try (
                FileWriter fileWriter = new FileWriter(filePath)
        ) {

            fileWriter.write(content); // Ghi nội dung vào tệp
            System.out.println("Đã ghi dữ liệu vào " + filePath);

        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi ghi dữ liệu vào " + filePath);
        }
    }
}
