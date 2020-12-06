package EstructurasDatos;

public class IntStack {
    
    private int top;
    private  int sarray [];
    
    public IntStack(int n){ 
        
        top=0;
        sarray=new int [n];    
    }    
    public void  push (int item){
        if(full())
            throw new RuntimeException ("Stack is full");
        sarray[top]=item;
        top++;    
    } 
    public int pop() {
        if (empty())
            throw new RuntimeException ("Stack is empty");
            top--;
            return sarray[top];
    }  
    public boolean full() {
        return top>=sarray.length;
    }
    
    public boolean empty() {
        return top<=0;
    }
    
     public int peek() {
        if (empty())
            throw new RuntimeException ("Stack is empty");  
        return sarray[(top)-1];
}
        public int size() {
        return top;
    }
}

