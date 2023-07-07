class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> prog = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "*":
                    prog.push(prog.pop() * prog.pop());
                    break;
                case "+":
                    prog.push(prog.pop() + prog.pop());
                    break;
                case "-":
                    int subtractor = prog.pop();
                    int minuend = prog.pop();
                    prog.push(minuend - subtractor);
                    break;
                case "/":
                    int divisor = prog.pop();
                    int dividend = prog.pop();
                    int result = dividend / divisor;
                    prog.push(result);
                    break;
                default:
                    prog.push(Integer.parseInt(tokens[i]));
            }
        }
        return prog.pop();
    }
}