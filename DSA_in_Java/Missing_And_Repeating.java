class Solve {
    int[] findTwoElement(int arr[], int n) {
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
            xor=xor^(i+1);
        }
        int bit=0;
        while(true)
        {
            if((xor & (1<<bit))!=0)
            {
                break;
            }
            bit++;
        }
        int one=0;
        int zero=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i] & (1<<bit))==0)
            {
                zero=zero^arr[i];
            }
            else
            {
                one=one^arr[i];
            }
        }
        for(int i=1;i<=n;i++)
        {
            if((i & (1<<bit))==0)
            {
                zero=zero^i;
            }
            else
            {
                one=one^i;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==one)
            {
                count++;
            }
        }
        if(count>1)
        {
            return new int[]{one,zero};
        }
        return new int[]{zero,one};
        
     
      
    }
}
