public class q{
    public static void main(String[]args){
        int [] num = {1 , 2 , 1 , 5 , 8 , 9};
        System.out.println(rests(num));
            }
              public static boolean rests(int[] nums) {
            
            for(int i = 0 ; i < nums.length ; i++){
                for(int j = i+1 ; j<nums.length ; j++){
                    if(nums [i] == nums[j] ){
                        return true;
                    }
    
                }
            }
            return false;
        }
        
        }
    

