import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fs = new Scanner(new File("/Users/zahirullahstanekzai/Documents/GitHub/AdventOfCode/Advent Of Code/src/input.txt"));

/*        int antwoord = 0;


        while (fs.hasNextLine()) {
            String line = fs.nextLine();
            line.trim();
            char[] charray = line.toCharArray();

            if (charray[charray.length-1] == 'X') {
                antwoord += 1;
            } else if (charray[charray.length-1] == 'Y') {
                antwoord += 2;
            } else if (charray[charray.length -1] == 'Z'){
                antwoord += 3;
            }

            if (charray[charray.length-1] == 'X' && charray[0] == 'A'
                    || (charray[charray.length-1] == 'Y' && charray[0] == 'B')
                    || (charray[charray.length-1] == 'Z' && charray[0] == 'C')
            ) {  //gelijkspel
                antwoord += 3;
            }

            if (charray[0] == 'A' && charray[charray.length-1] == 'Y'
                    || (charray[0] == 'B' && charray[charray.length-1] == 'Z')
                    || (charray[0] == 'C' && charray[charray.length-1] == 'X')) {
                antwoord += 6;
            }
            System.out.println(line);
            }
            */





        /* PART 2*/

        int antwoord =0;

        while (fs.hasNextLine()) {
            String line = fs.nextLine();
            char[] charray = line.toCharArray();
            line.trim();

            switch (getChar(charray)) {
                case 'X': //DRAW
                    if (charray[0] == 'A') { //ROCK
                        antwoord += 3; // ADD POINTS FOR SCISSORS
                    } else if (charray[0] == 'B') { //PAPER
                        antwoord += 1; // ADD POINTS FOR ROCK
                    } else antwoord += 2; // ADD POINTS FOR PAPER
                    break;
                case 'Y': //DRAW
                    if (charray[0] == 'A') { //ROCK
                        antwoord += 4; // 3+ POINTS FOR ROCK
                    } else if (charray[0] == 'B') {// PAPER
                        antwoord += 5; // 3 + POINTS FOR PAPER
                    } else if (charray[0] == 'C') { // SCISSORS
                        antwoord += 6; // 3 + POINTS FOR SCISSORS
                    }
                    break;
                case 'Z':
                    if (charray[0] == 'A') { // ROCK
                        antwoord += 8; // 6 + POINTS FOR PAPER
                    } else if (charray[0] == 'B') {// PAPER
                        antwoord += 9;  // 6 + POINTS FOR SCISSORS
                    } else antwoord += 7; //6 + POINTS ROCK
                    break;
            }


        }

        System.out.printf("Answer part 2: %s", antwoord);


    }

    static char getChar(char[] chars) {
        return chars[chars.length -1];
    }

}
