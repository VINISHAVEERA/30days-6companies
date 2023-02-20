



class Solution {
    int evalRPN (String[] tokens) {
        Stack<String> stack = new Stack<String>();
        String result, choice;
        int value = 0;
        String topush = "";
        for(int i = 0; i < tokens.length; i++) {
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(tokens[i]);
                continue;
            }
            else {
                choice = tokens[i];
            }
            if(choice.equals("+")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                value = second + first;
                result = topush + value;
                stack.push(result);
            }
            else if(choice.equals("-")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                value = second - first;
                result = topush + value;
                stack.push(result);
            }
            else if(choice.equals("*")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                value = second * first;
                result = topush + value;
                stack.push(result);
            }
            else if(choice.equals("/")) {
                int first = Integer.parseInt(stack.pop());
                int second = Integer.parseInt(stack.pop());
                value = second / first;
                result = topush + value;
                stack.push(result);
            }
            else {
                continue;
            }
        }
        return Integer.parseInt(stack.pop());
    }
}
