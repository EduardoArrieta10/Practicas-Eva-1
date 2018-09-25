import java.util.Scanner;
//@author EduardoArrieta
public class Eva1_12_Pendiente {
    public static void main(String[] args) {
        System.out.println("Ingresa los valores que se te piden");
        System.out.println("Ubicacion en y del segundo punto");
        Scanner sInput;
        sInput = new Scanner(System.in);
        double y2;
        y2 = sInput.nextDouble();
        System.out.println("ubicacion en y del primer punto");
        double y1;
        y1 = sInput.nextDouble();
        System.out.println("Ubicacion en x del segundo punto");
        double x2;
        x2 = sInput.nextDouble();
        System.out.println("Ubicacion de x del primer punto");
        double x1;
        x1 = sInput.nextDouble();
        double pendiente;
        pendiente = (y2 - y1) / (x2 - x1);
        System.out.println("la pendiente es " + pendiente);
    }
}
