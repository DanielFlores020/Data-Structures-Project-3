/*
******************************************************
*** Project 3
*** Daniel Flores
******************************************************
*** Created as part of project 3
******************************************************
*** September 24, 2017
******************************************************
*** Original, no changes
******************************************************
 */
package danielfloresproject3;



public class DFP3Queue 
{
    public DFP3LinkList start;
    public DFP3LinkList end;
    
    public DFP3Queue()
    {
        start = null;
        end = null;
    }
    
    public void addQueue(int value)
    {
        if (start == null)
        {
            DFP3LinkList temp = new DFP3LinkList();
            temp.value = value;
            start = temp;
            end = temp;
        }
        else
        {
            DFP3LinkList temp = new DFP3LinkList();
            temp.value = value;
            end.nextLL = temp;
            end = temp;
        }
    }
    
    public void deQueue()
    {
        if (start != null)
        {
            start = start.nextLL;
        }
    }
    
    public String display()
    {
        DFP3LinkList temp = start;
        String displayTemp = "";
        while (temp != null)
        {
            displayTemp += temp.value + " ";
            temp = temp.nextLL;
        }
        
        return displayTemp;
    }
}
