class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {

            boolean destroyed = false;

            // collision condition
            while (!st.isEmpty() &&
                    st.peek() > 0 &&
                    asteroid < 0) {

                // top asteroid smaller -> destroy top
                if (st.peek() < -asteroid) {
                    st.pop();
                }

                // both equal -> destroy both
                else if (st.peek() == -asteroid) {
                    st.pop();
                    destroyed = true;
                    break;
                }

                // current asteroid smaller
                else {
                    destroyed = true;
                    break;
                }
            }

            // current asteroid survived
            if (!destroyed) {
                st.push(asteroid);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}