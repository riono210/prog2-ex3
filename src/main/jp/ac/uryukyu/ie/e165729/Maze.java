package jp.ac.uryukyu.ie.e165729;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



/**
 * Created by e165729 on 2016/12/13.
 */
public class Maze {
    int initial_position[];
    int size_of_map[];
    char coordinate[][];

    public Maze() {
        String filename = "./src/main/jp/ac/uryukyu/ie/e165729/map.txt";

        try {
            Scanner scanner = new Scanner(new File(filename));
            for (int i = 0; scanner.hasNextLine(); i++) {
                if (i == 0) {
                    for (int k = 0; k <= 1; k++) {
                        String line1 = scanner.next();
                        int place = Integer.parseInt(line1);
                        initial_position[k] = place;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
