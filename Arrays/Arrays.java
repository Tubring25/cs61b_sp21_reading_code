public class Arrays {
	public static void main(String[] args) {
		int[] z = null;
		int[] x,y;
		x = new int[]{1,2,3,4,5};
		y = x;
		x = new int[]{-1,2,3,4,5};
		y = new int[3];
		z = new int[0];
		int xL = x.length;

		String[] s = new String[6];
		s[4] = "ketchup";
		s[x[3] - x[1]] = "muffins";

		int[] b = {9, 10 ,11};
		// 从 b 的 0th 开始, 复制 2个单位长度, 到 x 的 3th
		System.arraycopy(b, 0, x, 3, 2);
	}
}