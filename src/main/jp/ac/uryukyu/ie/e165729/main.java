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
        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
