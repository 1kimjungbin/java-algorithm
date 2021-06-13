public class HelloWorld {
	public static void main(String[] args){
		String version = null;
		//system.oy.println("args.length = " + args.length);
		
		if(args.length > 0){
			version = args[0];
		
			switch(version){
				case "1":
					System.out.println("더하기 프로그램 버전 1");
				}
			}
	}
}