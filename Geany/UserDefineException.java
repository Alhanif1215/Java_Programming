public class UserDefineException {
	
	public static void main (String[] args) {
		try{
			throw new Base();
			}
		catch(Base b){
			System.out.println("In base catch");
			}
	}
}

