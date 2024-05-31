package exceptions;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileNotFoundException5 {

	static {

		try {
			new FileOutputStream("FiltFoundExcept.txt").close();;
			throw new FileNotFoundException();
		} catch (Exception e) {
			e.getMessage();
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		try {

			a();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("finally block executed");
		}
	}

	public static void a() throws FileNotFoundException {
		System.out.println(new FileOutputStream("FiltFoundExcept.txt"));

	}

}
