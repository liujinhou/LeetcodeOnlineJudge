public class Solution{
//动态规划
public static int longestValidParentheses(String s)
{
		if(s == null || s.length() < 2)
		{
		return 0;
		}
		int max = 0;
		int[] longest = new int[s.length()];
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == ')') {
				if (s.charAt(i - 1) == '(') {
					longest[i] = i - 2 > 0 ? longest[i - 2] + 2 : 2;
					max = Math.max(max, longest[i]);
				} else // s.charAt(i-1)==')'
				{
					if (i - longest[i - 1] - 1 >= 0
							&& s.charAt(i - longest[i - 1] - 1) == '(') {
						longest[i] = longest[i - 1]
								+ 2
								+ ((i - longest[i - 1] - 2 >= 0) ? longest[i
										- longest[i - 1] - 2] : 0);
						max = Math.max(longest[i], max);

					}

				}
			}
		}
		return max;
	}
	

	
}
