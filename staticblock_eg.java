package static_and_final;
//everything inside same class
/*public class staticblock_eg { 
	static {
		System.out.println("block one");
	}
	public static void main(String[] args) {
		System.out.println("main");
	}
	static {
		System.out.println("block two");
	}
}*/
//in two different class////////
class tst{ 
	static {
		System.out.println("block one");
	}
	static {
		System.out.println("block two");
	}
}
public class staticblock_eg { 

public static void main(String[] args) {
	tst t =new tst();
	System.out.println("main");
}

}