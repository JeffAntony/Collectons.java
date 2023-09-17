
//Assignment of stack

//(1)
 
//import java.util.*;
//
//public class Stack {
//    public static void main(String[] args) {
//       Stack<String> n = new Stack<String>();
//        n.add("radha");
//        n.add("krishna");
//        n.add("raavan");
//        n.add("bheem");
//        n.add("tina");
//        System.out.println(n);
//// using clear to delete all items
//// n.clear()
//// System.out.println(n);
//// using clone to returns a clone of vector
//// using indexOf to show the index number
////   n.clone();
////   System.out.println(n);
////   if(n.contains("Bheem"))
////   {
////     System.out.println(n.indexOf("Bheem"));
////   }
//// //   using capacity() to get the capcity
////   System.out.println(n.capacityOf());
//
//        Vector<String> k = new Vector<String>();
//        k.add("thrishha");
//        k.add("tea");
//        k.add("rdy");
//        k.add("belt");
//        k.add("shoe");
//        // using addAll to add all elements to other vector
////         k.addAll(n);
////         // using contains all to return ,if vector contains all of the elements
////          System.out.println(n.containsAll(k));
//        //  using copyInto method to copy elements into an array
//
//        // String a[]= new String[5];
//        // k.copyInto(a);
//        // for(String i: a)
//        // {
//        //   System.out.println(i);
//        // }
//
//        // using elementAt() to locate elemnents at particular index
//        // k.elementAt(0);
//        System.out.println(k.elementAt(0));
//        // equals to compare the elements between the vectors
//        System.out.println(k.equals(n));
//        // using ensureCapacity() - increase the capacity of the vector
//        k.ensureCapacity(20);
//        System.out.println(k.capacity());
//        //  using firstElements() - to get first element
//        System.out.println(k.firstElement());
//
//        //  using lastElements() - to get last element
//        System.out.println(k.lastElement());
//        //  using lastIndexOf() - to get  index of inserted element
//        System.out.println(k.lastIndexOf("belt"));
//        //  using insetElementAt()
//        k.insertElementAt("give",0);
//        System.out.println(k);
//        // using remove
//        // k.remove(2);
//        System.out.println("remove element at 2nd position = "+k);
//        // using removeAllElements - removing all elements from vector
//        // k.removeAllElements();
//        System.out.println("After removing all elements "+k.size());
//        //   using isEmpty to check the the components of the vector
//        System.out.print("using isEmpty() to check the vector empty or not"+k.isEmpty());
//        Collections.replaceAll(k,"tea","Mutton");
//        System.out.println("After replacing the element with new element "+ k);
//        // using retain all
//        k.addAll(n);
//        boolean c=k.retainAll(n);
//        if(c)
//        {
//
//            System.out.println(k.retainAll(n));
//        }
//        else
//        {
//            System.out.println(k.retainAll(n));
//        }
//
//    }
//
//}

//(2)

//import java.util.*;
//public class Main
//{
//    public static void main (String[] ardgdsa)
//    {
//
//        Stack<Integer> k = new Stack<Integer>();
//        k.push (12);
//        k.push (23);
//        k.push (34);
//        k.push (24);
//        System.out.println("size of the element"+k.size());
//        System.out.println("remove element from the top"+k.pop());
//        System.out.println("Top most element "+k.peek());
//        for(int i=0; i<k.size(); i++)
//        {
//            if(k.get(i)%2==0)
//            {
//                System.out.println("even numbers are "+ k.get(i));
//            }
//            else
//            {
//                System.out.println("odd numbers are "+ k.get(i)) ;
//            }
//        }
//
//    }
//}
