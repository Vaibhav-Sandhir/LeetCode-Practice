class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(stack.isEmpty()){
                return false;
            }
            else if(stack.peek() == map.get(c)){
                stack.pop();
            }
            else{
                return false;
            }
        }

        return stack.isEmpty();
    }
}
