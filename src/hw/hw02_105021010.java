package hw;
/*
 * Topic:已知男生標準體重＝(身高－80 )*0.7；女生標準體重＝(身高－70)*0.6
 * ；試寫一個程式可以計算男生女生的標準體重。
 * (輸入兩個數值，依序代表為身高及性別（1代表男性；2代表女性）)
 * Date: 2016/09/26
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw02_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int boRg = scn.nextInt ();
		int wTa = scn.nextInt();
	    if(boRg==1){
	    System.out.println((wTa-80)*0.7);
	    }else{
	    if(boRg==2){
	    System.out.println((wTa-70)*0.6);
	    }else{
	    	System.out.println("輸入錯誤，目前無第三性別之算試");
	    }
	    }

	}

}
