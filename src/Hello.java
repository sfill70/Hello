import java.util.*;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Sfill on 07.07.2016.
 */
public class Hello {
    public Hello() {
    }

   static Hello[] nHello;

    public static void configureHello(Hello... newHello) {
        nHello = new Hello[newHello.length];
        nHello = newHello;
        for (int i = 0; i < newHello.length; i++) {
            nHello[i] = newHello[i];
        }
    }

    public static void main(String[] args) {
        int[]array2=new  int[10];
        configureHello(new Hello (), new Hello(), new Hello());
        System.out.println(nHello.length);
        List <Hello>helloList=Arrays.asList(nHello);
        configureHello(new Hello [10]);
        System.out.println(nHello.length);

        for (Hello hl:nHello) {
            System.out.println(hl);
        }



        for (int i = 0; i < 10; i++) {
            System.out.println("Hello, Java!");
        }

        System.out.println("agvegesbgb".replaceAll(".", "*"));
        System.out.println("agvegesbgb--".replaceAll(".", "*"));
        List<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(0, 15);
        list.remove(1);

        for (Integer in : list
                ) {
            System.out.println(in);
        }
        Date date = new Date();
        System.out.println(date.getMonth() + " mouns");
        System.out.println(date.getDay() + " day");
        System.out.println(date.getYear() + " year");
        Date today = new Date();
        System.out.println("Current date: " + today);
        System.out.println(today.getYear());

        System.out.println(Math.ceil(23.0 / 6.0));

        System.out.println(Integer.toString(12345, 36));
        int num = 123454321;
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        System.out.println(sb.reverse().toString().equals(Integer.toString(num)));

        String str = "dbv4_654dfbdb";
        String mr = "\\[a-z]";
        System.out.println(str.replaceAll("\\w", "!"));
        System.out.println(str.matches("\\w+"));

        int[] ints = {0, 4, 8, 0, 10, 34, 0, 0, 67, 78, 0, 23, 12, 16, 0};
        compressTiles(ints);
        System.out.println(Arrays.toString(ints));

        int[] ints2 = {4, 4, 4, 4};
        System.out.println(Arrays.toString(ints2));
        mergeTiles(ints2);
        System.out.println(Arrays.toString(ints2));


        int[][] array = resetGameTiles(10, 10);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(array.length);
      //  System.out.println(array[0].length);
        rotation(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(array.length);
        System.out.println(array[0].length);
    }

    static void compressTiles(int[] tiles) {
        // int tmp=0;
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i] == 0) {
                //  tmp=i;
                for (int j = i + 1; j < tiles.length; j++) {
                    if (tiles[j] > 0) {
                        tiles[i] = tiles[j];
                        tiles[j] = 0;
                        break;
                    }
                }
            }

        }
    }

    static void mergeTiles(int[] tiles) {
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i] == tiles[i + 1]) {
                tiles[i] = tiles[i] * 2;
                for (int j = i + 1; j < tiles.length - 1; j++) {
                    tiles[j] = tiles[j + 1];
                }
                tiles[tiles.length - 1] = 0;

            }
        }
    }

    public static int[][] resetGameTiles(int width, int height) {
        int[][] gameTiles = new int[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                gameTiles[i][j] = j;
            }
        }
        return gameTiles;
    }

    public static void rotation(int matr[][]) {
      int n = matr.length;
        int tmp;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j <n - 1 - i; j++) {
                tmp = matr[i][j];
                matr[i][j] = matr[n - j - 1][i];
                matr[n - j - 1][i] = matr[n - i - 1][n - j - 1];
                matr[n - i - 1][n - j - 1] = matr[j][n - i - 1];
                matr[j][n - i - 1] = tmp;
            }
        }
    }


}
