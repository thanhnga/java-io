import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LargeFileReader {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        // String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\ReadFile\\large_file+.txt";

        // Đường dẫn tương đối
        String filePath = "large_file.txt";

        try(
                FileReader fileReader = new FileReader(filePath);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                // Sử dụng tham số bufferSize
                // BufferedReader bufferedReader = new BufferedReader(fileReader, 1024 * 8);
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}
