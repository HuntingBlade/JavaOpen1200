import java.util.Scanner;

/**
 * @description: 如果替换字符串替换后与原字符串一致，是否地址也相等
 * @author: CL
 * @time: 2019/11/8 15:49
 * 结论： 不相等
 */
public class ReplaceString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str = scanner.nextLine();
        System.out.println("请输入要搜索的字符串：");
        String sStr = scanner.nextLine();
        System.out.println("请输入要替换的字符串：");
        String reStr = scanner.nextLine();
        String replace = str.replace(sStr, reStr);
        System.out.println(replace == str);
    }
}
