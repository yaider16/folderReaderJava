package persons;

import java.io.*;

public class PersonsJava {
    public static void main(String[] args) throws IOException {
        PersonsJava pj = new PersonsJava();
        try {
            pj.getPersons();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Person[] getPersons() throws IOException {
        String path = "C:\\Users\\tomas\\Documents\\Programacion\\TercerSemestreProgramacion{\\persistence\\src\\persons\\person2.txt";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while (br.readLine() != null) {
            String[] data = br.readLine().split("\\");
            Person person = new Person();
            person.code = data[0];
            person.name = data[1];
            person.lastName = data[2];
            person.genre = data[3].charAt(0);
            person.weight = Integer.parseInt(data[4]);
            person.salary = Integer.parseInt(data[5]);
        }
        return null;
    }
}
