package TheVote;
import java.util.*;
public class VotingUpdate {

    static void Home(){
        Scanner sc=new Scanner(System.in);
        int ch;
        System.out.println("-_-_-_-HOME-_-_-_-");
        System.out.println("1. Resister Voters \n2. Voting Day \n3. Declare Result \n4. Exit");
        ch=sc.nextInt();
        switch(ch){
            case 1: RegisterVoter();
                break;
            case 2:
                System.out.println("case2");
                break;
            case 3:
                System.out.println("case3");
                break;
            case 4:
                System.out.println("case4");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }
    // Register Voters Section
    static void RegisterVoter(){
        Scanner sc=new Scanner(System.in);
        int n ,i,j;
        System.out.println("Enter Number of Voters");
        n=sc.nextInt();
        // System.out.println("ID        Name        City");
        String rec[][]=new String[n][3];
        for(i=0;i<n;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter --> ID        Name        City");
                rec[n][3]=sc.next();
            }
            System.out.println("User" +" "+ i);
        }
        System.out.println("Data you entered : ");
        for(String []x:rec)
        {
            for(String y:x)
            {
                System.out.print(y+"   ");
            }
            System.out.println();
        }
        Home();

    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch,i,j;
        Home();





    }
}
