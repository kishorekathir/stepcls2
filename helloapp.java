public class helloapp{
	public static void main(string[] args){
		string greeting;
		if (args.length==0){
			greeting="world";
		}
		else{
			stringbuilder sb = new stringbuilder();
			for(string name; args){
				if (sb.length()>0){
					sb.append(",");
				}
				sb.append(name);
			}
			greeting=sb.toString();
		}
		system.out.println("hello," +name+ "!");
	}
}