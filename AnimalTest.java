
class Animal extends Object {
	
	String name="lilly";
	
	Animal () {
		System.out.println("1 - Animal created: " +this);
	}
	
	void getString () {
		
		//super.getString();
		
		System.out.println("the name is = "  +this.name);
	}

}

class Elephant extends Animal {
	
	String name="Elephant";
	
	Elephant () {
		System.out.println("Elephant created now : " +this);
	}
}

class Wolve extends Animal {
	
	String name="Wolve";
	
	Wolve () {
		System.out.println("2 - Wolve created: " +this);
	}
	
	void getString () {
		
		super.getString();
		
		System.out.println("now the nameof ani is " + this.name);
		
		super.getString();
	}
	
	
}


class Dog extends Wolve {
	
	String name="Dog";
	
	Dog () {
		System.out.println("3 - Dog created: " +this);
	}
	
	void getString () {
		
		super.getString();
		
		System.out.println( this.name);
	}
	
}





///////////////////////////////////////////////////////

class AnimalTest {
	
	public static void main(String [] args) {
		
		
		Dog d = new Dog();
		
		d.getString();
		
	}
	
}
