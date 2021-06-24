package assesment;

class B extends Alpahabate implements Task{

	
	B(int sno, String type) {
		super(sno, type);
		// TODO Auto-generated constructor stub
	}

	public void activity() {
		// TODO Auto-generated method stub
		System.out.println("class b");
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
}
	