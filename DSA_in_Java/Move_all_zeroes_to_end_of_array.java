class Solution {
    void pushZerosToEnd(int[] arr, int n) {

 if(n==1 || n==0)
  {
      return ;
  }
  int nz=0;
  int z=0;
  while(nz<n){
      if(arr[nz]!=0)
      {
          int temp=0;
          temp=arr[nz];
          arr[nz]=arr[z];
          arr[z]=temp;
          nz++;
          z++;
      }
      else
      {nz++;}
  }
        
  }
}
  
