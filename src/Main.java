import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileText text = new FileText();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del archivo");
        String name = sc.nextLine();
        text.setPath("src/"+name+".txt");
        System.out.println("Ingrese que desea ingresar dentro del archivo");
        String content = sc.nextLine();
        text.createFile(content);
    }
}