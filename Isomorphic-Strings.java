1class Solution {
2   public static boolean isIsomorphic(String s, String t) {
3        int[] mapS = new int[256];
4        int[] mapT = new int[256];
5
6        for (int i = 0; i < s.length(); i++) {
7            char chS = s.charAt(i);
8            char chT = t.charAt(i);
9
10            if (mapS[chS] != mapT[chT]) {
11                return false;
12            }
13
14            mapS[chS] = i + 1;
15            mapT[chT] = i + 1;
16        }
17
18        return true;
19    }
20}