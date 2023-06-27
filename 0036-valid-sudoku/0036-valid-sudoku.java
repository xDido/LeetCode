class Solution {
public boolean isValidSudoku(char[][] board) {
    HashMap<Integer, HashSet<Integer>> row = new HashMap<>();
    HashMap<Integer, HashSet<Integer>> col = new HashMap<>();
    HashMap<Integer, HashMap<Integer, HashSet<Integer>>> box = new HashMap<>();

    for (int i = 0; i < 9; i++) {
        row.put(i, new HashSet<>());
        col.put(i, new HashSet<>());
        box.put(i, new HashMap<>());
        for (int j = 0; j < 9; j++) {
            box.get(i).put(j, new HashSet<>());
        }
    }

    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.') 
                continue;
            

            int num = board[i][j] - '0'; // Convert char to int

            if (row.get(i).contains(num) || col.get(j).contains(num) || box.get(i / 3).get(j / 3).contains(num))
                return false;
            

            row.get(i).add(num);
            col.get(j).add(num);
            box.get(i / 3).get(j / 3).add(num);
        }
    }

    return true;
}



}