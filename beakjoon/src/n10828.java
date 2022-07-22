import java.io.*;

public class n10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int commandCount = 0;
        commandCount = Integer.parseInt(br.readLine());
        intStack iStack = new intStack(commandCount);

        for(int i = 0; i < commandCount; i++){
            String commandArr[] = br.readLine().split(" ");

            if(commandArr[0].equals("push")){
                iStack.push(Integer.parseInt(commandArr[1]));
                continue;
            }
            if(commandArr[0].equals("pop")){
                System.out.println(iStack.pop());
                continue;
            }
            if(commandArr[0].equals("size")){
                System.out.println(iStack.size());
                continue;
            }
            if(commandArr[0].equals("empty")){
                System.out.println(iStack.empty());
                continue;
            }
            if(commandArr[0].equals("top")){
                System.out.println(iStack.top());
                continue;
            }
        }

    }
}

class intStack{
    private int top;
    private int stackSize;
    private int stackArr[];

    //스택 생성자
    public intStack(int stackSize){
        this.top = -1;
        this.stackSize = stackSize;
        this.stackArr = new int[this.stackSize];
    }

    public int empty(){
        if(top == -1){
            return 1;
        }else{
            return 0;
        }
    }

    public void push(int item){
        stackArr[++top] = item;
    }

    public int pop(){
        if(empty() == 1){
            return -1;
        }else{
            return stackArr[top--];
        }
    }

    public int size(){
        return top+1;
    }

    public int top(){
        if(empty() == 1){
            return -1;
        }else{
            return stackArr[top];
        }
    }

}