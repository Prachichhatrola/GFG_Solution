class Third_largest_element
{
    int thirdLargest(int arr[], int n)
    {
	    // Your code here
	    int max=Integer.MIN_VALUE;
	    int count=0;
	    while(count!=3){
	        for(int i=0;i<n; i++){
	            if(arr[i]>max){
	                max=arr[i];
	            }
	        }
	        if(count==2){
	            break;
	        }
	        for(int i=0;i<n;i++){
	            if(arr[i]==max){
	                arr[i]=0;
	                max=Integer.MIN_VALUE;
	                count++;
	                break;
	            }
	        }
	    }
	    return max;    
    }
}

