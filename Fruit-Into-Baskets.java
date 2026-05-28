1class Solution {
2    public int totalFruit(int[] fruits) {
3        int left = 0;
4        int maxFruit = 0;
5        Map<Integer, Integer> map = new HashMap<>();
6        for(int right = 0; right < fruits.length; right++){
7            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
8            while(map.size() > 2){
9                map.put(fruits[left], map.get(fruits[left]) - 1);
10                if (map.get(fruits[left]) == 0) {
11                    map.remove(fruits[left]);
12                }
13                left++;
14            }
15            maxFruit = Math.max(maxFruit, right - left + 1);
16        }
17        return maxFruit;
18    }
19}