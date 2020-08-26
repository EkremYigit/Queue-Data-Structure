package fruitpair;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Queue Fruit = new Queue(100);
		Queue q1 = new Queue(200);
		Queue Tempq1 = new Queue(200);
		Queue Tempq2 = new Queue(200);
		Queue q2 = new Queue(200);
		int Try = 0;
		int Score = 0;
		int count = 0;
	
		

		Fruit.EnQ("Banana");
		Fruit.EnQ("Pineapple");
		Fruit.EnQ("Melon");
		Fruit.EnQ("Apple");
		Fruit.EnQ("Pear");
		Fruit.EnQ("Kiwi");
		Fruit.EnQ("Orange");
		Fruit.EnQ("Grape");
		Fruit.EnQ("Watermelon");
		Fruit.EnQ("Strawberry");
		boolean same = false;

	

		while (!q1.isFull() && count < 5) {
			int a = (int) (Math.random() * 5);
			for (int i = 0; i <= a; i++) {
				Fruit.EnQ(Fruit.DeQ());
			}

			for (int i = 0; i < q1.size(); i++) {
				if (q1.peek() == Fruit.peek()) {
					same = true;
				} else
					q1.EnQ(q1.DeQ());
			}
			if (same) {
				System.out.println("Same Fruits");
				same = false;
			} else {
				q1.EnQ(Fruit.peek());
				System.out.println(Fruit.peek()+" is added in Q1 array");
				Fruit.DeQ();
				count++;
			}

		} // while finish
		System.out.println("");
		System.out.println("");
		count = 0;

		while (Tempq1.size() != q1.size()) {// q1 tempq1 reset.
			Tempq1.EnQ(q1.peek());			
			q1.EnQ(q1.DeQ());
			
		}

		int x=0;
		int count2=5;
		while (!Tempq1.isEmpty()) {
		do	{
		x=(int)(Math.random()*5);
		}while(x>count2);
		for(int i=0;i<x;i++){
				Tempq1.EnQ(Tempq1.DeQ());
			}
			
			if(Tempq1.peek() != q1.peek()){
			q2.EnQ(Tempq1.peek());
				q1.EnQ(q1.DeQ());
				Tempq1.DeQ();//
				count2--;
			}
		} // while finish 
		
		
		

		Tempq1 = new Queue(300); 

		while (Tempq2.size() != q2.size()) {
											
			Tempq2.EnQ(q2.peek());
			q2.EnQ(q2.DeQ());
			
		}
		
		while (Tempq1.size() != q1.size()) {.
			Tempq1.EnQ(q1.peek());			
			q1.EnQ(q1.DeQ());
			
		}
		
		System.out.println("OUTPUT SCREEN");
		for(int i=0;i<Tempq1.size();i++){
			System.out.print("| "+Tempq1.peek()+" | ");
			Tempq1.EnQ(Tempq1.DeQ());
		}
		System.out.println("");
		for(int i=0;i<Tempq2.size();i++){
			System.out.print("| "+Tempq2.peek()+" | ");
			Tempq2.EnQ(Tempq2.DeQ());
		}
		System.out.println("");
		System.out.println("Game will start!");
		System.out.println("");
		
		int a=0;
		int b=0;
		while (!Tempq1.isEmpty()) {
			Try++;
			
			do{
				a=(int)(Math.random()*5);
			}while(!(a<Tempq1.size()));
			
			do{
				b=(int)(Math.random()*5);
			}while(!(b<Tempq2.size()));
			
			
				
				
			for (int i = 0; i<a; i++) {
				Tempq1.EnQ(Tempq1.DeQ());
			}
			
			for (int i = 0; i < b; i++) {
				Tempq2.EnQ(Tempq2.DeQ());
			}
			
			System.out.println("New Numbers: "+(a+1)+"--"+(b+1));
			System.out.println("");

			if (Tempq2.peek() == Tempq1.peek()) { 
					Score+=20;
					
					
					if(Tempq1.peek()==q1.peek()){
						Tempq1.DeQ();
						while(q1.peek()!=Tempq1.peek() && !Tempq1.isEmpty()){
							q1.DeQ();
						}
					}
					else
						Tempq1.DeQ();
					
					if(Tempq2.peek()==q2.peek()&& !Tempq2.isEmpty()){
						Tempq2.DeQ();
						while(q2.peek()!=Tempq2.peek()){
							q2.DeQ();
						}
					}
					else
						Tempq2.DeQ();
						
					while (q1.peek() != Tempq1.peek() && Tempq1.size()>0) { 
						Tempq1.EnQ(Tempq1.DeQ());
					}
					
					while (q2.peek() != Tempq2.peek() && Tempq2.size()>0) {
						Tempq2.EnQ(Tempq2.DeQ());
					}
					
				
				
				
				for(int i=0;i<Tempq1.size();i++){
					System.out.print("| "+Tempq1.peek()+" | ");
					Tempq1.EnQ(Tempq1.DeQ());
				}
				System.out.println("");
				for(int i=0;i<Tempq2.size();i++){
					System.out.print("| "+Tempq2.peek()+" | ");
					Tempq2.EnQ(Tempq2.DeQ());
				}
				System.out.println("");
				System.out.println("              Round: "+Try+"   Score:"+Score);
				System.out.println("");
				
						
				if(Tempq1.isEmpty())
					break;
			}	
			
			else{
				Score-=1;
				while (q1.peek() != Tempq1.peek()) { 
					Tempq1.EnQ(Tempq1.DeQ());
				}

				while (q2.peek() != Tempq2.peek()) {
					Tempq2.EnQ(Tempq2.DeQ());
				}
				for(int i=0;i<Tempq1.size();i++){
					System.out.print("| "+Tempq1.peek()+" | ");
					Tempq1.EnQ(Tempq1.DeQ());
				}
				System.out.println("");
				for(int i=0;i<Tempq2.size();i++){
					System.out.print("| "+Tempq2.peek()+" | ");
					Tempq2.EnQ(Tempq2.DeQ());
				}
				System.out.println("");
				System.out.println("              Round: "+Try+"   Score:"+Score);
				System.out.println("");
					
				if(Tempq1.isEmpty())
					break;
			}
			
		}
		System.out.println("Game is over   TotalRound: "+Try+"   TotalScore:"+Score);
		

	}
}

