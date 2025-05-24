import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String encodedString = sc.nextLine();
        int window = 3;

        ArrayList<Integer> idxes = new ArrayList<Integer>();

        for(int i = 0; i < encodedString.length(); i+=window){
            idxes.add(Integer.valueOf(encodedString.substring(i, i+window)));
        }

        for(int i : idxes){
            System.out.print(input.charAt(i-1));
        }

    }
}
