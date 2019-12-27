public class LinkedList {
    public  Link first;
    public LinkedList(){
        first =null;
    }
    public boolean isempty(){
        return (first==null);
    }
    public void insertfirst(Link l)
    {
        Link newlink = new Link(l.name, l.age, l.degree);
        newlink.next=first;
        first=newlink;
    }
    public Link deletefirst() {
        Link temp=first;
        first=first.next;
        return temp;
    }
    public void displaylist()
    {
        Link curr = first;
        while(curr!=null){
            curr.displaylink();
            curr=curr.next;
        }
        System.out.println("end");

    }
    public Link find (int key){
        Link curr= first;
        while(curr.degree!=key)
        {
            if(curr.next==null)
                return null;
            else
                curr=curr.next;
        }
        return curr;
    }

    public Link delete (int key)
    {
        Link curr= first;
        Link prev=first;
        while(curr.degree != key)
        {
            if(curr.next==null)
            {
                return null;
            }
            else {
                prev=curr;
                curr=curr.next;
            }
            if (curr==first)
            {
                first=first.next;
            }
            else {
                prev.next=curr.next;
            }
        }
        return curr;
    }


}
