import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			byte T = Byte.parseByte(br.readLine());
			while (T-- > 0) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				short n = Short.parseShort(st.nextToken());
				short m = Short.parseShort(st.nextToken());
				st = new StringTokenizer(br.readLine());
				short[] m_list = new short[m];
				for (int iter = 0; iter < m; iter++) {
					m_list[iter] = Short.parseShort(st.nextToken());
				}
				Arrays.sort(m_list);
				Vector<Integer> chef_list = new Vector<>();
				Vector<Integer> assistant_list = new Vector<>();
				boolean mode = true;
				int count = 1;
				for (int index = 0; count <= n && index < m; count++) {
					if (count < m_list[index]) {
						if (mode) {
							chef_list.add(count);
							mode = false;
						} else {
							assistant_list.add(count);
							mode = true;
						}
					} else {
						if (count > m_list[index]) {
							count--;
						}
						index++;
					}
				}
				while (count <= n) {
					if (mode) {
						chef_list.add(count);
						mode = false;
					} else {
						assistant_list.add(count);
						mode = true;
					}
					count++;
				}
				for (Integer i : chef_list) {
					pw.print(i + " ");
				}
				pw.println();
				for (Integer i : assistant_list) {
					pw.print(i + " ");
				}
				pw.println();
			}
			pw.close();
			br.close();
		} catch (Exception e) {
		}
	}
}
