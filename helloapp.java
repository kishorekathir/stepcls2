public class helloapp{
	public static void main(string[] args){
		string name;
		if (args.length>0){
			name=string.join(",",args);
		}
		else{
			name="world";
		}
		system.out.println("hello," +name+ "!");
	}
}