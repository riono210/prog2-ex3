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
    char  coordinate[][];

    public Maze() {
        String filename = "./src/main/jp/ac/uryukyu/ie/e165729/map.txt";
        initial_position = new int[2];
        size_of_map = new int[2];


        try {
            Scanner scanner = new Scanner(new File(filename));
            for(int i = 0;scanner.hasNextLine();i++) {
                if (i == 0) {
                    String line11 = scanner.next();
                    String line12 = scanner.next();
                    int place1 = Integer.parseInt(line11);
                    int place2 = Integer.parseInt(line12);
                    initial_position[0] = place1;
                    initial_position[1] = place2;

                    // 座標の表示
                    System.out.printf("座標 x:%d y:%d\n", initial_position[0], initial_position[1]);
                } else if (i == 1) {
                    String line21 = scanner.next();
                    String line22 = scanner.next();
                    int size1 = Integer.parseInt(line21);
                    int size2 = Integer.parseInt(line22);
                    size_of_map[0] = size1;
                    size_of_map[1] = size2;

                    coordinate = new char[size_of_map[0]][size_of_map[1]];
                    // 大きさの表示
                    System.out.printf("迷路の大きさ：横%d　縦%d\n", size_of_map[0], size_of_map[1]);

                } else {
                    String line = scanner.nextLine();



                    //System.out.println(line);
                }
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }


}

