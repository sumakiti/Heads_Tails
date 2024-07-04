import java.util.Random;
class coingame{
    public static void main(String[] args){
  	String[] state={"Head","Tail"};
  	int count1=0,count2=0;
  	Random r = new Random();
  	System.out.println("Tossing a coin...");
  	for(int i=1;i<4;i++){
  	    System.out.print("Round " + i +" ");
  	    String coin=state[r.nextInt(2)];
  	    System.out.println(coin);
  	    if(coin=="Head")count1++;
  	    else count2++;
  	}
  	System.out.println("Heads: "+count1+", Tails: "+count2);
      }
  }
