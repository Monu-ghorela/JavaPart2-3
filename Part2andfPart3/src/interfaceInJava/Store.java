package interfaceInJava;

public interface Store {
//	abstract int uelLevel();
	default void m2() {
		System.out.println("m2 method of store is calles");
	}
}
