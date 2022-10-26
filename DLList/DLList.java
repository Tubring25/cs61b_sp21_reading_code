public class DLList<LochNess> {

	public class StuffNode {
		public LochNess item;
		public StuffNode next;

		public StuffNode(LochNess i, StuffNode n) {
			item = i;
			next = n;
		}
	}
	private StuffNode first;
	private int size;

	public DLList(LochNess x) {
		first = new StuffNode(x, null);
		size = 1;
	}

	public void addFirst(LochNess x) {
		first = new StuffNode(x, null);
		size += 1;
	}

	public void addLast(LochNess x) {
		StuffNode p = first;
		while(p.next != null) {
			p = p.next;
		}
		p.next = new StuffNode(x, null);
		size += 1;
	}
	public LochNess getFirsr() {
		return first.item;
	}
	public int size() {
		return size;
	}


	public static void main(String[] args) {
		DLList<String> d1 = new DLList<String>("bone");
		d1.addFirst("thugs");
	}
}