package WrapperClasses;

public class CharacterWrapperClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch='a';
		Character character=new Character(ch);//boxing
		character=character;//autoboxing
		
		ch=character.charValue();//unboxing
		ch=character;//autounboxing
		
		System.out.println(ch);
		System.out.println(character);
		
		//there is no method to parse the character
		
		
		
	}

}
