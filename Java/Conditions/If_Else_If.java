package Java.Conditions;

public class If_Else_If {
    public static void main(String[] args)
    {
        int marks=65;

        if(marks<35){
            System.out.println("fail");
        }
        else if(marks>=35 && marks<45){
            System.out.println("D grade");
        }
        else if(marks>=45 && marks<60){
            System.out.println("C grade");
        }
        else if(marks>=60 && marks<75){
            System.out.println("B grade");
        }
        else if(marks>=75 && marks<90){
            System.out.println("A grade");

        }else if(marks>=90 && marks<100){
            System.out.println("A+ grade");

        }else{
            System.out.println("Invalid!");
        }

    }
}
