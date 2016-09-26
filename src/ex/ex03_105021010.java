package ex;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex03_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 60;
		int b = scn.nextInt()*a;
		int c = scn.nextInt();
		int d = b+c;
		int e = scn.nextInt()*a;
		int f = scn.nextInt();
		int g = e+f;
		int h = d-g;
		
		float i = h/30;
	    if(h<30){
	    System.out.println("Free");
	    }
	    else{
		if(h<=120){
		System.out.println(i*30);
		}
		else{
		if(h>=120 && h<=240){
		System.out.println(4*30+((h-2*a)/30)*40);	
		}
		else{
		if(h>=240){
		System.out.println(4*30+4*40+((h-4*a)/30)*60);
		
		}
		}
		}
		}
	}
}
		
		
		

	

