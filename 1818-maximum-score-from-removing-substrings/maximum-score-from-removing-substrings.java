class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removePairs(s, 'a', 'b', x, y);
        } else {
            return removePairs(s, 'b', 'a', y, x);
        }
    }

    private int removePairs(String s, char first, char second, int firstVal, int secondVal) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        // First pass to remove high value pairs
        StringBuilder remaining = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first && c == second) {
                stack.pop();
                score += firstVal;
            } else {
                stack.push(c);
            }
        }

        // Build the string after first pass
        while (!stack.isEmpty()) {
            remaining.append(stack.pop());
        }
        s = remaining.reverse().toString();

        // Second pass to remove lower value pairs
        stack.clear();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == second && c == first) {
                stack.pop();
                score += secondVal;
            } else {
                stack.push(c);
            }
        }

        return score;
    }
}
