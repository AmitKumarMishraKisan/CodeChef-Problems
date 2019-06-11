import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			byte T = Byte.parseByte(br.readLine());
			while (T-- > 0) {
				short g = Short.parseShort(br.readLine());
				while (g-- > 0) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					byte i = Byte.parseByte(st.nextToken());
					int n = Integer.parseInt(st.nextToken());
					byte q = Byte.parseByte(st.nextToken());
					if (n % 2 == 0) {
						pw.println(n / 2);
					} else {
						if (i == q) {
							pw.println(n / 2);
						} else {
							pw.println(n / 2 + 1);
						}
					}
				}
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
}
