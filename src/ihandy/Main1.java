package ihandy;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();  // Java读取包括空格的字符串
        System.out.println(solution(str));
    }

    /**
     * @Description: 字母有大小写
     * @Param: [str]
     * @Return: int
     */
    private static int solution(String str) {
        if (str.length() == 0) return 0;
        char[] ch = str.toCharArray();
        boolean flag = true;
        int count = 0;
        for (int i = ch.length-1; i >= 0; i--) {
            if (ch[i] != ' ' && (ch[i] < 'a' || ch[i] > 'z')
                    && (ch[i] < 'A' || ch[i] > 'Z')) return 0;
            else if (ch[i] == ' ') {
                if(flag) continue;
                else break;
            } else {
                count++;
                flag = false;
            }
        }
        return count;
    }
}
