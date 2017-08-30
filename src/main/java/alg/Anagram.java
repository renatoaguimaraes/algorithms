package alg;

import java.util.Scanner;

public class Anagram
{
    public static int numberNeeded(String first, String second)
    {
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        int[] counts = new int[26];
        char a = 'a';
        for (int i = 0; i < firstChar.length; i++)
        {
            counts[firstChar[i] - a]++;
        }

        for (int i = 0; i < secondChar.length; i++)
        {
            counts[secondChar[i] - a]--;
        }
        int sum = 0;
        for (int i = 0; i < counts.length; i++)
        {
            sum += Math.abs(counts[i]);
        }
        return sum;
    }

    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            String a = in.next();
            String b = in.next();
            System.out.println(numberNeeded(a, b));
        }
    }
}
