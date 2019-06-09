import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			byte T = Byte.parseByte(br.readLine());
			while (T-- > 0) {
				short n = Short.parseShort(br.readLine());
				StringTokenizer st = new StringTokenizer(br.readLine());
				int[] num = new int[n];
				for (int iter = 0; iter < n; iter++) {
					num[iter] = Integer.parseInt(st.nextToken());
				}
				Arrays.sort(num);
				int min = 1000000000, dif = 0;
				for (int iter = 1; iter < n; iter++) {
					dif = num[iter] - num[iter - 1];
					if (dif < min) {
						min = dif;
					}
				}
				pw.println(min);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
}
