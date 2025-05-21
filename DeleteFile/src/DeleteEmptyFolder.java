import java.io.File;

public class DeleteEmptyFolder {
    public static void main(String[] args) {
        File folder = new File("empty-folder");

        if(folder.exists()) {
            if (folder.delete()) {
                System.out.println("Thư mục đã được xóa thành công.");
            } else {
                System.out.println("Không thể xóa thư mục (có thể không trống hoặc không tồn tại).");
            }
        }else {
            System.out.println("Thư mục không tồn tại!");
        }
    }
}
