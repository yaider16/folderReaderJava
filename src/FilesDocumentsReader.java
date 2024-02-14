import java.io.File;

public class FilesDocumentsReader {
    public static void main(String[] args) {
        FilesDocumentsReader filesDocumentsReader = new FilesDocumentsReader();
        filesDocumentsReader.readDocument("src");
    }

    public void readDocument(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        if (files != null) {
            for (File fileNum : files) {
                if (fileNum.isFile()) {
                    System.out.println(fileNum.getName());
                }
            }
        } else {
            System.out.println("La carpeta esta vacia o no existe.");
        }
    }
}
