public class Solution {
//别人的最优答案，动态规划问题    
public static boolean isInterleave(String s1, String s2, String s3)
{
if(s1==null||s2==null||s3==null)
{
return false; 	
}	 
if(s1.length()+s2.length()!=s3.length())
{
return false;	
} 
boolean[][] dp=new boolean[s1.length()+1][s2.length()+1];
for(int i = 0;i< dp.length; i++){
 Arrays.fill(dp[i], false);  	
}
dp[0][0]=true;
for(int i=0;i<dp.length;i++){
    for(int j=0;j<dp[0].length;j++)
      {
	    if(i>0)
		     dp[i][j]=(dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1));
	    if(j>0)
		    dp[i][j]=(dp[i][j]||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1)));			   	   
} 	
}
return dp[s1.length()][s2.length()]; 
}
//通过在线测试
public static void  main(String[] args)
{

}
}
