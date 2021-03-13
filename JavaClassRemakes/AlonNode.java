public class AlonNode<T> {

	private T value;
	private AlonNode next = null;
	
	public AlonNode(T value) {
		this.value = value;
		this.next = null;
		
	}
	
	public AlonNode(T value, AlonNode next) {
		this.value = value;
		this.next = next;
		
	}
	
	public T getValue() {
		return this.value;
	}
	
	public AlonNode getNext() {
		return this.next;
		
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public void setNext(AlonNode next) {
		this.next = next;
	}
	
	public void DisplayType () 
    { 
        System.out.println(this.value.getClass().getName() + 
                           " = " + this.value); 
    }
	
	
	public static <T> String Display_Type_Gen(T value) {
		return value.getClass().getName() + 
                " = " + value.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlonNode<String> node = new AlonNode<String>("funny", new AlonNode<Integer>(13));
		
		node.DisplayType();
		node.getNext().DisplayType();
		
		System.out.println(Display_Type_Gen("Hello")); 
		
	}

}
