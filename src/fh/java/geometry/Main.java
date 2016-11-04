package fh.java.geometry;

import fh.java.geometry.model.GeometricShape;
import fh.java.geometry.model.curved.Circle;
import fh.java.geometry.model.quadrilateral.Rectangle;
import fh.java.geometry.model.trilateral.RightTriangle;


import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) { // type p and then CMD+J |

        Main main = new Main();
        main.doIt();

    }

    private void doIt() {

        List<GeometricShape> shapeList = new ArrayList<>(); // <> limit the  input to Geometric Shapes

        fillList(shapeList);
        printList(shapeList);


    }



    public void fillList(List<GeometricShape> shapeList) {
		//TODO: Implement

        shapeList.add(new Circle(1,2,2.0));
        shapeList.add(new Circle(14,2,3.0));
        shapeList.add(new Circle(3,2,1.0));

        shapeList.add(new Rectangle(3,4,10.2, 12.1));
        shapeList.add(new Rectangle(3,1,5.5, 9.3));
        shapeList.add(new Rectangle(6,3,6.7, 9.3));

        shapeList.add(new RightTriangle(4,3,10.2,12.1));

    }


    public void printList(List<GeometricShape> shapeList) {
        System.out.println("------------- for loop ------------");
        for (int pos = 0; pos < shapeList.size(); pos++) {      // type fori and then complete with CMD+J
            System.out.println(shapeList.get(pos));
        }

        System.out.println("------------- for each ------------");
        for (GeometricShape shape : shapeList) {
            System.out.println(shape);
            }

            System.out.println("------------- stream ------------");
            shapeList
                    .stream()
                    .forEach(shape -> System.out.println(shape));

            System.out.println("------------- stream 1 ------------");
            shapeList
                    .stream().forEach(System.out::println);


    }

}
