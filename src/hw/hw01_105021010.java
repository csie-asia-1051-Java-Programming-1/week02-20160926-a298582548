package hw;
/*
 * Topic:假設銅板有1元、5元、50元共三種，媽媽請小明去菜市場買水果，給了小明N元，
 * 且媽媽交待，要老闆找小明的零錢的數目要最少，而小明到了水果攤買了a1顆蘋果，a2顆柳丁，及a3顆桃子，1顆蘋果15元，1顆柳丁20元，1顆桃子30元，
 * 請問老問需找多少個1元、5元、50元，其銅板數目最少。(先輸入媽媽給小明多少錢，N，接著輸入a1, a2, a3 ， 在此n, a1, a2, a3為整數，
 * 且a1*15+ a2*20+ a3*30小於或等於N。列出共找小明多少個1元，5元及50元，若帶的錢不夠買水果，則顯示”0”)
 * Date: 2016/09/26
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw01_105021010 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("媽媽給了:");
		int N = scn.nextInt();
		System.out.println("買了蘋果:");
		int a1 = scn.nextInt();
		System.out.println("買了柳丁:");
		int a2 = scn.nextInt();
		System.out.println("買了桃子:");
		int a3 = scn.nextInt();
		int QQ = a1*15+a2*20+a3*30;
		int TT = N-QQ;
		int YY = TT/50;
		int EE = (TT-50*YY)/5;
		int GG = (TT-50*YY-5*EE)/1;
		if(N>=QQ){
		System.out.println("找了50硬幣共:"+YY+"個");
		System.out.println("5硬幣共:"+EE+"個");
		System.out.println("1硬幣共:"+GG+"個");
		}else{
		System.out.println("0");
			
		
			
		}
		

	}

}
