package design.adapter;

import design.adapter.extra.Rhombus;
import design.adapter.extra.Triangle;

public class ObjectAdapterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Creating drawing of shapes...");
        Drawing drawing = new Drawing();
        drawing.addShape(new Rectangle());
        drawing.addShape(new Circle());
        drawing.addShape(new GeometricShapeObjectAdapter(new Triangle()));
        drawing.addShape(new GeometricShapeObjectAdapter(new Rhombus()));

        System.out.println("Drawing...");
        drawing.draw();
        System.out.println("Resizing...");
        drawing.resize();
	}

}
