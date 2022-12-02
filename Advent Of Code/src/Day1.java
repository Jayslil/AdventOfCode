import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fs = new Scanner(new File("/Users/zahirullahstanekzai/IdeaProjects/Advent Of Code/src/input.txt"));

        int antwoord = 0;

        int huidig = 0;

        ArrayList<Integer> grootsteDrie = new ArrayList<>();

        while (fs.hasNextLine()) {
            String line = fs.nextLine();
            if (line.length() == 0) {
                antwoord = Math.max(antwoord, huidig);
                grootsteDrie.add(huidig);
                huidig = 0;
            }
            else {
                huidig += Integer.parseInt(line);
            }
        }
        grootsteDrie.add(huidig);
        Collections.sort(grootsteDrie);
        antwoord = grootsteDrie.get(grootsteDrie.size()-1)+grootsteDrie.get(grootsteDrie.size()-2)+grootsteDrie.get(grootsteDrie.size()-3);

        System.out.println(antwoord);



        }


    }