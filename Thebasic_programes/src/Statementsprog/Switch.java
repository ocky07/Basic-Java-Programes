package Statementsprog;

import java.io.PrintStream;
import java.util.Scanner;

public class Switch extends  UtilitiesOfLove  {
	
	

	public static void main(String[] args) throws InterruptedException {
		Scanner scn=new Scanner(System.in);
		System.out.println("which Sweaty you want's now \n"+"Just call to number");
		System.out.println("Girl friend :1.('-')_Lilly"+"\t2.('-')_Emma "+"\t3.('-')_Srivalli ");
		System.out.println("eneter here :Number");
	
		int num=scn.nextInt();
		
		switch(num) {
		case 1: {
			System.out.println("Name is Lilly: very cool \n"+"At America[ Chicago,Chitko(area),House no:0023jf ]");
			System.out.println("Do you speak with her : say ' HI '");
			String q=scn.next();
			if(q.equals("hi")) {
			Thread.sleep(6000);
			System.out.println("HI ");
			System.out.println("Do you want to talk with me ?? 'yes' or \n"+"other wise go away for me Baby don't distrub me ookkayy !");
			
			String s=scn.next();
			if(s.equals("yes")) {
				Thread.sleep(3000);
				
			System.out.println("Ooh are like to meet with me now i'm expecting...hmm \n"+"say yes or no !?");
			String p=scn.next();
			if(p.equals("yes")) {
				Thread.sleep(5000);
			System.out.println(" i miss you lot..how are you now ?? :"+"good right('-')");
			String s1=scn.next();
			if(s1.equals("good")|| s1.equals("fine")||s1.equals("nice")||s1.equals("yeah")) {
				System.out.println("Do you want to ask anything!! now");
				String w=scn.next();
				if(w.equals("how are you baby?")||w.equals("what about you?")||w.equals("how are you honey?")||w.equals("what about you baby?")) {
				Thread.sleep(4000);
				System.out.println("i'm good baby:"+" uuumaaa\n"+" After long time i'm tolking with you first give a kiss ('-')*");
				
			String n=scn.next();
			if(n.equals("kiss")||n.equals("uummaa")||n.equals("uuummma")||n.equals("uuummmaaaa")) {
				Thread.sleep(5000);
				System.out.println("how many kisses babys");
				int x=scn.nextInt();
				firstlove(x);
				Thread.sleep(5000);
				System.out.println("ooh myy god!!!\n"+"honey baby..Shall i ask one thing if you don't main ??");
				String e=scn.next();
				if(e.equals("yeah")||n.equals("ask")||n.equals("yes")||n.equals("tell me")) {
					Thread.sleep(3000);
					System.out.println("Are you Still loving me???");
					String r=scn.next();
					if(e.equals("yes")||n.equals("yeah")) {
						Thread.sleep(6000);
						System.out.println("\t*******I LOVE YOU BABY*******\n"+"I am wainting for this movement baby");
						String t=scn.next();
						if(t.equals("love you too")||t.equals("i love u")||t.equals("I LOVE YOU TOO")||n.equals("love you too baby")) {
							Thread.sleep(4000);
							System.out.println("To day i'm booking the tickets honey :"+"we will meet you soooooooon");
							String y=scn.next();
							if(y.equals("okay")||n.equals("ok")||e.equals("i'm waiting for you baby")||n.equals("kk")) {
								Thread.sleep(3000);
								System.out.println("okay...baby i hava some work talk with leter...bye");
								
						
				
				
				
			}}}}}}}}}}
			
			break;
		}
		case 2:{
			System.out.println("lover 2\n"+"full detailes");
			break;
		}
		case 3:{
			System.out.println("lover 3\n"+"full detailes");
			break;
			}
		
		default:
			if(num>=0)System.out.println("There is no Girl friend"); 
		}
		
	}

}
