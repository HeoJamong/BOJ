import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        if (input.equals("0")) {
            System.out.println(0);
            return;
        }
        int index = 0;
        if ((input.charAt(index)) == '1') {
            sb.append('1');
            index++;
        }
        else if ((input.charAt(index)) == '2') {
            sb.append("10");
            index++;
        }
        else if ((input.charAt(index)) == '3') {
            sb.append("11");
            index++;
        }

        for (int i = index; i < input.length(); i++) {
             if (input.charAt(i) == '1')
                sb.append("001");
            else if (input.charAt(i) == '2')
                sb.append("010");
            else if (input.charAt(i) == '3')
                sb.append("011");
            else if (input.charAt(i) == '4')
                sb.append("100");
            else if (input.charAt(i) == '5')
                sb.append("101");
            else if (input.charAt(i) == '6')
                sb.append("110");
            else if (input.charAt(i) == '7')
                sb.append("111");
            else
                sb.append("000");
        }
        System.out.println(sb);
    }

}
