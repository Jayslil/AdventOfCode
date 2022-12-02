import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fs = new Scanner(new File("/Users/zahirullahstanekzai/IdeaProjects/Advent Of Code/src/input.txt"));

        int antwoord = 0;

        int huidig = 0;



        while (fs.hasNextLine()) {
            String line = fs.nextLine();
            char[] charray = line.toCharArray();
            if (charray[charray.length-1] == 'X') {
                antwoord += 1;
            } else if (charray[charray.length-1] == 'Y') {
                antwoord += 2;
            } else if (charray[charray.length -1] == 'Z'){
                antwoord += 3;
            }

            if (charray[charray.length-1] == charray[0]) {  //gelijkspel
                antwoord += 3;
            }

            if ((charray[0] == 'A' && charray[charray.length-1] == 'Y'
                    || (charray[0] == 'B' && charray[charray.length-1] == 'Z')
                    || (charray[0] == 'C' && charray[charray.length-1] == 'X'))) {
                antwoord += 6;
            }

        }



        System.out.println(antwoord);
    }
}
