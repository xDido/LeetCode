class Solution {
   public static int romanToInt(String s) {
		int n = 0;
		char[] word = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			word[i] = s.charAt(i);
		}
		for (int i = 0; i < word.length; i++) {
			switch (word[i]) {
			case 'I':
				if (i + 1 < word.length && word[i + 1] == ('V')) {
					n += 4;
					i++;
					break;
				}
				if (i + 1 < word.length && word[i + 1] == ('X')) {
					n += 9;
					i++;
					break;
				} else {
					n += 1;
				}
				break;

			case 'X':
				if (i + 1 < word.length && word[i + 1] == ('L')) {
					n += 40;
					i++;
					break;
				}
				if (i + 1 < word.length && word[i + 1] == ('C')) {
					n += 90;
					i++;
					break;
				} else {
					n += 10;
				}
				break;
			case 'C':
				if (i + 1 < word.length && word[i + 1] == ('D')) {
					n += 400;
					i++;
					break;
				}
				if (i + 1 < word.length && word[i + 1] == ('M')) {
					n += 900;
					i++;
					break;
				} else {
					n += 100;
				}
				break;
			case 'L':
				n += 50;
				break;
			case 'D':
				n += 500;
				break;
			case 'M':
				n += 1000;
				break;
			case 'V':
				n += 5;
				break;
			}
		}
		return n;
	}
}