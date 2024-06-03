package WroghWork;

import WroghWork.Outer.InnerClass;

public class TrialClasses {
public static void main(String[] args) {
	Outer outer = new Outer();
	InnerClass innerClass = outer.new InnerClass();
	innerClass.m1();
}
}
