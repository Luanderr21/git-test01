import java.util.*;

public class task02 {
    public static void main(String[] args) {
        System.out.println("输入整数数组:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //解析输入字符串到int数组
        String[] datas = s.split(",");
        int[] nums = new int[datas.length];
        for (int i = 0; i < datas.length; i++) {
            nums[i] = Integer.valueOf(datas[i]);
        }
        //最大子数组字典
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = Math.max(sum[i-1] + nums[i], nums[i]);
        }
        //排序返回字典最大值
        Arrays.sort(sum);
        System.out.println("最大和为"+ sum[sum.length - 1]);
    }
}
