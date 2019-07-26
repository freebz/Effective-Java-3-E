// 코드 23-2 태그 달린 클래스를 클래스 계층구조로 변환

abstract class Figure {
    abstract double area();
}

class Circle extends Figure {
    final double radius;

    Circle(double radius) { this.radius = radius; }

    @Oberride double area() { return Math.PI * (radius * radius); }
}

class Rectangle extends Figure {
    final double length;
    final double width;

    Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
    }

    @Override double area() { return length * width; }
}
