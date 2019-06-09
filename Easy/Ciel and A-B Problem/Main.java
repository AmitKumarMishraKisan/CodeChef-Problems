import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			String[] input = br.readLine().split(" ");
			int m = Integer.parseInt(input[0]);
			int n = Integer.parseInt(input[1]);
			int result = m - n;
			char[] arr = Integer.toString(result).toCharArray();
			int iter = new Random().nextInt(arr.length);
			if (arr[iter] > '0' && arr[iter] < '9') {
				arr[iter]++;
			} else if (arr[iter] == '0') {
				arr[iter]++;
			} else if (arr[iter] == '9') {
				arr[iter]--;
			}
			pw.println(arr);
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
}
