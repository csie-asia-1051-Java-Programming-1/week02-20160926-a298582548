package hw;
/*
 * Topic:試撰寫一個程式，可由鍵盤讀入一個 4 位數的整數，代表西洋的年份，
 * 然後判別這個年份是否為閏年（每四年一閏，每百年不閏，每四百年一閏，例如西元 1900 雖為 4 的倍數，
 * 但可被 100 整除，所以不是閏年，同理， 2000 年是閏年，因可被 400 整數，而 2004 當然也是閏年，因可以被 4 整除）。
 * Date: 2016/09/26
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int yEar = scn.nextInt();
		int a1 = yEar/4;
		float a2 =(float)yEar/4;
		float a3 = a2-a1;
		int a4 = yEar/400;
		float a5 = (float)yEar/400;
		float a6 = a5-a4;
		int a7 = yEar/100;
		float a8 = (float)yEar/100;
		float a9 = a8-a7;
		if(a3==0 && a9!=0||a6 == 0){
		System.out.println("是閏年");	
		}else{
		System.out.println("不是閏年");	
		}
		
		}
	}

		
		

	


