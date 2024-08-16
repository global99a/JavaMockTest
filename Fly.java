
public class Fly {

	public static void main(String[] args) {
		//creating objects for each class
		Airplane airplane=new Airplane();
		Helicopter helicopter=new Helicopter();
		Spacecraft space=new Spacecraft();
		
		//calling fly_obj on each object
		airplane.fly_obj();
		helicopter.fly_obj();
		space.fly_obj();

	}

}
