import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			double z = y - x - 0.5;
			if (x % 5 == 0 && z > 0) {
				System.out.printf("%.2f\n", z);
			} else {
				System.out.printf("%.2f\n", y);
			}
		} catch (Exception e) {
		}
	}
}
