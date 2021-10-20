package design.adapter;

import design.adapter.extra.GeometricShape;
import design.adapter.extra.Rhombus;
import design.adapter.extra.Triangle;

public class GeometricShapeObjectAdapter implements Shape {

	private GeometricShape adaptee;

    public GeometricShapeObjectAdapter(GeometricShape adaptee) {
          super();
          this.adaptee = adaptee;
    }
    
	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(description() + " can't be resized. Please create new one with required values.");
	}

	@Override
	public String description() {
		if (adaptee instanceof Triangle) {
            return "Triangle object";
            } else if (adaptee instanceof Rhombus) {
            return "Rhombus object";
            } else {
            return "Unknown object";
            }
	}

	@Override
	public boolean isHide() {
		// TODO Auto-generated method stub
		return false;
	}

}
