public class UserQueue<T> {

    Node Head;
    Node Tail;

    public void add(T uData){
        Node<T> curData = new Node<>();
        curData.value = uData;
        if(Head == null){
            Head = curData;
            Tail = curData;
        } else {
            curData.next = Head;
            Head.previous = curData;
            Head = curData;
        }
    }

    public void add(int priority, T uData){
        Node<T> curData = new Node<>();
        curData.value = uData;
        curData.priority = priority;
        Node temp = Head;
        boolean flag = true;
        if(Head == null){
            Head = curData;
            Tail = curData;
        } else {
            while(flag && temp != null){
                if(curData.priority >= temp.priority){
                    if(temp.previous == null){
                        Head.previous = curData;
                        curData.next = Head;
                        Head = curData;
                    }
                    else {
                        curData.next = temp;
                        curData.previous = temp.previous;
                        temp.previous.next = curData;
                        temp.previous = curData;
                    }
                    flag = false;
                }
                else {
                    if(temp.next == null){
                        temp.next = curData;
                        curData.previous = temp;
                        Tail = curData;
                        flag = false;
                    } else if(temp.next != null && temp.next.priority < curData.priority){
                        curData.next = temp.next;
                        curData.previous = temp.next.previous;
                        temp.next.previous = curData;
                        temp.next = curData;
                        flag = false;
                    }
                }
                temp = temp.next;
            }
        }
    }

    public void get(){
        Node temp = Tail;
        while(temp != null){
            System.out.println(temp.priority+":"+temp.value);
            temp = temp.previous;
        }
    }
    public void get(T item){
        Node temp = Tail;
        boolean flag = true;
        while(flag && temp != null){
            if(temp.value.equals(item)){
                System.out.println(temp.priority+":"+temp.value);
                flag = false;
            }

            temp = temp.previous;
        }
    }

    public void del(T uData){
        Node curData = Head;
        while(curData != null){
            if(curData.value.equals(uData)){
                if(curData.previous == null){
                    Head = Head.next;
                    Head.previous = null;
                } else if(curData.next == null){
                    Tail = Tail.previous;
                    Tail.next = null;
                } else {
                    curData.previous.next = curData.next;
                    curData.next.previous = curData.previous;
                }
            }
            curData = curData.next;
        }
    }

    public class Node<V>{
        V value;
        int priority;
        Node next;
        Node previous;
    }

}
