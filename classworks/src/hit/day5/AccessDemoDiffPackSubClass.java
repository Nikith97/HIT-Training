package hit.day5;

import hit.day6.AccessDemo;

public class AccessDemoDiffPackSubClass extends AccessDemo {
	void met() {
		System.out.println(pub);
		System.out.println(pro);
//		System.out.println(nomod);
//		System.out.println(pri);
	}
}

//private is class scope
//nomod is package scope
//protected is relationship(inheritance) scope
//public is global scope
class AccessDemoDiffPackageNonSubClass {
	
	void met() {
		AccessDemo obj=new AccessDemo();
		System.out.println(obj.pub);
//		System.out.println(obj.pro);
//		System.out.println(obj.nomod);
//		System.out.println(obj.pri);
	}
}