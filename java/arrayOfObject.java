import java.util.Scanner;
class arrayOfObject{
    public static void main(String a[])
        {
            Scanner sc = new Scanner(System.in);
            int id,sal;
            Employee[] e = new Employee[3];
            for(int i = 0;i<3;i++)
            {
                System.out.print("\n Enter Id: \n");
                id = sc.nextInt();
                System.out.print("Enter sal: \n");
                sal = sc.nextInt();
                e[i] = new Employee();
                e[i].getdata(id,sal);
                //e[i].display();
            }
            for(int i = 0;i<3;i++)
            { 
                e[i].display();
            }

        }
}
class Employee
{
        int id;
        int sal;
        void getdata (int x, int y){
         id = x;
         sal = y;
        }
        void display(){
        System.out.println("id: "+ id +"sal : "+sal);
        }
       
}
