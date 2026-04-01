1class Solution {
2    public int romanToInt(String s) {
3        int[] values = new int[26];
4        values['I' - 'A'] = 1;
5        values['V' - 'A'] = 5;
6        values['X' - 'A'] = 10;
7        values['L' - 'A'] = 50;
8        values['C' - 'A'] = 100;
9        values['D' - 'A'] = 500;
10        values['M' - 'A'] = 1000;
11
12        int total = 0;
13
14        for (int i = 0; i < s.length(); i++) {
15            int current = values[s.charAt(i) - 'A'];
16
17            if (i < s.length() - 1 && current < values[s.charAt(i + 1) - 'A']) {
18                total -= current;
19            } else {
20                total += current;
21            }
22        }
23
24        return total;
25    }
26}