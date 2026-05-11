class Solution {

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {

            // positive asteroid -> directly push
            if (asteroids[i] > 0) {

                st.push(asteroids[i]);
            }

            else {

                // destroy smaller positive asteroids
                while (!st.isEmpty()
                        && st.peek() > 0
                        && st.peek() < Math.abs(asteroids[i])) {

                    st.pop();
                }

                // equal size -> both destroy
                if (!st.isEmpty()
                        && st.peek() == Math.abs(asteroids[i])) {

                    st.pop();
                }

                // current asteroid survives
                else if (st.isEmpty() || st.peek() < 0) {

                    st.push(asteroids[i]);
                }
            }
        }

        int[] ans = new int[st.size()];

        for (int i = st.size() - 1; i >= 0; i--) {

            ans[i] = st.pop();
        }

        return ans;
    }
}