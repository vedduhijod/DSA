class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        StringBuilder res = new StringBuilder(arr.length);

        int i = arr.length - 1;

        while (i >= 0) {
            // skip spaces
            while (i >= 0 && arr[i] == ' ') i--;
            if (i < 0) break;

            int j = i;

            // find start of word
            while (i >= 0 && arr[i] != ' ') i--;

            // append word
            for (int k = i + 1; k <= j; k++) {
                res.append(arr[k]);
            }

            res.append(' ');
        }

        // remove last extra space
        res.setLength(res.length() - 1);

        return res.toString();
    }
}