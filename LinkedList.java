
//(1)

//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> k= new LinkedList<Integer>();
//        k.add(78);
//        k.add(34);
//        k.add(12);
//        k.add(98);
//        System.out.println(k);
//
//
//    }
//}

//_______________________________________________________________________________________________________________________

//(2)

//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> k= new LinkedList<Integer>();
//        k.add(78);
//        k.add(34);
//        k.add(12);
//        k.add(98);
//        System.out.println("Array before insertion "+k);
//        System.out.println();
//        k.set(0,72);
//        k.set(2,67);
//        k.set(3,76);
//        System.out.println("Array after insertion");
//        System.out.println(k);
//
//
//    }
//}

//___________________________________________________________________________________________________________________________

//(3)

//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> k = new LinkedList<Integer>();
//        k.add(78);
//        k.add(34);
//        k.add(12);
//        k.add(98);
//        LinkedList<Integer> l = new LinkedList<Integer>();
//        l.add(45);
//        l.add(89);
//        l.add(23);
//        l.add(56);
//        l.addAll(k);
//        System.out.println("Addition of linklist first and second" + k);
//    }
//}

//___________________________________________________________________________________________________________________________

//(4)
//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<String> k = new LinkedList<String>();
//        k.add("ravi");
//        k.add("vijay");
//        k.add("ramesh");
//        k.add("gopal");
////        System.out.println("linklist before addiing" + k);
//        LinkedList<String> l = new LinkedList<String>();
//        l.add("chris");
//        l.add("jose");
//        l.add("ben");
//        l.add("Tom");
//        l.addAll(k);
//        l.replaceAll(k,"ygg");
//
////        l.clear();
////        l.contains("ramesh");
//       System.out.println(l);
//        System.out.println("Linklist after adding" + l);
//    }
//}
//_____________________________________________________________________________________________________________________________

//(4)

//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<String> k = new LinkedList<String>();
//        k.add("ravi");
//        k.add("vijay");
//        k.add("ramesh");
//        k.add("gopal");
//        k.add("ganesh");
//        System.out.println("linklist before addiing" + k);
//        LinkedList<String> l = new LinkedList<String>();
//        l.add("chris");
//        l.add("jose");
//        l.add("ben");
//        l.add("Tom");
//        l.add("don");
//        l.addAll(k);
//        System.out.println("Linklist after adding linklist 1 in 2" + l);
//        LinkedList<String> m = new LinkedList<String>();
//        m.add("vikram");
//        m.add("gokul");
//        m.add("shraddha");
//        m.add("vishnu");
//        m.add("fidha");
//        m.addAll(k);
//        System.out.println("Adding of linklist 1 in 3" + m);
//        LinkedList<String> n = new LinkedList<String>();
//        n.add("radha");
//        n.add("krishna");
//        n.add("raavan");
//        n.add("bheem");
//        n.add("tina");
//        n.addAll(k);
//        System.out.println("Adding of linklist 1 in 4 " + n);
//        LinkedList<String> j = new LinkedList<String>();
//        j.add("Raju");
//        j.add("jaggu");
//        j.add("kaalia");
//        j.add("chutki");
//        j.add("Indhumati");
//        j.addAll(k);
//        System.out.println("Adding of linklist 1 in 5" + m);
//
//    }
//}

//__________________________________________________________________________________________________________________________

//(6)

// Removing of first and last element from the linkedlist

//
//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<String> j = new LinkedList<String>();
//        j.add("Raju");
//        j.add("jaggu");
//        j.add("kaalia");
//        j.add("chutki");
//        j.add("Indhumati");
//        j.removeFirst();
//        j.removeLast();
//        System.out.println("After removing of first element" + j);
//        System.out.println("After removing of last element "+j);
//        j.remove("chutki");
//        System.out.println("After removing the random name "+j);
//
//    }
//}

//_____________________________________________________________________________________________________________________

//(6)

//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<String> k = new LinkedList<String>();
//        k.add("ravi");
//        k.add("vijay");
//        k.add("ramesh");
//        k.add("gopal");
//        k.add("ganesh");
//        System.out.println("linklist before addiing" + k);
//        LinkedList<String> l = new LinkedList<String>();
//        l.add("chris");
//        l.add("jose");
//        l.add("ben");
//        l.add("Tom");
//        l.add("don");
//        l.addAll(k);
//        System.out.println("Linklist after adding linklist 1 in 2" + l);
//        LinkedList<String> m = new LinkedList<String>();
//        m.add("vikram");
//        m.add("gokul");
//        m.add("shraddha");
//        m.add("vishnu");
//        m.add("fidha");
//        m.addAll(k);
//        System.out.println("Adding of linklist 1 in 3" + m);
//        m.removeAll(l);
//        LinkedList<String> n = new LinkedList<String>();
//        n.add("radha");
//        n.add("krishna");
//        n.add("raavan");
//        n.add("bheem");
//        n.add("tina");
//        n.addAll(m);
//        System.out.println("Adding of linklist 3 and 4 " + n);
//        LinkedList<String> j = new LinkedList<String>();
//        j.add("Raju");
//        j.add("jaggu");
//        j.add("kaalia");
//        j.add("chutki");
//        j.add("Indhumati");
//        j.addAll(m);
//        System.out.println("Adding of linkedlist 2 in 5"+j);
//        j.removeAll(m);
//
//
//    }
//}

//________________________________________________________________________________________________________________________

//(6)

// finding the even number and odd number in the arraylist

//
//import java.util.LinkedList;
//
//public class C {
//    public static void main(String[] args) {
//
//        LinkedList<Integer> k = new LinkedList<Integer>();
//        k.add(4);
//        k.add(89);
//        k.add(13);
//        k.add(12);
//        k.add(18);
//        k.add(24);
//        k.add(13);
//        int c=0;
//        for(int i=0; i<k.size(); i++)
//        {
//            if(k.get(i)%2==0)
//            {
//                System.out.println("even numbers are = "+ k.get(i));
//            }
//            else
//            {
//                System.out.println("odd numbers are ="+k.get(i));
//            }
//        }
//
//    }
//}

//______________________________________________________________________________________________________________________

//(7)

//import java.util.*;
//
//public class C {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        LinkedList<Integer> l = new LinkedList<Integer>();
//        System.out.println("enter the elements in an arrylist or linkedlist");
//        System.out.println("enter the size of the ArrayList or LinkedList");
//        int c = sc.nextInt();
//        for (int i = 0; i < c; i++)
//        {
//            int a = sc.nextInt();
//            l.add(a);
//        }
//        System.out.println(" categorize the elements into ArrayList or LinkedList");
//        String b = sc.nextLine();
//        if (b.equalsIgnoreCase("ArrayList"))
//        {
//            if (l.get(c) % 2 == 0)
//            {
//                System.out.println(l.get(c));
//            }
//            else
//            {
//                System.out.println(l.get(c));
//            }
//        }
//        if (b.equalsIgnoreCase("LinkedList")) {
//            if (l.get(c) % 2 == 0) {
//                System.out.println(l.get(c));
//            } else {
//                System.out.println(l.get(c));
//            }
//
//        }
//    }
//}

//__________________________________________________________________________________________________________________________

//(8)
//
//import java.util.*;
//
//public class C {
//
//    class A {
//        int a = 12;
//        int b = 4;
//
//        void multi() {
//            System.out.println(a * b);
//        }
//
//        void sub() {
//            System.out.println(a - b);
//        }
//
//        void div() {
//            System.out.println(a / b);
//        }
//
//
//            class B {
//                void add()
//                {
//                    System.out.println(a + b);
//                }
//
//                void sub()
//                {
//                    System.out.println(a - b);
//                }
//
//                class D {
//                    void add()
//                    {
//                        System.out.println(a + b + "Its class D");
//                    }
//
//                    void sub()
//                    {
//                        System.out.println(a - b + " It's class D ");
//                    }
//
//
//
//                        class F {
//                            void add()
//                            {
//                                System.out.println(a + b + "Its class f");
//                            }
//
//                            void sub()
//                            {
//                                System.out.println(a - b + " It's class f ");
//                            }
//
//                            class G {
//                                int add() {
//                                    return a + b;
//                                }
//
//                                int sub() {
//                                    return a - b;
//                                }
//
//                            }
//                        }
//                    }
//
//                }
//            }
//
//
//
//
//    public static void main(String[] args)
//    {
//        new C().new A().multi();
//        new C().new A().sub();
//        new C().new A().div();
//        C c= new C();
//        C.A a= c.new A();
//        C.A.B b= a.new B();
//        new C().new A().new B().add();
//        new C().new A().new B().sub();
//        new C().new A().new B().new D().add();
//        new C().new A().new B().new D().sub();
//        new C().new A().new B().new D().new F().sub();
//        new C().new A().new B().new D().new F().add();
//        new C().new A().new B().new D().new F().new G().sub();
//        System.out.println(new C().new A().new B().new D().new F().new G().add());
//        System.out.println(new C().new A().new B().new D().new F().new G().sub());




//    }
//}

//________________________________________________________________________________________________________________________

class A{

    static class B {
       static int a=5;
        static int b=6;
        static void f()
        {
            System.out.println("hello"+" "+a+b);
        }

//        class C {
//            void c()
//            {
//                System.out.println("bye"+a+b);
//            }
//
//            static class D {
//
//                static void d()
//                {
//                    System.out.println("overwhelm"+a+b);
//                }
//
//                class E {
//                    void e()
//                    {
//                        System.out.println("grasp"+a+b);
//                    }
//                }
//            }
//        }
    }
}
//public class C {
//    public static void main(String[] args)
//    {
//        A.B.f();
//
//    }
//}

//_______________________________________________________________________________________________________________________

