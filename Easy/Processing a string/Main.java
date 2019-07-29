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
				String input = br.readLine();
				int sum = 0;
				for (int i = 0; i < input.length(); i++) {
					if (Character.isDigit(input.charAt(i))) {
						sum += (input.charAt(i) - 48);
					}
				}
				pw.println(sum);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
