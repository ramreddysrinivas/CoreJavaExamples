package polymorphism.classinterfaceinheritance;

public class SubClass extends  SuperClass implements  SuperInterface{
// method m() is present in interface I so class C should override this.
	//but C is extending B and B has method m()  so it will be inherited to class C.
	//overriding m() in class C is optional.
}
