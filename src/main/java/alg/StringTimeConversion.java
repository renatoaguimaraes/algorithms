package alg;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringTimeConversion
{

    static String timeConversion(String s)
    {
        try
        {
            DateFormat f1 = new SimpleDateFormat("hh:mm:ssa"); // HH for hour
            Date d = f1.parse(s);
            DateFormat f2 = new SimpleDateFormat("HH:mm:ss");
            return f2.format(d);
        }
        catch (ParseException e)
        {
            return null;
        }
    }

    public static void main(String[] args)
    {
        try (Scanner in = new Scanner(System.in))
        {
            String s = in.next();
            String result = timeConversion(s);
            System.out.println(result);
        }
    }
}
