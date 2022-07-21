import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class n1406 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        int commandCount = 0;
        inputStr = br.readLine();
        commandCount = Integer.parseInt(br.readLine());

        LinkedList<Character> strList = new LinkedList<>();
        String answer = "";

        //LinkedList에 문자열 입력
        for(int i = 0; i < inputStr.length(); i++){
            strList.add(inputStr.charAt(i));
        }

        //최초의 커서 위치는 마지막 문자열 뒤이기 때문에 strList의 사이즈 크기에 위치를 준다
        int currentPosition = strList.size();

        for(int i = 0; i < commandCount; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            if (c == 'L' && currentPosition != 0) {
                currentPosition = currentPosition - 1;
                continue;
            }
            if (c == 'D' && currentPosition != strList.size()) {
                currentPosition = currentPosition + 1;
                continue;
            }
            if (c == 'B' && currentPosition != 0) {
                strList.remove(currentPosition - 1);
                currentPosition = currentPosition - 1;
                continue;
            }
            if (c == 'P') {
                char newChar = command.charAt(2);
                strList.add(currentPosition, newChar);
                currentPosition = currentPosition + 1;
                continue;
            }
        }

        for(int i=0; i < strList.size(); i++){
            answer += strList.get(i);
        }

        System.out.println(answer);
    }
}


