import java.io.*;
import java.util.Scanner;

public class filesLecture {
    public static void main(String[] args) {
        filesLecture file = new filesLecture();
        try {
            file.info("src/people.txt");
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
    }
    public void info(String path) throws IOException {
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while(br.readLine() != null){
            System.out.println(br.readLine());
        }
    }
}
