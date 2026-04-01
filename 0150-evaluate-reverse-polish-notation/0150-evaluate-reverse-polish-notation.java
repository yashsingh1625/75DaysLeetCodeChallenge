class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int sec = stack.pop();
                int frst = stack.pop();
                int res = 0;
                if(token.equals("+")){
                    res = frst + sec;
                }else if(token.equals("-")){
                    res = frst -sec;
                }else if(token.equals("*")){
                    res = frst * sec;
                }else if(token.equals("/")){
                    res = frst/sec;

                }
                stack.push(res);
            }else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}