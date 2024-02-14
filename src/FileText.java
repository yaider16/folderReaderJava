import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {
    private String path;

    public void setPath(String path) {
        this.path = path;
    }

    public void createFile(String content) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }else{
            // Abrir FileWriter en modo de escritura, pasando true para que los cambios se agreguen al final del archivo
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();
        }
    }
}
