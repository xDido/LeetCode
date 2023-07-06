class MinStack {
    ArrayList<Integer> list;

    public MinStack() {
        list = new ArrayList<>();

    }

    public void push(int val) {
        list.add(val);
    }

    public void pop() {
        list.remove(list.size() - 1);
    }

    public int top() {
        Object[] array = list.toArray();
        return (int) array[array.length - 1];

    }

    public int getMin() {
        Object[] array = list.toArray();
        Arrays.sort(array);
        return (int) array[0];

    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */