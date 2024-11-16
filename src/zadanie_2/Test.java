package zadanie_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {

        System.out.println(parseFileToStringList());


    }
    public static List<String> parseFileToStringList () {
        File file = new File("people.txt");
        List<String> people = new LinkedList<>();
        try {
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                String stroca = input.nextLine();
                String[] person = stroca.split(" ");
                if (Integer.parseInt(person[1]) < 0)
                    throw new IllegalArgumentException();
                people.add(stroca);
            }
            return people;

        }

        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (IllegalArgumentException e) {
            System.out.println("Некоректный входной файл");
        }
        return null;


    }
}