import java.util.Scanner;

class user_in2 {
    public static void main(String args[]){
        Scanner zen = new Scanner(System.in);
        String name = zen.nextLine();
        String address = zen.nextLine();
        int age = zen.nextInt();

        System.out.println("name:"+name);
        System.out.println("address:"+address);
        System.out.println("age"+age);
    }
}
