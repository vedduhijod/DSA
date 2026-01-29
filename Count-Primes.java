1class Solution {
2public int countPrimes(int n) {
3boolean[] primes = new boolean[n+1];
4int count =0;
5for(int i = 2; i < n; i++){
6if(primes[i] == false)
7count++;
8for(int j = 2 * i; j < n ; j = j + i){
9primes[j] = true;
10}
11}
12return count;
13}
14}