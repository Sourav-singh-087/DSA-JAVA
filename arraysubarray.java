public class arraysubarray {
    public static void subarry(int numbers[]){
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i =0;i<numbers.length;i++){
            int start = i;
            for(int j =i;j<numbers.length;j++){
                int end=j;
                currSum =0;
                for(int k=start;k<=end;k++){
                    currSum += numbers[k];

                

                }System.out.println(currSum);
                if (maxsum < currSum){
                    maxsum = currSum;
                }

            }
            
        }System.out.println("max sum= " + maxsum);
    }
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs =0;
        for(int i =0;i<numbers.length;i++){
            cs = cs + numbers[i];
            if(cs<0 ){
                cs =0 ;
            }
            ms = Math.max(cs,ms);

        }
        System.out.println("our max subarray is : "+ ms);
    }
    public static void main (String args[]){
    int numbers[] ={-2,-3,-4,-6,8,-4,10};
    kadanes(numbers);
    }
}
