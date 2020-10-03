public class Triangle  {

    double firstSide, secondSide, thirdSide;

    public Triangle(Coordinate first, Coordinate second, Coordinate third) {
        double firsSideValueUnderRoot = Math.pow(second.x - first.x, 2) + Math.pow(second.y - first.y, 2);
        firstSide = Math.pow(firsSideValueUnderRoot, 1.0/2.0);
        double secondSideValueUnderRoot = Math.pow(third.x - second.x, 2) + Math.pow(third.y - second.y, 2);
        secondSide = Math.pow(secondSideValueUnderRoot, 1.0/2.0);
        double thirdSideValueUnderRoot = Math.pow(third.x - first.x, 2) + Math.pow(third.y - first.y, 2);
        thirdSide = Math.pow(thirdSideValueUnderRoot, 1.0/2.0);
    }
    public double calculateArea(){
        double p = (firstSide + secondSide + thirdSide) /2;
        double expr = p * (p - firstSide) * (p - secondSide) * (p - thirdSide);
        return Math.pow(expr, 1.0/2.0);
    }
}
