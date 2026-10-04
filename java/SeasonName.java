import java.util.Scanner;
class SeasonName 
{
    public static void main(String[] args) 
    {
        Ifelse ob = new Ifelse();
        ob.season();
        switchcase ob1=new switchcase();
        ob1.season();
    }
}

        
class Ifelse
{
      public void season()
      {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();
          if (month == 12 || month == 1 || month == 2) 
        {
            System.out.println("Winter");
        } 
        else if (month == 3 || month == 4 || month == 5) 
        {
            System.out.println("Spring");
        } 
        else if (month == 6 || month == 7 || month == 8) 
        {
            System.out.println("Summer");
        }
        else if (month == 9 || month == 10 || month == 11) 
        {
            System.out.println("Fall");
        }
        else 
        {
            System.out.println("Invalid month number");
        }
   }
}
        
class switchcase
{
    public void season()
    {   
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = input.nextInt();     
        switch (month) 
        {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
    }
}
