package jp.ac.uryukyu.ie.e165729;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ichikitakahiro on 2016/11/22.
 */
public class main {
    public static void main(String[] args) {
        String filename = "./src/main/jp/ac/uryukyu/ie/e165729/map.txt";
        Scanner scanner;
        int[] fast_place = new int[2];
        int[] size_of_map = new int[2];

        try {
            scanner = new Scanner(new File(filename));
            for(int i = 0;scanner.hasNextLine();i++) {
                if (i == 0) {
                    for(int k = 0; k <= 1; k++) {
                        String line1 = scanner.next();
                        int place = Integer.parseInt(line1);
                        fast_place[k] = place;
                    }
                    // 座標の表示
                    System.out.printf("座標 x:%d y:%d\n",fast_place[0],fast_place[1]);
                } else if (i == 1) {
                    for(int k = 0; k <= 1; k++) {
                        String line2 = scanner.next();
                        int size = Integer.parseInt(line2);
                        size_of_map[k] = size;
                    }
                    // 大きさの表示
                    System.out.printf("迷路の大きさ：横%d　縦%d\n",size_of_map[0],size_of_map[1]);
                } else {
                    String line = scanner.nextLine();
                    System.out.println(line);
                }
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
