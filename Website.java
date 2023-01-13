import java.util.*;

public class Website {
    public static void main(String[] args) {
        Scanner su = new Scanner(System.in);
        System.out.println("Enter the website link: ");
        String website = su.nextLine();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website..");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website..");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indian website..");
        }
        else{
            System.out.println("Invalid website link..");
        }
    }
}
    

