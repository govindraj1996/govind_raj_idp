package Zemoso1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment3
{
    public static void main(String[] args) {
        System.out.println("Enter the number of Inputs");
        Scanner scan = new Scanner(System.in);

        int noOfInuts = scan.nextInt();
        System.out.println("Enter the " + noOfInuts + " Sets of date to check for.");
        System.out.println("Enter the date in dd-mm-yyyy formate");
        String data[][] = new String[noOfInuts][2];
        String signupdate = null;
        String currentdate = null;

        for (int i = 0; i < noOfInuts; i++) {
            signupdate = scan.next();
            currentdate = scan.next();
            data[i][0] = signupdate;
            data[i][1] = currentdate;
        }
        System.out.println("Outputs");

        for (int i = 0; i < noOfInuts; i++) {
            try {
                if (checkValidity(data[i][0]) && checkValidity(data[i][1]))
                {
                    getDataRange(data[i][0], data[i][1]);
                }

            } catch (Exception e) {
                System.out.println("Invalid Date");
            }
        }
        scan.close();
    }

    private static boolean checkValidity(String date)
    {
        boolean isvalid = false;
        if (date.length() == 10) {
            isvalid = true;
        }
        return isvalid;
    }

    static int getDataRange(String signup, String current) throws ParseException {


        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
        format.setLenient(false);
        Date signupDate = null, currentDate = null;
        try {
            signupDate = format.parse(signup);
            currentDate = format.parse(current);
        } catch (ParseException e) {
            System.out.println("Date id Invalid");
            return 0;
        }
        if (signupDate.after(currentDate)) {
            System.out.println("No Range");
        } else {
            Calendar calsignup = Calendar.getInstance();
            calsignup.setTime(signupDate);

            Calendar calcurrent = Calendar.getInstance();
            calcurrent.setTime(currentDate);

            int years = calcurrent.get(Calendar.YEAR) - calsignup.get(Calendar.YEAR);
            calsignup.add(Calendar.YEAR, years);
            calsignup.add(Calendar.DAY_OF_MONTH, -30);
            System.out.print(format.format(calsignup.getTime()) + " ");
            calsignup.add(Calendar.DAY_OF_MONTH, 60);

            if (calsignup.before(calcurrent)) {
                System.out.println(format.format(calsignup.getTime()));
            } else {
                System.out.println(format.format(calcurrent.getTime()));
            }

        } return 0;
    }






}
