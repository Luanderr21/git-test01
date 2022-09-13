public class task03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 20000; i++) {
            boolean flag = true;
            //从1到n遍历 优化为 2到n平方根遍历
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(i + " ");
                count++;
                if (count % 5 == 0)
                    System.out.print('\n');
            }
        }
    }
}
