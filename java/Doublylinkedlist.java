import java.util.*;

class Doublylinkedlist
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Linklist list = new Linklist();
        boolean flag = true;
        while(flag)
        {
            System.out.println("Enter your choice:");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at beginning");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at position");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            
            int choice = scanner.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the value to be inserted:");
                    int value = scanner.nextInt();
                    list.addFirst(value);
                    break;
                    
                case 2:
                    System.out.println("Enter the value to be inserted:");
                    value = scanner.nextInt();
                    list.addLast(value);
                    break;
                    
                case 3:
                    System.out.println("Enter the position to insert the value:");
                    int position = scanner.nextInt();
                    System.out.println("Enter the value to be inserted:");
                    value = scanner.nextInt();
                    list.addAtIndex(position, value);
                    break;
                    
                    
                case 4:
                    System.out.println("Deleting first node");
                    list.deleteFirst();
                    break;
                    
                case 5:
                    System.out.println("Deleting last node");
                    list.deleteLast();
                    break;
                    
                case 6:
                    System.out.println("Enter the position to delete the node:");
                    position = scanner.nextInt();
                    list.deleteAtIndex(position);
                    break;
                    
                case 7:
                    list.display();
                    break;
                    
                case 8:
                    flag = false;
                    break;
                    
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}

class Node
{
    int data;
    Node next;
    Node prev;
    
    public Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}


class LinkedList
{
    Node head;
    Node tail;
    int size;
    
    public LinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = tail = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    
    public void addAtIndex(int index, int data)
    {
        if(index < 0 || index > size)
        {
            System.out.println("Invalid index.");
            return;
        }
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        if(index == size)
        {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        Node curr = head;
        for(int i = 0; i < index - 1; i++)
        {
            curr = curr.next;
        }
        newNode.next = curr.next;
        newNode.prev = curr;
        curr.next.prev = newNode;
        curr.next = newNode;
        size++;
    }
    
    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        if(head == tail)
        {
            head = tail = null;
        }
        else
        {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        if(head == tail)
        {
            head = tail = null;
        }
        else
        {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    
    public void deleteAtIndex(int index)
    {
        if(index < 0 || index >= size)
        {
            System.out.println("Invalid index.");
            return;
        }
        if(index == 0)
        {
            deleteFirst();
            return;
        }
        if(index == size - 1)
        {
            deleteLast();
            return;
        }
        Node curr = head;
        for(int i = 0; i < index; i++)
        {
            curr = curr.next;
        }
        curr.prev.next = curr.next;
        curr.next.prev = curr.prev;
        size--;
    }
    
    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty.");
            return;
        }
        Node curr = head;
        while(curr != null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
    
    public int getSize()
    {
        return size;
    }
}