// Fadi Basheer
//A01074701
//SET O

//Using Brute_Force to find three separate numbers (a triple) that add up to a multiple of 37

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Brute_Force {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        String fileName = "data1.txt";
        
        //Reading from file
        try {
            File myObj = new File(fileName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                numbers.add(Integer.valueOf(data));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        int sum = 0;
        for (int i = 0; i < numbers.size() - 2; i++) {
            for (int j = i + 1; j < numbers.size() - 1; j++) {
                for (int f = j + 1; f < numbers.size(); f++) {
                    sum = numbers.get(i) + numbers.get(j) + numbers.get(f);
                    if (sum % 37 == 0) {
                        System.out.println(fileName + " " + "{" + numbers.get(i) + ", " + numbers.get(j) + ", " + numbers.get(f) + "}");
                        System.out.println("Sum: " + sum);
                        return;
                    }
                }
            }
        }
    }
}
