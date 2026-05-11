1class Solution {
2    public String removeKdigits(String num, int k) {
3
4        Stack<Character> st = new Stack<>();
5
6        for(int i = 0; i < num.length(); i++) {
7
8            char ch = num.charAt(i);
9
10            while(!st.isEmpty() &&
11                  k > 0 &&
12                  st.peek() > ch) {
13
14                st.pop();
15                k--;
16            }
17
18            st.push(ch);
19        }
20
21        // remove remaining digits
22        while(k > 0) {
23            st.pop();
24            k--;
25        }
26
27        if(st.isEmpty())
28            return "0";
29
30        StringBuilder res = new StringBuilder();
31
32        while(!st.isEmpty()) {
33            res.append(st.pop());
34        }
35
36        // remove leading zeroes
37        while(res.length() > 0 &&
38              res.charAt(res.length() - 1) == '0') {
39
40            res.deleteCharAt(res.length() - 1);
41        }
42
43        res.reverse();
44
45        return res.length() == 0 ? "0" : res.toString();
46    }
47}