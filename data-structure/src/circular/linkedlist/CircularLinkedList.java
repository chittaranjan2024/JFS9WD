package circular.linkedlist;

class Link {
	   public int key;
	   public int data;
	   public Link next;
	   public Link prev;

	   public Link(int key, int data){
	      this.key = key;
	      this.data = data;
	   }

	   public void display(){
	      System.out.print("{"+key+","+data+"}");
	   }
	}
public class CircularLinkedList {
	//this link always point to first Link 
	   private Link first;

	   // create an empty linked list 
	   public CircularLinkedList(){
	      first = null;       
	   }

	   public boolean isEmpty(){
	      return first == null;
	   }

	   public int length(){
	      int length = 0;

	      //if list is empty
	      if(first == null){
	         return 0;
	      }

	      Link current = first.next;

	      while(current != first){
	         length++;
	         current = current.next;   
	      }
	      return length;
	   }

	   //insert link at the first location
	   public void insertFirst(int key, int data){
	   //create a link
	   Link link = new Link(key,data);
	      if (isEmpty()) {
	         first  = link;
	         first.next = first;
	      }      
	      else{
	         //point it to old first node
	         link.next = first;
	         //point first to new first node
	         first = link;
	      }      
	   }

	   //delete first item
	   public Link deleteFirst(){
	      //save reference to first link
	      Link tempLink = first;
	      if(first.next == first){  
	         first = null;
	         return tempLink;
	      }     

	      //mark next to first link as first 
	      first = first.next;
	      //return the deleted link
	      return tempLink;
	   }

	   public void display(){

	      //start from the beginning
	      Link current = first;
	      //navigate till the end of the list
	      System.out.print("[ ");
	      if(first != null){
	         while(current.next != current){
	            //print data
	            current.display();
	            //move to next item
	            current = current.next;
	            System.out.print(" ");
	         }
	      }
	      System.out.print(" ]");
	   }   
	public static void main(String[] args) {
		CircularLinkedList list = new CircularLinkedList();

	      list.insertFirst(1, 10);
	      list.insertFirst(2, 20);
	      list.insertFirst(3, 30);
	      list.insertFirst(4, 1);
	      list.insertFirst(5, 40);
	      list.insertFirst(6, 56);

	      System.out.print("\nOriginal List: ");  
	      list.display();
	      System.out.println("");  
	      while(!list.isEmpty()){            
	         Link temp = list.deleteFirst();
	         System.out.print("Deleted value:");  
	         temp.display();
	         System.out.println("");
	      }         
	      System.out.print("List after deleting all items: ");          
	      list.display();
	      System.out.println("");
	   }

	}


