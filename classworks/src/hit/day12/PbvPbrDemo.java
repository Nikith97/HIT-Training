package hit.day12;

public class PbvPbrDemo {
	public static void main(String[] args) {
		Laddu laddu = new Laddu();
		laddu.setSize(10);
		System.out.println("Initial size of Laddu..." + laddu.getSize());
		
		PBV pbvObj = new PBV();
		pbvObj.modifySizeOfLaddu(laddu.size);
		
		System.out.println("Size of laddu after PBV is...." + laddu.getSize());
		
		PBR pbrObj = new PBR();
		pbrObj.modifySizeOfLaddu(laddu);
		
		System.out.println("Size of laddu after PBR is...." + laddu.getSize());
	}
}

class PBV{
	public void modifySizeOfLaddu(int size) {
		size = size-5;
	}
}


class PBR{
	public void modifySizeOfLaddu(Laddu laddu) {
		laddu.setSize(5);
	}
}

class Laddu{
	int size;
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return this.size;
	}
}
