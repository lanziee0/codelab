import java.io.*;


public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            int sum = 1;
            int result = 0;
            int nTmp = 1000000000/6;
            String s="";

                s = br.readLine();
                int roomNo = Integer.parseInt(s);

                if( roomNo <1 || roomNo >1000000000 )
                    throw new Exception("out of range");
                if( roomNo== 1) {
                    result = 1;
                }else {
                    for (int i = 1; i < nTmp; i++) {
                        sum += 6 * i;

                        if (sum >= roomNo) {
                            result = i + 1;
                            break;
                        }
                    }
                }
                System.out.println( result );

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}