class Solution {
    String removeDuplicates(String str) {
        ArrayList<Character>arr=new ArrayList<>();
     for(int i=0;i<str.length();i++){
         if(!(arr.contains(str.charAt(i)))){
             arr.add(str.charAt(i));
         }
     }
     String st="";
     for(int i=0;i<arr.size();i++){
         st=st+arr.get(i);
     }
     return st;
    }
}
