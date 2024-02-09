import java.io.File;

public class FilesDocumentsReader {
    public static void main(String[] args) {
        FilesDocumentsReader filesDocumentsReader = new FilesDocumentsReader();
        filesDocumentsReader.readDocument("src");
    }

    public void readDocument(String path) {
        // Aqui creo un objeto de tipo File y le paso la ruta de la carpeta que quiero leer
        File file = new File(path);

        // Aqui creo un arreglo de tipo File y le paso el objeto file que cree anteriormente
        File[] files = file.listFiles();

        // verifico si el arreglo de tipo File esta vacio o no de no ser asi recorro el arreglo y muestro el nombre de los archivos
        if (files != null) {
            for (File filenum : files) {
                if (filenum.isFile()) {
                    System.out.println(filenum.getName());
                }
            }
        } else {
            System.out.println("La carpeta esta vacia o no existe.");
        }
    }
}
