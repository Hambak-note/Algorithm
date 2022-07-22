import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class n10773 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int commandCount = Integer.parseInt(br.readLine());

        Stack<Integer> numStack = new Stack<>();
        int answer = 0;

        for(int i = 0; i < commandCount; i++){
            int input = Integer.parseInt(br.readLine());
            if(input == 0){
                numStack.pop();
                continue;
            }
                numStack.push(input);
        }

        Iterator<Integer> itr = numStack.iterator();

        while(itr.hasNext()){
            answer += itr.next();
        }

        System.out.println(answer);

    }
}
