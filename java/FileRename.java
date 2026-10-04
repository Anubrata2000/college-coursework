import java.io.File;

class FileRename {

    public static void main(String[] args) {
        String oldFileName = "anubrata.txt";
        String newFileName = "anubrata2.txt";
        
        File file = new File(oldFileName);
        
        try {
            if (file.exists()) {
                File newFile = new File("anubrata2.txt");
                
                boolean success = file.renameTo(newFile);
                
                if (success) {
                    System.out.println("File renamed successfully.");
                } else {
                    System.out.println("File renaming failed.");
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while renaming the file.");
            e.printStackTrace();
        }
    }
}
