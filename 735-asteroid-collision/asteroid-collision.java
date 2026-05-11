class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int asteroid : asteroids) {

            while (!st.isEmpty()
                    && st.peek() > 0
                    && asteroid < 0
                    && st.peek() < -asteroid) {

                st.pop();
            }

            // equal size -> both destroy
            if (!st.isEmpty()
                    && st.peek() > 0
                    && asteroid < 0
                    && st.peek() == -asteroid) {

                st.pop();
            }

            // current asteroid destroyed
            else if (!st.isEmpty()
                    && st.peek() > 0
                    && asteroid < 0
                    && st.peek() > -asteroid) {

                continue;
            }

            // current asteroid survives
            else {
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