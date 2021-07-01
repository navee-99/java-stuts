
abstract class Shapes{ 
	  protected String name;
	  protected int Daimention;
	  
	  Shapes(){}
	  Shapes(String name,int Daimention)
	  {
		  this.name=name;
		  this.Daimention=Daimention;
	  }
	  
	  public void display(){
	    System.out.println("Name:"+name);
		System.out.println("Daimention:"+Daimention);
	  }
	  abstract public void area();
	  abstract public void perimeter();

	}class Rectangle extends Shapes{
		private int length;
		private int breadth;
		
		Rectangle(){}
		Rectangle(int length,int breadth){
			super("Rectangle",4);
			this.length=length;
			this.breadth=breadth;
		}
		
		public void display(){
			super.display();
			System.out.println("length:"+length);
			System.out.println("Breadth:"+breadth);
		}
		@Override
		public void area() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void perimeter() {
			// TODO Auto-generated method stub
		}
		}class Square extends Shapes{
			private int side;
			
			Square(){}
			Square(int side)
			{
				super("Square",4);
				this.side=side;
			}
			public void display(){
				super.display();
				System.out.println("Side:"+side);
				
			}
			@Override
			public void area() {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void perimeter() {
				// TODO Auto-generated method stub
			}
			}class Traingle extends Shapes{
				private int base;
				private int height;
				
				Traingle(){};
				Traingle(int base,int height)
				{
					super("Traingle",3);
					this.base=base;
					this.height=height;
				}
				public void display(){
					super.display();
					System.out.println("base:"+base);
					System.out.println("height:"+height);
					
				}
				@Override
				public void area() {
					// TODO Auto-generated method stub
					
				}
				@Override
				public void perimeter() {
					// TODO Auto-generated method stub
				}
				}class Circle extends Shapes{
					private int radius;
					
					
					Circle(){};
					Circle(int radius )
					{
						super("Circle",0);
						this.radius=radius;
						
					}
					public void display(){
						super.display();
						System.out.println("Radius:"+radius);
						
						
					}
					@Override
					public void area() {
						// TODO Auto-generated method stub
						System.out.println("area:"+3.14*radius*radius);
					}
					@Override
					public void perimeter() {
						// TODO Auto-generated method stub
						System.out.println("Perimeter:"+2*3.14*radius);
					}
				}
			class Shape{
					
					public static void main(String n[])
					{
						Shapes ref=new Rectangle(34,21);
						ref.display();
						ref.area();
						ref.perimeter();
						
						System.out.println("------------------");
						
						ref=new Square(16);
						ref.display();
						ref.area();
						ref.perimeter();
						System.out.println("-----------------");
						
						
						ref=new Traingle(16,8);
						ref.display();
						ref.area();
						ref.perimeter();
						System.out.println("---------------");
						
						
						ref=new Circle(4);
						ref.display();
						ref.area();
						ref.perimeter();
						System.out.println("----------------");
					}
				}
	
			
