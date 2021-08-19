package corejava.interfacedemo;

@FunctionalInterface
public interface ValidFunctionalInterface {

	public void display();
	
	@Override
	boolean equals(Object obj);
	@Override
	int hashCode();
	
	@Override
	String toString();
	
	
}
