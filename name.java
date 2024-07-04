import java.util.Scanner;
class name{
  public static void main(String[] args){
    System.out.println("Who are you?");
		System.out.print("> ");
		Scanner sc = new Scanner(System.in);
	  String input = sc.nextLine();
		System.out.println("Hello, "+ input + "!");
	}
}
