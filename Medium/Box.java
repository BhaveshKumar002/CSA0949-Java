class Box {
    double length, width, height;
    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    public double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Volume of the box: " + box.volume());
    }
}
