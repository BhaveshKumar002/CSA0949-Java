abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double volume() {
        return (4 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cone extends Shape {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return Math.PI * radius * (radius + Math.sqrt(height * height + radius * radius));
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(radius, 2) * height / 3;
    }
}

class Cylinder extends Shape {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

public class AbstractClass  {
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        Cone cone = new Cone(3, 7);
        Cylinder cylinder = new Cylinder(4, 6);

        System.out.println("Sphere Area: " + sphere.area() + ", Volume: " + sphere.volume());
        System.out.println("Cone Area: " + cone.area() + ", Volume: " + cone.volume());
        System.out.println("Cylinder Area: " + cylinder.area() + ", Volume: " + cylinder.volume());
    }
}
