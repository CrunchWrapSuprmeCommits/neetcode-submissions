class Solution {
    public boolean isValid(String s) {

        char[] stack = new char[s.length()];
        int marker = 0;
        for (int i = 0; i < s.length(); i++) {
            if (marker == 0 && (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}')) {
                marker ++;
                return false;
            }
            if (s.charAt(i) == ']') {
                if (stack[marker - 1] == '[') {
                    marker--;
                } else {
                    return false;
                }
            } else if (s.charAt(i) == ')') {
                if (stack[marker - 1] == '(') {
                    marker--;
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '}') {
                if (stack[marker - 1] == '{') {
                    marker--;
                } else {
                    return false;
                }
            } else {
                stack[marker] = s.charAt(i);
                marker++;
            }
        }
        if (marker == 0) {
            return true;
        } else {
            return false;
        }
    }
}
