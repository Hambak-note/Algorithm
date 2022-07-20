import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10808 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = "";
        inputStr = br.readLine();
        int[] result = new int[26];
        int index = 0;

        for (int i = 0; i < inputStr.length(); i++) {
            index = ((int) inputStr.charAt(i)) - 97;
            result[index] += 1;
        }

        for (int i = 0; i < result.length-1; i++) {
            System.out.print(result[i]);
            System.out.print(' ');
        }
        System.out.print(result[25]);
    }

}
