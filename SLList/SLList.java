public class SLList {
	// private IntNode first;
	private int size;
	private IntNode sentinel;

	public SLList() {
		sentinel = new IntNode(1, null);
		size = 0;
	}

	public SLList(int x) {
		// first = null;
		sentinel = new IntNode(1, null);
		sentinel.next = new IntNode(x, null);
		size = 1;
	}

	public void addFirst(int x) {
		sentinel.next = new IntNode(x, sentinel.next);
		size += 1;
	}
	public int getFirst() {
		return sentinel.next.item;
	}

	public void addLast(int x) {
		IntNode p = sentinel;
		while(p.next != null) {
			p = p.next;
		}
		p.next = new IntNode(x, null);
		size += 1;
	}

	// public static int size(IntNode p) {
	// 	if(p.next == null) {
	// 		return 1;
	// 	}
	// 	return 1 + size(p.next);
	// }

	public int size() {
		// return size(first);
		return size;
	}

	public static void main(String[] args) {
		SLList L = new SLList(15);
		L.addFirst(10);
		L.addFirst(5);
		int x = L.getFirst();
		System.out.println(x);
		System.out.println(L);
	}


	/**
	 * 	带有static关键词时, 说明嵌套的静态类不能访问外部类中的任何变量与方法
	 * 
	 * 	即, IntNode中不能访问外部SLList中的fitst、addFitst等
	*/
	public static class IntNode {
	public int item;
	public IntNode next;
	public IntNode(int i, IntNode n) {
			item = i;
			next = n;
		}
	}
}