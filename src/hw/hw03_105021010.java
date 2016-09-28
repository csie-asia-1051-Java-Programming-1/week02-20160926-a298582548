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
		System.out.print("輸入一個西元年:");
		int yEar = scn.nextInt();
		
		int a2 =yEar%4;
		int a5 = yEar%400;
		int a8 = yEar%100;
		if(a2==0 && a8!=0||a5 == 0){
		System.out.println("是閏年喔~");	
		}else{
		System.out.println("不是閏年喔~");	
		}
		
		}
	}

		
		

	


