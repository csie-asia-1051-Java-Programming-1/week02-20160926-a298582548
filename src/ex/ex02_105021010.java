package ex;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex02_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入x,y");
		Scanner scn = new Scanner(System.in);
		int a =0;
		int b =0;
		int c = scn.nextInt()-a;
		int d = scn.nextInt()-b;
		float e =(int)Math.pow(c, 2);
		float f =(int)Math.pow(d, 2);
		float g =e+f;
		float h =(int)Math.pow(g,1/2.0 );
		if(h<=100){
		System.out.println("yes");
		}else{
		System.out.println("no");
		}
		

	}

}
