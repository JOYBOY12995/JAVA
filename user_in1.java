import java.util.Scanner;

class user_in1 {
    public static void main(String args[]){
        Scanner zen = new Scanner(System.in);
        String name = zen.nextLine();
        int age = zen.nextInt();
        System.out.println(name);
        System.out.println(age);
    }
}
