class Superdemo
{
    public static void main(String args[])
    {
          C ob = new C(10,20,70);
    }
}

class A
{   int a;
   A(int m)
    {
       a=m;  
       System.out.println("Now at Grandparent class a="+a);
    }
}

class B extends A
{  int b;
   B(int m,int n)
    {
super(n);       
b=m;
       
       System.out.println("Now at parent class b="+b);
    }
}

class C extends B
{  int c;
   C(int m , int n, int p)
    {
super(m,n);
       c=p;
       b=n; 
	
       System.out.println("Now at child class c="+c);
    }
}

