package strings;

public class Myclass {

	public static void main(String[] args) {
		StringBuilder str=new StringBuilder();
		System.out.println("default capacity "+str.capacity()); //default 16
		str.append("haii");
		System.out.println("capacity when appending "+str.capacity());// now 16
		str.append("how are you have nice day");
		System.out.println("capacity further appending "+str.capacity()); //now (16*2)+2=34 i.e (old_capacity*2)+2  

	}

}
