import java.util.Scanner;
public class RectangleArea {
    double length, width;
    //Getting data from the user
      void getData(){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the width");
         width = sc.nextDouble();
         System.out.print("Enter the length" );
         length = sc.nextDouble();
     }
     double computeField(){
         return width * length;
     }

    void fieldDisplay(){
        System.out.println("The length is :" + length);
        System.out.println("and the breath is:" + width );
        System.out.println("The area of the Rectangle is :" + computeField());
    }

    static void displayField(){
        RectangleArea area = new RectangleArea();
        area.getData();
        area.computeField();
        area.fieldDisplay();
    }

    public class Main {

        public static void main(String[] args) {

            RectangleArea.displayField();
        }

   }
}