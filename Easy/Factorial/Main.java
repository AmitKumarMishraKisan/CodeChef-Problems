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
				int n = Integer.parseInt(br.readLine());
				int zN = findZeros(n);
				pw.println(zN);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}

	private static int findZeros(int num) {
		int zeros = 0;
		while (num > 0) {
			zeros = zeros + (num / 5);
			num /= 5;
		}
		return zeros;
	}
}
