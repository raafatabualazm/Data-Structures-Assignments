package com.raafat;

public class linkedlist {
    public  link first;
    public linkedlist(){
        first =null;
    }
    public boolean isempty(){
        return (first==null);
    }
    public void insertfirst(int d)
    {
        link newlink =new link(d);
        newlink.next=first;
        first=newlink;
    }
    public int deletefirst() {
        link temp=first;
        first=first.next;
        return temp.date;
    }
    public void displaylist()
    {
        link curr = first;
        while(curr!=null){
            curr.displaylink();
            curr=curr.next;
        }
        System.out.println("end");

    }
    public link find (int key){
        link curr= first;
        while(curr.date!=key)
        {
            if(curr.next==null)
                return null;
            else
                curr=curr.next;
        }
        return curr;
    }

    public link delete (int key)
    {
        link curr= first;
        link prev=first;
        while(curr.date!=key)
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
    public linkedlist getUnion(linkedlist l2) {
        linkedlist internalList = new linkedlist();
        link curr = first;
        while (curr != null) {
            if (l2.find(curr.date) != null && (internalList.first == null || internalList.find(curr.date) == null)) {
                internalList.insertfirst(curr.date);
            }
            curr = curr.next;

        }

        return internalList;
    }


}