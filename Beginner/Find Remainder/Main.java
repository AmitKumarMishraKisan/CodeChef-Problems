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
				String[] input = br.readLine().split(" ");
				short m = Short.parseShort(input[0]);
				short n = Short.parseShort(input[1]);
				pw.println(m % n);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
}
