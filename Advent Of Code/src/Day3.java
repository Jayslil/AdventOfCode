import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner fs = new Scanner(new File("/Users/zahirullahstanekzai/Documents/GitHub/AdventOfCode/Advent Of Code/src/input.txt"));

        int ans = 0;

/*        while (fs.hasNextLine()) {
            String line = fs.nextLine();

            int half = line.length() / 2;


            String firstHalf = line.substring(0,half);
            String secondHalf = line.substring(half);

            for (int i = 0; i < firstHalf.length(); i++) {
                char c = line.charAt(i);
                if (secondHalf.contains(String.valueOf(c))) {
                    System.out.println((c - 'a') + 1);
                    if (c <= 'Z') {
                        ans += (c - 'A') + 27;
                    } else {
                        ans += (c - 'a') + 1;
                    }
                    break;
                }
            }

        }
        System.out.printf("answer part 1: %s%n", ans);*/

        /* Part 2*/



        while (fs.hasNextLine()) {
            String elf1 = fs.nextLine();
            String elf2 = fs.nextLine();
            String elf3 = fs.nextLine();

            for (int i = 0; i < elf1.length(); i++) {
                char badge = elf1.charAt(i);
                if (elf2.contains(String.valueOf(badge)) && elf3.contains(String.valueOf(badge))) {
                    if (badge <= 'Z') {
                        ans += (badge - 'A') + 27;
                    } else {
                        ans += (badge - 'a') + 1;
                    }
                    break;
                }


            }

        }

        System.out.printf("part 2: %s",ans);


    }

}



