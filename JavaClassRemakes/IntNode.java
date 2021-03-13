import java.util.*;
public class IntNode

{
    private int value;
    private IntNode next;

    public IntNode(int value)
    {
    this.value= value;
    this.next = null;

    }
    public IntNode(int value,IntNode next)
    {
    this.value= value;
    this.next = next;

    }
    public void setValue(int value)
    {
        this.value=value;
    }
    public void setNext(IntNode next)
    {
        this.next=next;

    }
    public int getValue()
    {
        return this.value;
    }
    public IntNode getNext()
    {
        return this.next;
    }
    public boolean isEquals(IntNode node)
    {
        if(this.value==node.getValue())
        {
        return true;
        }
    return false;
    }
    public String toString()
    {
        return("The Value of this node:"+ this.value);
    }

}