import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileByNio {

    public static void main(String[] args) {
        // Đường dẫn tuyệt đối hardcoded
//        String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\CreateFile\\example.txt";

        // Đường dẫn tuyệt đối không phụ thuộc hệ điều hành(File.separator)
//        String filePath = Paths.get("C:", "Private", "Udemy", "java-co-ban", "5.code","CreateFile", "example.txt").toString();

        // Đường dẫn tương đối
        String filePath = "example.txt";

        // Tạo đối tượng Path từ đường dẫn đã cho
        Path path = Paths.get(filePath);

        try {
            // Tạo thư mục cha nếu chưa tồn tại
            if (path.getParent() != null && Files.notExists(path.getParent())) {
                Files.createDirectories(path.getParent()); // Tạo toàn bộ thư mục cha
            }

            if (Files.exists(path)){
                System.out.println("File đã tồn tại.");
            }else{
                // Tạo file nếu chưa tồn tại
                Files.createFile(path);
                System.out.println("File đã được tạo thành công!");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo file: " + e.getMessage());
        }
    }
}
