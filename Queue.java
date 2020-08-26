package fruitpair;

public class Queue {
	private int rare,front;
	private String[] elements;
	Queue(int capasity){
		
		elements=new String[capasity];
		rare=-1;
		front=0;
		
	}
	public void EnQ(String data){
		if(isFull()){
			System.out.println("Full");
		}
		else{
			rare++;
			elements[rare]=data;
		}
		
	
	}
	String DeQ(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return null;
		}
		else{
			String fake=elements[front];
			elements[front]=null;
			front++;
			return fake;
		}
		
	}
	
	public boolean isFull(){
		if(rare+1==elements.length){
			return true;
		}
		else
			return false;
		
	}
	public boolean isEmpty(){
		return rare < front; 
	}
	public int size(){
		return rare-front+1;
	}
	
	String peek(){
		return elements[front];
	}
}
