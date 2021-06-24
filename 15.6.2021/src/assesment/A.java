package assesment;

class A extends Alpahabate implements Task{

	A(int sno, String type) {
		super(sno, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	void m() {
		// TODO Auto-generated method stub
		System.out.println(sno);
	}

	@Override
	void n() {
		// TODO Auto-generated method stub
		System.out.println(type);
	}



	public void activity() {
		
		// TODO Auto-generated method stub
		System.out.println("class a");
	}
	
}