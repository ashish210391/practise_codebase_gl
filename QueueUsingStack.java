public class QueueUsingStack{

private Stack<Integer> stack1;
private Stack<Integer> stack2;

public QueueUsingStack(){
stack1 = new Stack<Integer>();
stack2 = new Stack<Integer>();
	}


public void enqueue(int x){

	while(stack1.isEmpty()){
        	stack2.push(stack1.pop());
		}
		stack1.push(x);
	while(stack2.isEmpty()){
			stack2.push(stack1.pop());
		}
	}


	public int dequeue(){
		if(stack1.isEmpty()){
			throw new Exception("stack underflow");
		}
		return stack1.pop();

	}

	public void enqueue_updated(int x){

		stack1.push(x);

		}


	public int dequeue_updated(){

		if(stack1.isEmpty()) throw new Exception("underflow");

		while(stack1.isEmpty()){
		stack2.push(stack1.pop());
	}
	return stack2.pop();

		}

public static void main(String args[]){


	}
}