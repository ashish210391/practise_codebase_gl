package test;

public class SingletonPattern {

	
	private static String str = null;
	
	
	private SingletonPattern() {
		
	}
	
	private static String getInstance() {
		if(str == null) {
			synchronized (SingletonPattern.class) {
				if(str == null) {
					str = new String();
				}
			}
		}
		return str;
		
		
		
	}
	
	private static SingletonPattern getInstanceNew() {
		return MySingleton.INSTANCE;
	}
	
	
	private static class  MySingleton{
		private static final SingletonPattern INSTANCE = new SingletonPattern();
		
	}
	
}
