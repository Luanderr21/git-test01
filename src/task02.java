import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        System.out.println("输入整数数组:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] datas = s.split(",");
        List<Integer> list = new ArrayList<>(Collections.emptyList());
        int sum = 0;
        for (String string : datas){
            if (Integer.valueOf(string) >= 0){
                sum += Integer.valueOf(string);
            }
        }
        System.out.println("最大和为"+sum);
    }
}
