package hit.day14;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		ATM atmUser = new ATM();
		try {
		atmUser.insertCard("invalid");
		}
		catch(InvalidCardException ice) {
			System.out.println(ice);
			System.out.println("Action for invalid card exception is called....");
		}
		
		System.out.println("Final action called....");
	}
}

class ATM{
	public void insertCard(String cardValidity) throws InvalidCardException{ //When capable, we should add throws "name of exception"
		// TODO Auto-generated method stub
		if(cardValidity.equals("valid")) {
			System.out.println("The card is processed...");
		}
			else {
					throw new InvalidCardException("You have inserted an invalid card...");// Capable of throwing new exception
		}

	}
}