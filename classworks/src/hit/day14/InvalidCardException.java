package hit.day14;

public class InvalidCardException extends Exception {//Exception is created....
	String msg;
	public InvalidCardException(String msg) {
		this.msg = msg;// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Exception is.." + msg;
	}
}
