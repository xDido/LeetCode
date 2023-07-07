class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking(result, 0, 0, "", n);
        return result;
    }

    public void backtracking(List<String> result, int openN, int closeN, String current_string, int max) {
        if (current_string.length() == max * 2) {
            result.add(current_string);
            return;
        }
        if (openN < max) backtracking(result, openN + 1, closeN, current_string + "(", max);
        if (closeN < openN) backtracking(result, openN, closeN + 1, current_string + ")", max);

    }
}