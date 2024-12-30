import java.util.Scanner;
public class Switch2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
                String grade =sc.nextLine();
        switch(grade)
    {
        case "Grade1":
            System.out.println("GradeA");
            break;
        case "Grade2":
            System.out.println("GradeB");
            break;
        case "Grade3":
            System.out.println("GradeC");
            break;
        case "Grade4                                                                                    `":
            System.out.println("GradeD");
            break;
        default:
            System.out.println("Grade");
    }
    }
}
