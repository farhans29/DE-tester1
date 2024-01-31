import java.util.*;

class hero
{
    public String nama1 = "Hiro Hamada";
    public String nama2 = "Go Go Tomago";
    public String nama3 = "Fred";

}
public class aplikasi
{
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();

    static String pressEnter ="Press \"ENTER \" to continue...";
    static int player = rand.nextInt(2);
    static int dice = 0;
    static int multiplier = 0;

    public static void prompEnter()
    
    {
        System.out.println(pressEnter);
        scan.nextLine();
        
    }

    public static void main (String[]args)
    {
        hero chara = new hero();

        prompEnter();
        
        int ptr = 3;
          
        System.out.println("CHAMPIONS : ");
        System.out.println("1. Hiro Hamada");
        System.out.println("2. Go Go Tomago");
        System.out.println("3. Fred");
        System.out.print("Choose your champion! : ");
        int choose = scan.nextInt();
    
        switch(choose)
        {
            case 1:
                System.out.println("\nYou Choose "+chara.nama1);
                ptr = 0;
                break;
            
            case 2:
                System.out.println("\nYou Choose "+chara.nama2);
                ptr=0;
                break;
            
            case 3:
                System.out.println("\nYou Choose "+chara.nama3);
                ptr=0;
                break;
        }
        
        if(choose > 3)
        {
            System.out.println("Please input number correctly!");
            ptr-=1;
        }
            

        scan.close();
    }
}