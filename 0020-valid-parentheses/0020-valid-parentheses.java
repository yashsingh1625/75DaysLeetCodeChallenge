class Solution {
    public boolean isValid(String s) {
        // while(true){
        //     if(s.contains("()")){
        //         s = s.replace("()" ,"");
        //     }else if(s.contains("{}")){
        //         s = s.replace("{}" , "");
        //     }
        //     else if(s.contains("[]")){
        //         s =s.replace("[]" , "");
        //     }else{
        //         return s.isEmpty();
        //     }
        // }




        
        Stack<Character> ss = new Stack<>();
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0; i<n; i++){
            char ch = arr[i];
        
        // if(ch == '(' || ch == '{' || ch == '[') {
            if (ch == '(' || ch == '{' || ch == '[') {
                ss.push(ch);
            }else{ if(ss.isEmpty()) return false;
                char top = ss.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            
            }
        }
        return ss.isEmpty();
    }
}

