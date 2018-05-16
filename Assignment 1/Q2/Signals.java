//Java Program for Smoothening of sound signal stored as array of integers

public class Signals
{
    public int[] Smooth_signal(int[] signal)
    {
        int[] smooth = new int[signal.length];
        for(int i=0;i<signal.length;i++)
        {
            if(i==0)
                smooth[i]=(signal[i]+signal[i+1])/2;
            else if(i==signal.length-1)
                smooth[i]=(signal[i]+signal[i-1])/2;
            else 
                smooth[i]=(signal[i-1]+signal[i]+signal[i+1])/3;
        }
        
        return smooth;
    }
}
