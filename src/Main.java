import com.kr.test.MathBasic1;

import java.io.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            String s = br.readLine();
            if ("2292".equals(s)) {
                MathBasic1 m = new MathBasic1();
                System.out.println(m.no2HoneyComb(br));
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}