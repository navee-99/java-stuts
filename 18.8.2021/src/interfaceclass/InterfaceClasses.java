package interfaceclass;
interface Drawable{  
void draw();  
}  
//Implementation: by second user  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Circle implements Drawable{  
public void draw(){System.out.println("drawing circle");}  
}  
//Using interface: by third user  





public class InterfaceClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Drawable name = new Rectangle();
 name.draw();
 Drawable draw = new Circle();
 draw.draw();
	}

}
