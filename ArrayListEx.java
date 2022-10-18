package PROJECT221012;

import java.util.*;

public class ArrayListEx {
    public static void main(String args[]) {
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next();
            a.add(s);
        }
        int long_index=0;

        for (int i = 0; i < a.size(); i++) {
            String name=a.get(i);
            System.out.print(name+" ");
            if(a.get(long_index).length()<a.get(i).length())
                long_index=i;
        }
        System.out.println("\n가장 긴 이름은 : "+a.get(long_index));
        scanner.close();
    }
}
