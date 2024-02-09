import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileText {
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean createFile() throws IOException {
        File file = new File(path);
        BufferedWriter bw;
        if (!file.exists()){
            bw = new BufferedWriter(new FileWriter(file));
            bw.close();
        }else{
            return false;
        }
        return true;
    }
}
