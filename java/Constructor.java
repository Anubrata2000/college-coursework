class Constructor
{
    public static void main(String[] args) 
    {
        // Instantiate objects using different constructors
        constructor c1 = new constructor();
        constructor c2 = new constructor("John");
        constructor c3 = new constructor("Jane", 30);

        // Output the object properties
        System.out.println(c1.getName() + " " + c1.getAge());
        System.out.println(c2.getName() + " " + c2.getAge());
        System.out.println(c3.getName() + " " + c3.getAge());
    }
}

class constructor 
{
      private String name;
      private int age;

      // Default constructor
      constructor() 
      {
        this.name = "Unknown";
        this.age = 0;
      }

      // Constructor with name parameter
      constructor(String name) 
      {
        this.name = name;
        this.age = 0;
      }

      // Constructor with name and age parameters
      constructor(String name, int age) 
      {
        this.name = name;
        this.age = age;
      }

      // Getter methods
      public String getName() 
      {
        return this.name;
      }

      public int getAge() 
      {
        return this.age;
      }
}


