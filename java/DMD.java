class DMD
{
    public static void main(String args[])
    {
          A r;
          A a = new A();
          B b = new B();
          C c = new C();
          r=c; r.show();
          r=b; r.show();
          r=a; r.show();
    }
}

class A
{ 
   void show()
    {
        System.out.println("Inside A");
    }
}

class B extends A
{ 
   void show()
    {
        System.out.println("Inside B");
    }
}

class C extends B
{ 
   void show()
    {
        System.out.println("Inside C");
    }
}

