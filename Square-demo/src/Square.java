public class Square {
    public int size = 0;
    public Square(int size) {
        this.size = size;
    }
    public int getArea() {
        return size*size;
    }
    public int getPerimeter() {
        return 4*size;
    }
}
