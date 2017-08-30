package alg;

import java.util.Scanner;

/**
 * Arrays: Left Rotation.
 * 
 * @author renato
 */
public class ArraysLeftRotation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for (int a_i = 0; a_i < n; a_i++)
        {
            a[a_i] = in.nextInt();
        }
        in.close();
        int first = 0;
        for (int i = 0; i < k; i++)
        {
            first = a[0];
            for (int j = 0; j < n - 1; j++)
            {
                a[j] = a[j + 1];
            }
            a[n - 1] = first;
        }
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
