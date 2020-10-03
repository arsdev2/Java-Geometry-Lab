import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FigureParser {
    ArrayList<Coordinate> coordinates = new ArrayList<>();
    public static void main(String[] args) {
        FigureParser parser = new FigureParser();
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите количество углов");
            int countOfAngles = Integer.parseInt(r.readLine());
            if (countOfAngles < 4){
                return;
            }
            ArrayList<Triangle> triangles = new ArrayList<>();
            int countOfLines = countOfAngles - 3;
            for(int i = 0;i<countOfAngles;i++){
                System.out.println("Введите x и y через пробел");
                String input = r.readLine();
                int x = Integer.parseInt(input.split(" ")[0]), y = Integer.parseInt(input.split(" ")[1]);
                Coordinate coordinate = new Coordinate(x, y);
                parser.coordinates.add(coordinate);
            }
            for(int i = 0;i<countOfLines;i++) {
                Triangle triangle = new Triangle(parser.coordinates.get(0), parser.coordinates.get(i+1), parser.coordinates.get(i+2));
                triangles.add(triangle);
                System.out.println(parser.coordinates.get(0) + "_" + parser.coordinates.get(i+2));
            }
            Triangle lastTriangle = new Triangle(parser.coordinates.get(0), parser.coordinates.get(parser.coordinates.size() - 2), parser.coordinates.get(parser.coordinates.size() - 1) );
            triangles.add(lastTriangle);
            double areaSum = 0.0;
            for(Triangle triangle : triangles){
                areaSum += triangle.calculateArea();
            }
            System.out.println("Результат - " + areaSum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
