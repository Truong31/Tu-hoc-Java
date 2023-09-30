package OOP.Bai46_Interface;

public class SapXepChen implements SapXepInterface {

    @Override
    public void sapXepTang(double[] arr) {
        double tmp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        double tmp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i] < arr[j])
                {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
    }
    
}
