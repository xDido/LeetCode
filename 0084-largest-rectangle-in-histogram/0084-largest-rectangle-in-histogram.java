class Solution {
public int largestRectangleArea(int[] heights) {
    int n = heights.length;
    int[] left = new int[n]; // Stores the left boundaries
    int[] right = new int[n]; // Stores the right boundaries

    // Initialize the right boundaries
    for (int i = 0; i < n; i++) {
        right[i] = n;
    }

    Stack<Integer> stack = new Stack<>();

    // Calculate the left boundaries
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
            stack.pop();
        }
        left[i] = stack.isEmpty() ? 0 : stack.peek() + 1;
        stack.push(i);
    }

    stack.clear();

    // Calculate the right boundaries
    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
            stack.pop();
        }
        right[i] = stack.isEmpty() ? n : stack.peek();
        stack.push(i);
    }

    int area = 0;

    // Calculate the maximum area
    for (int i = 0; i < n; i++) {
        area = Math.max(area, heights[i] * (right[i] - left[i]));
    }

    return area;
}

}
