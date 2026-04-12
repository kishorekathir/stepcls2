public class helloapp{
	public static void main(string[] args){
		string greeting;
		if (args.length==0){
			greeting="hello, world!";
		}
		else{
			stringbuilder nameBuilder = new stringBuilder();
			for(string name; args){
				nameBuilder.append(name);
				nameBuilder.append(", ");
			}
			string names= nameBuilder.substring(0,nameBuilder.length()-2);
			greeting="hello,"+ names + ";
		}
		system.out.println("hello," +name+ "!");
	}
}