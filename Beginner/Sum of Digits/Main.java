import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int T = Integer.parseInt(br.readLine());
			while (T-- > 0) {
				String n = br.readLine();
				byte sum = findSum(n);
				pw.println(sum);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}

	private static byte findSum(String num) {
		byte sum = 0;
		char[] arr = num.toCharArray();
		for(Character ch : arr) {
			sum += Byte.parseByte(ch.toString());
		}
		return sum;
	}
}
