import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            if(array.length !=10)
                throw  new IllegalArgumentException();

            int sum = 0;
            for (String number: array)
                sum += Integer.parseInt(number);

            System.out.println(sum);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        }catch (IllegalArgumentException e){
            System.out.println("Значений не 10");
        }

    }

}