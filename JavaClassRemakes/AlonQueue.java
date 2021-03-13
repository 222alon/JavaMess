public class AlonQueue<T> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private AlonNode<T> rear;
    private AlonNode<T> front;

    public AlonQueue()
    {
        this.rear = null;
        this.front = null;

    }

    public AlonNode<T> Head()
    {
        return this.front;
    }

    public boolean isEmpty()
    {
        return (this.front == null) ;
    }

    public void insert( T para )
    {
        AlonNode<T> temp = new AlonNode<T>(para);

        if ( this.front == null )
        {
            this.front = temp;
            this.rear = temp;
        }
        else
        {
            this.rear.setNext(temp);
            this.rear = temp;
        }

    }

    public AlonNode<T> remove()
    {
        AlonNode<T> temp = this.front;
        if (this.front == null)
        {
            return null;
        }
        this.front = this.front.getNext();
        if ( this.front == null)
        {
            this.rear = null;
        }
        return temp;
    }

    public String toString()
    {
        AlonNode<T> temp = this.front;
        String s1 = "";
        while ( temp != null)
            {
            s1 += temp.getValue() + " , ";
            temp = temp.getNext();
            }
        return s1;
    }


}
