package practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

public class Practice5 {
    Executor executor = Executors.newFixedThreadPool(3);

    public List<Integer> method1(String bankID) {
        String regex = "[A-Z0-9]+CHE|DEL|BOM|BLR";

        if (Pattern.compile(regex).matcher(bankID).find()) {
            return Arrays.asList(123, 234);
        } else {
            return Arrays.asList(321, 432);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        String tmp = "74533,CHAS23,,0231,756,CHAS,,0077,76345,CHAS34JJJ,,";
        String tmp1 = tmp;
        String[] temp = tmp.split(",");
        System.out.println(temp.length);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i < temp.length; i += 4) {
            String[] tmpS = Arrays.copyOfRange(temp, i - 1, i + 3);
            System.out.println(tmpS.length);
            stringBuilder.append(String.join(",", tmpS)).append(",");
        }
        System.out.println(stringBuilder);

    }

}
