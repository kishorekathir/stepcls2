public class helloapp{
	public static void main(string[] args){
		if (args.length ==0){
			system.out.println)"hello, world!");
		}else{
			system.out.println("hello," + string.join(", ",args) + "!");
		}
	}
}