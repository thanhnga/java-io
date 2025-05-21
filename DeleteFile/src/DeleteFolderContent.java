import java.io.File;

public class DeleteFolderContent {
    public static void main(String[] args) {
        File folder = new File("folder-content");

        if (deleteFolder(folder)) {
            System.out.println("Thư mục và nội dung đã được xóa thành công.");
        } else {
            System.out.println("Không thể xóa thư mục.");
        }
    }

    public static boolean deleteFolder(File folder) {
        if (folder.isDirectory()) {
            // Lặp qua các file/thư mục con
            File[] files = folder.listFiles();
            if (files != null) { // Kiểm tra nếu thư mục không trống
                for (File file : files) {
                    deleteFolder(file); // Gọi đệ quy để xóa file/thư mục con
                }
            }
        }
        // Xóa file hoặc thư mục (sau khi đã xử lý nội dung bên trong)
        return folder.delete();
    }
}
