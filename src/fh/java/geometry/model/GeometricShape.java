package fh.java.geometry.model;

public abstract class GeometricShape {
    

    protected int x;        //protected means, that they can be accessed by sub-classes without providing the getters and setters
    protected int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

	public abstract double calcArea();

    public abstract double calcPerimeter();

   // TODO: Implement equals() and hashCode() with CMD+N --> Equals and Hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeometricShape that = (GeometricShape) o;

        if (x != that.x) return false;
        return y == that.y;

    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }
}
