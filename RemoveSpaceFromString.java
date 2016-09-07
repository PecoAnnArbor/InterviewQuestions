package removespacefromstring;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class RemoveSpaceFromString {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inStr;
        inStr = input.nextLine();
        char[] inArr = inStr.toCharArray();
        List noSp = new ArrayList();
        for(int i = 0; i <= inArr.length - 1; i++) {
            if(inArr[i] != ' ') {
                noSp.add(inArr[i]);
            }
        }
        System.out.print(noSp);
    }
}
