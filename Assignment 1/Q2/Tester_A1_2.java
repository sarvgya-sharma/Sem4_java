//Tester for class Signals

public class Tester_A1_2
{
    public static void main(String[] args)
    {
        Signals obj = new Signals();
        int[] signal = {1,5,4,5,7,6,8,6,5,4,5,4};
        
        System.out.println("\nExpected: 3 3 4 5 6 7 6 6 5 4 4 4\n");
        int[] smooth = obj.Smooth_signal(signal);
        for(int i=0;i<smooth.length;i++)
        {
            System.out.print(" "+smooth[i]);
        }   
    }
}
        
        