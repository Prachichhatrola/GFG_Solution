class GfG {
    int minEle;
    Stack<Integer> s;

    GfG() {
        s = new Stack<>();
    }

    int getMin() {
        if (s.isEmpty()) {
            return -1; 
        }
        return minEle;
    }

    int pop() {
        if (s.isEmpty()) {
            return -1; 
        }
        int top = s.pop();
        if (top < minEle) {
            int poppedElement = minEle;
            minEle = 2 * minEle - top;
            return poppedElement;
        }
        return top;
    }
    void push(int x) {
        if (s.isEmpty()) {
            s.push(x);
            minEle = x;
        } else if (x <= minEle) {
            s.push(2 * x - minEle);
            minEle = x;
        } else {
            s.push(x);
        }
    }
}
