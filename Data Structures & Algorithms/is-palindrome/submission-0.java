class Solution {
    public boolean isPalindrome(String s) {
         int left = 0;
        int right = s.length()-1;

        while(left<right){
            char cleft = s.charAt(left);
            char cRight = s.charAt(right);
            if(!Character.isLetterOrDigit(cleft)){
                left++;
            }else if(!Character.isLetterOrDigit(cRight)){
                right--;
            }else{
                if(Character.toLowerCase(cleft)!=Character.toLowerCase(cRight)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
