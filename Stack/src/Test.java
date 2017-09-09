import java.util.Scanner;

/*
    @Author : Bhavik Makwana
    @since : 9/09/2017
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("Welcome to Stack");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Stack");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);
        while (true) {
            System.out.println("########## Menu ##########");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Search ");
            System.out.println("4.display");
            System.out.println("5.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the value for Push ? ");
                    int pushValue = scanner.nextInt();
                    stack.push(pushValue);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Enter the value for Search ? ");
                    int searchValue = scanner.nextInt();
                    stack.search(searchValue);
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("invalid choice !!");
            }

        }
    }
}
