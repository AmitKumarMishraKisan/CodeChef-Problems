import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] input = br.readLine().split(" ");
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			int count = 0;
			for(int i = 0; i < n; i++) {
				if(Integer.parseInt(br.readLine()) % k == 0) {
					count++;
				}
			}
			System.out.println(count);
		} catch (Exception e) {
		}
	}
}
