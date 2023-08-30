class Solution{
    public void zigZag(int a[], int n){
        // Code your solution here. 
        int i=0;          
        while(i<a.length-1){
            if(a[i]>a[i+1]){
                int temp=a[i];    
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            i++;
            
            if( i<n-1&&a[i]<a[i+1]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                
            }
            i++;
        }
    }
}
