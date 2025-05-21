import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // Đường dẫn tuyệt đối
        //String filePath = "C:\\Private\\Udemy\\java-co-ban\\5.code\\DeleteFile\\example.txt";
        // Đường dẫn tương đối
        String filePath = "example.txt";
        File file = new File(filePath);
        if(file.exists()) {
            boolean success = file.delete();
            if (success) {
                System.out.println("File đã được xóa thành công.");
            }else {
                System.out.println("Không thể xóa File.");
            }
        }else {
            System.out.println("Không thể xóa File.");
        }
    }
}
