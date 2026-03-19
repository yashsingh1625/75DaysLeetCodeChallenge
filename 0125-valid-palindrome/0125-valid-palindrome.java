class Solution {
    public boolean isPalindrome(String s) {
        int n  = s.length();
        int left = 0;
        int right = n-1;
        while(left<right){
            char l = s.charAt(left);
            char R = s.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(R)){
                right--;
                continue;
            }
            if(Character.toLowerCase(l) != Character.toLowerCase(R)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}