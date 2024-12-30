public class Array {
    public static void main(String[] args)
    {
        double[] myLst={1.9,2.9,3.4,3.5};
        for(int i=0;i<myLst.length;i++)
        {
            System.out.println(myLst[i]+ "");
        }
        double sum=0;
        for (int i=0;i<myLst.length;i++)
        {
            sum+=myLst[i];
        }
        double avg=sum/myLst.length;
        System.out.println("sum is "+sum);
        System.out.println("Avg is " +avg);
    }
}
