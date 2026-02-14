import java.util.Scanner;

public class EncapsulationLoginPassword{

    String userName;
    private int password=1234;

    public EncapsulationLoginPassword(String userName){
        this.userName = userName;
    }
    public String getUserName() {
        return this.userName;
    }
    public int setPassword(int password){
        this.password = password;
        return this.password;
    }

    public int getPassword(){
        return this.password;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName="madhav";
        EncapsulationLoginPassword login= new EncapsulationLoginPassword(userName);
        System.out.println("Welcome to login page");
        System.out.println(login.getUserName());

        int count = 3;
        while(count!=0){
            System.out.print("Enter Password: ");
            int password = sc.nextInt();
            if(password != login.getPassword()){
                System.out.println("Wrong password! you have left with "+(count-1)+" chances..");
            }else{
                System.out.println("Welcome to MAD bank");
                break;
            }
            count--;
            if(count == 0){
                System.out.println("Do you want to forgot password? type yes/no");
                String check = sc.next().toLowerCase();
                if(check.equals("yes")){
                    System.out.print("Set new password: ");
                    int newPassword = sc.nextInt();
                    login.setPassword(newPassword);
                    System.out.println("Password changed successfully");
                    System.out.print("Do you want to Re-login: ");
                    check = sc.next();
                    if(check.equals("yes")) count=3;

                }else{System.out.println("Thank you for coming");}
            }
        }
    }
}