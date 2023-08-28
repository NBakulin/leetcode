package solutions.solution_225;

import java.util.LinkedList;

class MyStack {

    public LinkedList<Integer> queue = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        this.queue.addFirst(x);
    }

    public Integer pop() {
        if (this.queue.isEmpty()) {
            return null;
        }

        return this.queue.pollFirst();
    }

    public Integer top() {
        if (this.queue.isEmpty()) {
            return null;
        }

        return this.queue.getFirst();
    }

    public boolean empty() {
        return this.queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */