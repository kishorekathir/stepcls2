public class helloapp{
	public static void main(string[] args){
		string name = "world";
		if (args.length>0){
			name=args[0];
		}
		system.out.println("hello," +name+ "!");
	}
}