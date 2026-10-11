
class Solution {
    String intTOstring(int count) {
        String str = "";

        while (count > 0) {
            int digit = count % 10;
            str += (char)(digit + '0');
            count /= 10;
        }

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }

    public int compress(char[] chars) {
        int n = chars.length;
        int idx = 0;

        for (int i = 0; i < n; i++) {
            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[idx++] = ch;

            if (count > 1) {
                String str = intTOstring(count);

                for (int j = 0; j < str.length(); j++) {
                    chars[idx++] = str.charAt(j);
                }
            }

            i--;
        }

        return idx;
    }
}
