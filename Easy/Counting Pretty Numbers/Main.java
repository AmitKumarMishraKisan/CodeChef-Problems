import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			StringTokenizer st;
			byte T = Byte.parseByte(br.readLine());
			while (T-- > 0) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				int count = 0;
				while (x % 10 != 0) {
					byte digit = (byte) (x % 10);
					if (digit == 2 || digit == 3 || digit == 9) {
						count++;
					}
					x++;
				}
				while (y % 10 != 0) {
					byte digit = (byte) (y % 10);
					if (digit == 2 || digit == 3 || digit == 9) {
						count++;
					}
					y--;
				}
				count += (((y - x) / 10) * 3);
				pw.println(count);
			}
			pw.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
