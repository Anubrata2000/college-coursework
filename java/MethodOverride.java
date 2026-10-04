
class MethodOverride
{
    public static void main(String args[])
    {
       Y ob = new Y();
       ob.show();
    }
}


class X
{
    void show()
    {
       System.out.println("Inside X class");
     }
}

class Y extends X
{
    void show()
    {
        super.show();
        System.out.println("Inside Y class");
     }
}

