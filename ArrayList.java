

// ArrayList Assignment

//   Insertion of Wraper class in Arraylist.
//(1)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(23);
//        b.add(34);
//        b.add(56);
//        b.add(76);
//        System.out.println(b);
//    }
//}




//(2)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Character> b= new ArrayList<Character>();
//        b.add('f');
//        b.add('h');
//        b.add('h');
//        b.add('d');
//        System.out.println(b);
//    }
//}

//(3)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Float> b= new ArrayList<Float>();
//        b.add(1.2f);
//        b.add(4.2f);
//        b.add(4.5f);
//        b.add(3.2f);
//        System.out.println(b);
//    }
//}


//(4)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//       ArrayList<Double> b= new ArrayList<Double>();
//        b.add(1.267);
//        b.add(4.245);
//        b.add(4.545);
//        b.add(3.245);
//        System.out.println(b);
//    }
//}



//(5)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<String> l= new ArrayList<String>();
//        l.add("1267");
//        l.add("Sting");
//        l.add("fgh");
//        l.add("gir");
//        System.out.println(l);
//    }
//}


//(6)
//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Long> l= new ArrayList<Long>();
//        l.add(3542);
//        l.add(4535);
//        l.add(456);
//        l.add(76587);
//        System.out.println(l);
//    }
//}

//(7)


//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Short> l= new ArrayList<Short>();
//        public l.add(354);
//        l.add(-237);
//        l.add(1269);
//        l.add(127);
//        System.out.println(l);
//    }
//}


//(8)

//import java.util.*;
//
//public class B {
//    public static void main(String[] args)
//    {
//        ArrayList<Boolean> l= new ArrayList<Boolean>();
//        l.add(true);
//        l.add(false);
//        l.add(true);
//        l.add(false);
//          l.add(true);
//        System.out.println(l);
//    }
//}
//______________________________________________________________________________________________________

//(B)
// Insert multiple datatypes in an arraylist :
//(1)
//
//import java.util.ArrayList;
//
//public class B {
//    public static void main(String[] args) {
//        ArrayList l = new ArrayList();
//        l.add(0, "hello");
//        l.add(0, "Bye Bye");
//        l.add(2, "Where");
//        l.add(4, "yes");
//        l.add(6, "Going");
//
//        for (int i = 0; i < l.size(); i++)
//        {
//            System.out.println(l);
//        }
//    }
//}

//___________________________________________________________________________________________________________________

//
// Print even number through arraylist

//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//               b.add(23);
//        b.add(44);
//        b.add(60);
//        b.add(12);
//        b.add(55);
//        b.add(89);
//
//        for(int i=0; i<b.size(); i++)
//        {
//            if(b.get(i)%2==0)
//            {
//                System.out.println(b.get(i));
//            }
//        }
//    }
//}


//
// Print odd number through Arraylist

//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(23);
//        b.add(44);
//        b.add(60);
//        b.add(12);
//        b.add(55);
//        b.add(89);
//
//        for(int i=0; i<b.size(); i++)
//        {
//            if(b.get(i)%2!=0)
//            {
//                System.out.println(b.get(i));
//            }
//        }
//    }
//}


//___________________________________________________________________________________________________________________

//
//print multiple datatypes in arraylist
//import java.util.ArrayList;
//
//public class B {
//    public static void main(String[] args) {
//        ArrayList l = new ArrayList();
//        l.add( "hello");
//        l.add(0);
//        l.add(2.6f);
//        l.add(4);
//        l.add("Going");
//            System.out.println(l);
//
//    }
//}

//_______________________________________________________________________________________________________________________


// Print integers from 1 to 7

//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//
//        for(int i=0; i<b.size(); i++)
//        {
//
//            {
//                System.out.println(b.get(i));
//            }
//        }
//    }
//}

//____________________________________________________________________________________________________________________________


// replace the element with other element

import java.util.*;
public class B{
    public static void main(String[] args) {


        ArrayList<Integer> b= new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.indexOf(3);
//        b.set(2,66);

        System.out.println(b);

    }
}

//____________________________________________________________________________________________________________________________

// remove the first element
//
//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//        b.remove(0);
//
//        System.out.println(b);
//
//    }
//}

// Remove last element from the arraylist
//
//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//        b.remove(6);
//
//        System.out.println(b);
//
//    }
//}

//_____________________________________________________________________________________________________________________

// remove element 3 and replace with 89
//
//import java.util.*;
//public class B{
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b= new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//        b.set(2,89);
//        System.out.println(b);
//
//    }
//}

//_________________________________________________________________________________________________________________________

// Print even elements in an ArrayList

//
//import java.util.*;
//public class B {
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b = new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//
//        for (int i = 0; i < b.size(); i++)
//            if (b.get(i) % 2 == 0)
//            {
//                System.out.println(b.get(i));
//
//            }
//    }
//}


// Print odd elements from the arraylist
//import java.util.*;
//public class B {
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b = new ArrayList<Integer>();
//        b.add(1);
//        b.add(2);
//        b.add(3);
//        b.add(4);
//        b.add(5);
//        b.add(6);
//        b.add(7);
//
//        for (int i = 0; i < b.size(); i++)
//            if (b.get(i) % 2 != 0)
//            {
//                System.out.println(b.get(i));
//
//            }
//    }
//}

//_______________________________________________________________________________________________________________________

// Sorting of elements in an arraylist

//import java.util.*;
//public class B {
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b = new ArrayList<Integer>();
//        b.add(6);
//        b.add(2);
//        b.add(3);
//        b.add(7);
//        b.add(1);
//        b.add(4);
//        b.add(5);
//        Collections.sort(b);
//        System.out.println(b);
//    }
//}

//__________________________________________________________________________________________________________________________

// using different methods of arraylist
//
//import java.util.*;
//public class B {
//    public static void main(String[] args) {
//
//
//        ArrayList<Integer> b = new ArrayList<Integer>();
////        add method to add elements in an array
//        b.add(6);
//        b.add(2);
//        b.add(3);
//        b.add(7);
//        b.add(1);
//        b.add(4);
//        b.add(5);
//
//        Collections.sort(b);
//        System.out.println("Sorting of elements in an arraylist");
//        System.out.println(b);
////        get method to access paticular elements in an arraylist
//        System.out.println("to access paricular elements in an arraylist");
//        System.out.println(b.get(0));
////        remove an element from an arraylist
//        System.out.println("remove an element from the arraylist");
//        b.remove(0);
//        System.out.println(b);
////        size method to measure the length of the elements
//        System.out.println("to measure the size of the arraylist");
//        System.out.println(b.size());
//
//    }
//}

