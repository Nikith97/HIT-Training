package hit.day12;
/*bad - code open for modification, closed for extension - bad brush
 * good - code which is closed for modification, open for extension - good brush
 * Solution to remove if-else-if condition
 * 1. Convert condition into classes
 * 2. Group them under a hierarchy
 * 3. Create an association between the using classes (PaintBrush) and the hierarchial class (Paint
 * OOP Principles used
 * 1. Inheritance 2. Association
 * What we achieved
 * 1. Open Close Principle
 * 2. Object Reusability
 */
public class GoodBrush {
	public static void main(String[] args) {
		GoodPaintBrush brush = new GoodPaintBrush();
		RedPaint rp = new RedPaint();
		BluePaint bp = new BluePaint();
		GreenPaint gp = new GreenPaint();
		brush.rp = rp;
		brush.doPaint();
	}
}

class GoodPaintBrush{//Whenever a new color is added, this paint brush can be modified easily
	Paint rp;
	public void doPaint() {
		System.out.println(rp);
	}
}

class BadPaintBrush{ //Code gets modified whenever a color gets added
	public void doPaint(int choice) {
		if(choice==1)
			System.out.println("Red Color applied...");
		else if(choice==2)
			System.out.println("Blue Color applied...");
		else if(choice==3)
			System.out.println("Green Color applied...");
		else if(choice ==4)
			System.out.println("Pink Color applied...");
	}
}

/*
 * 100%, the parent class should be abstract
 * Abstract class is a special class used to represent the parent class, it is a classifier class
 * Provides an overview of the hierarchy which we create by extending this class
 * You cannot create an object of this class.
 * It is not compulsory to write code in abstract class.
 * 
 */
abstract class Paint{
	
}
class RedPaint extends Paint{
	
}

class BluePaint extends Paint{
	
}

class GreenPaint extends Paint{
	
}

