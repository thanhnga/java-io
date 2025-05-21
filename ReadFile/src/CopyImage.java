import java.io.*;

public class CopyImage {
    public static void main(String[] args) {
        String inputFilePath = "read-file-classes.png";  // Đường dẫn tới file hình ảnh nguồn
        String outputFilePath = "read-file-classes-copy.png"; // Đường dẫn tới file hình ảnh đích

        try (
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(inputFilePath));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(outputFilePath))
        ) {

            byte[] buffer = new byte[1028 * 8]; // Kích thước buffer (8KB)
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead); // Ghi dữ liệu vào file đích
            }

            System.out.println("Hình ảnh đã được sao chép thành công!");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}
