package Task7;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        System.out.println("//Ex1");
        int x = 25;
        int y = 37;
        int z = 39;
        System.out.println("Min number is: " + Method.findMin(x, y, z));

        //Ex2
        System.out.println("//Ex2");
        int a = 25;
        int b = 45;
        int c = 65;
        System.out.println("Average is: " + Method.findAverage(a, b, c));

        //Ex3
        System.out.println("//Ex3");
        String sentence = "DarTech123";

        int[] nums = {1,2,3,4,5,6};
        System.out.println((nums[1] + nums[3]));

        //Ex4
        System.out.println("//Ex4");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слова одной строкой через пробел");
        String input = sc.nextLine();
        int count = 0;

        if (input.length() != 0) {
            count++;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println("Вы ввели " + count + " слов");

        //Ex5
        int n = 1254212;
        System.out.println("Кол-во цифр: " + Method.numberOf2s(n));

        //Ex6
        int t = 6;
        System.out.println("Площадь пятиугольника: " + Method.pentagon(t));


        //Ex7
        int f = 252;
        System.out.println("Сумма = " + Method.sum(f));

        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
