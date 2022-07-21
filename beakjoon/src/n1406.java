import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class n1406 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputStr = "";
        int commandCount = 0;
        inputStr = br.readLine();
        commandCount = Integer.parseInt(br.readLine());

        LinkedList<Character> strList = new LinkedList<>();


        //LinkedList에 문자열 입력
        for(int i = 0; i < inputStr.length(); i++){
            strList.add(inputStr.charAt(i));
        }

        //iterator 생성
        ListIterator<Character> currentPosition = strList.listIterator();
        while(currentPosition.hasNext()){
            currentPosition.next();
        }

        for(int i = 0; i < commandCount; i++) {
            String command = br.readLine();
            char c = command.charAt(0);

            switch (c){
                case 'L':
                    if(currentPosition.hasPrevious())
                        currentPosition.previous();

                    break;
                case 'D':
                    if(currentPosition.hasNext())
                        currentPosition.next();

                    break;
                case 'B':
                    if(currentPosition.hasPrevious()) {
                        currentPosition.previous();
                        currentPosition.remove();
                    }
                    break;
                case 'P':
                    char t = command.charAt(2);
                    currentPosition.add(t);

                    break;
                default:
                    break;
            }
        }

        for(Character tmp : strList) {
            bw.write(tmp);
        }

        bw.flush();
        bw.close();

    }
}


