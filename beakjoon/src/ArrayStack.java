

public class ArrayStack implements Stack {
    private int top;
    private int stackSize;
    private char stackArr[];

    //스택 생성자
    public ArrayStack(int stackSize) {
        this.top = -1;
        this.stackSize = stackSize;
        this.stackArr = new char[this.stackSize];
    }

    //스택이 비어있는 상태인지 확인
    @Override
    public boolean isEmpty() {
        //스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false return
        return (top == -1);
    }

    //스택이 가득찬 상태인지 확인
    @Override
    public boolean isFull() {
        //스택 포인터가 -1인 경우 데이터가 없는 상태이므로 true 아닌 경우 false return
        return (top == this.stackSize-1);
    }

    //스택에 데이터를 추가
    @Override
    public void push(char item) {
        if(isFull()){
            System.out.println("Stack is full");
        }else{
            stackArr[++top] = item; //다음 스택 포인터가 가리키는 인덱스에 데이터 추가
            System.out.println("Inserted Item : " + item);
        }
    }

    //스택의 최상위 데이터 추출 후 삭제
    @Override
    public char pop() {
       if(isEmpty()){
           System.out.println("Stack is empty!");
           return 0;
       }else{
           System.out.println("Peeked item : " + stackArr[top]);
           return stackArr[top];
       }
    }

    //스택 최상위 데이터 추출
    @Override
    public char peek() {
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return 0;
        } else{
            System.out.println("Deleted Item : " + stackArr[top]);
            return stackArr[top--];
        }
    }

    //스택 초기화
    @Override
    public void clear() {
        if(isEmpty()){
            System.out.println("Stack is already empty");
        }else{
            top = -1; //스택 포인터 초기화
            stackArr = new char[this.stackSize]; //새로운 스택 배열 생성
            System.out.println("Stack is clear!");
        }
    }
}
