public class DoubleList<T> {

	
	BinNode<T> first = null;
	
	
	public DoubleList(T val, BinNode<T> right) {
		this.first = new BinNode<T>(null, val , right);
		if (right != null)
			right.setLeft(this.first);
	}
	
	public boolean isEmpty() {
		if (this.first.getRight() == null)
			return true;
		return false;
		
	}
	
	public void remove(BinNode<T> rem) {
		BinNode<T> ptr = this.first;
		remove(rem, ptr);
	}
	
	private void remove(BinNode<T> rem, BinNode<T> ptr) {
		if (ptr.getRight() == rem) {
			ptr.setRight(rem.getRight());
			rem.getRight().setLeft(ptr);
			}
		if (ptr.getRight() != null)
			remove(rem, ptr.getRight());
	}
	
	public String toString(){
		
		String outp = "";
		BinNode<T> temp = this.first;
		while ( temp != null)
        {
			outp += temp.getValue().toString() + " , ";
            temp = temp.getRight();
        }
		return outp;
	} 
	
	public void insert(BinNode<T> node, int pos) {
		
		BinNode<T> temp = this.first;
		while ( pos != 0)
        {
            temp = temp.getRight();
            pos = pos - 1;
        }
		if (temp.getRight() != null) {
			temp.getRight().setLeft(node);
			node.setRight(temp.getRight());}
		temp.setRight(node);
		node.setLeft(temp);
		
	}
	
	public T getValue(int pos) {
			
			BinNode<T> temp = this.first;
			while ( pos != 0)
	        {
	            temp = temp.getRight();
	            pos = pos - 1;
	        }
			return temp.getValue();
			
		}
	
	public void setValue(T val,int pos) {
		
		BinNode<T> temp = this.first;
		while ( pos != 0)
        {
            temp = temp.getRight();
            pos = pos - 1;
        }
		temp.setValue(val);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleList<Integer> testList = new DoubleList<Integer>(9, new BinNode<Integer>(8));
		testList.insert(new BinNode<Integer>(8), 0);
		testList.insert(new BinNode<Integer>(6), 0);
		BinNode<Integer> remove_me = new BinNode<Integer>(3);
		testList.insert(remove_me, 0);
		System.out.println(testList.toString());
		System.out.println(testList.getValue(1));
		testList.setValue(9, 1);
		System.out.println(testList.toString());
		testList.remove(remove_me);
		System.out.println(testList.toString());
		
		
		
	}

}
