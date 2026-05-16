import java.util.Scanner;

class ops1 {
    public static void main(String args[]){
        Scanner zen = new Scanner(System.in);
        String name = zen.nextLine();
        Double score = zen.nextDouble();
        zen.nextLine();
        String department = zen.nextLine();

        System.out.println("name:"+name);
        System.out.println("score:"+score/10);
        System.out.println("department:"+department);

    }
}
