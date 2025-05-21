import java.io.File;
import java.io.IOException;

public class CreateFileByIo {

    public static void main(String[] args) {

        // Đường dẫn tuyệt đối hardcoded
//        String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\CreateFile\\example.txt";

        // Đường dẫn tuyệt đối không phụ thuộc hệ điều hành(File.separator)
//        String filePath = "C:" + File.separator +"Private" + File.separator + "Udemy" + File.separator + "java-co-ban" + File.separator + "5.code" + File.separator + "CreateFile" +File.separator + "example.txt";

        // Đường dẫn tương đối
        String filePath = "example.txt";

        System.out.println("filePath: " + filePath);

        // Khởi tạo một đối tượng File với đường dẫn đã cho
        File file = new File(filePath);

        // Tạo tất cả folder cha nếu chưa tồn tại
        if (file.getParentFile() != null && !file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        try {
            // Kiểm tra xem file đã tồn tại chưa, nếu chưa thì tạo mới
            if (file.createNewFile()) {
                System.out.println("File đã được tạo thành công!");
            } else {
                System.out.println("File đã tồn tại.");
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo file: " + e.getMessage());
        }
    }

}