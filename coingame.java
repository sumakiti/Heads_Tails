import java.util.Random;
import java.util.Scanner
class coingame{
    public static void main(String[] args){
  	String[] state={"Head","Tail"};
  	int count1=0,count2=0;
  	Random r = new Random();
    System.out.println("Who are you?");
	System.out.print("> ");
	Scanner sc = new Scanner(System.in);
	String input = sc.nextLine();
	System.out.println("Hello, "+ input + "!");
  	System.out.println("Tossing a coin...");
  	for(int i=1;i<4;i++){
  	    System.out.print("Round " + i +" ");
  	    String coin=state[r.nextInt(2)];
  	    System.out.println(coin);
  	    if(coin=="Head")count1++;
  	    else count2++;
  	}
  	System.out.println("Heads: "+count1+", Tails: "+count2);
    if(count1>count2)System.out.println(input +"won.");
    else System.out.println(input +"lost.");
      }
  }
