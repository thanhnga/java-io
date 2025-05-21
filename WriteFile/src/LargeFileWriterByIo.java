import java.io.*;

public class LargeFileWriterByIo {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        //String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\WriteFile\\large_file_io.txt";

        // Đường dẫn tương đối
        String filePath = "large_file_io.txt";
        try (
                FileWriter fileWriter = new FileWriter(filePath);

                // Không sử dụng tham số bufferSize
//                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                // Sử dụng tham số bufferSize
                 BufferedWriter bufferedWriter =  new BufferedWriter(fileWriter, 1024 * 8);

        ) {
            // Ghi 1 triệu dòng dữ liệu vào tệp
            for (int i = 1; i <= 1000000; i++) {
                String data = "Dòng " + i + "\n";
                bufferedWriter.write(data);
            }
            System.out.println("Đã ghi dữ liệu vào " + filePath);

        } catch (IOException e) {
            System.out.println("Xảy ra lỗi khi ghi dữ liệu vào " + filePath);
        }
    }
}
