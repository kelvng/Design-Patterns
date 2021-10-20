package design.adapter;

public class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle");
	}

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		System.out.println("Resizing Circle");
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Circle object";
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}

}
