public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
			if(input.length<=1){
          if(input[0]==x){
            return 0;
          }else{
            return -1;
          }
        }
      	int []smallArray=new int[input.length-1];
      	for(int index=1;index<input.length;index++){
          smallArray[index-1]=input[index];
        }
	    int val=lastIndex(smallArray,x);
      	if(val==-1){
          if(input[0]==x){
            return 0;
          }
        }
      	if(val>=0){
	      	return ++val; 
        }
      	return -1;
      }
}
