/*
Question 2: Room Painting and Carpeting
*/

import java.util.Scanner;

public class RoomPaintCarpet {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Taking room dimensions
        System.out.print("Enter the length of the room (in feet): ");
        double length = input.nextDouble();

        System.out.print("Enter the width of the room (in feet): ");
        double width = input.nextDouble();

        System.out.print("Enter the height of the room (in feet): ");
        double height = input.nextDouble();

        // Calculate the volume and area of the room
        double volumeRoom = ((length * height) * 2) + ((width * height) * 2);
        double areaRoom = length * width;

        // Taking door dimensions
        System.out.print("Enter the width of the door (in feet): ");
        double widthDoor = input.nextDouble();

        System.out.print("Enter the height of the door (in feet): ");
        double heightDoor = input.nextDouble();

        // Calculate the volume of the door
        double volumeDoor = widthDoor * heightDoor;

        // Taking window dimensions
        System.out.print("Enter the width of the window (in feet): ");
        double widthWindow = input.nextDouble();

        System.out.print("Enter the height of the window (in feet): ");
        double heightWindow = input.nextDouble();

        // Calculate the volume of the window
        double volumeWindow = widthWindow * heightWindow;

        // Taking second window dimensions
        System.out.print("Enter the width of the second window (in feet): ");
        double widthWindow2 = input.nextDouble();

        System.out.print("Enter the height of the second window (in feet): ");
        double heightWindow2 = input.nextDouble();

        // Calculate the volume of the second window
        double volumeWindow2 = widthWindow2 * heightWindow2;

        // Taking bookshelf dimensions
        System.out.print("Enter the width of the bookshelf (in feet): ");
        double widthShelf = input.nextDouble();

        System.out.print("Enter the height of the bookshelf (in feet): ");
        double heightShelf = input.nextDouble();

        // Calculate the volume of the bookshelf
        double volumeShelf = widthShelf * heightShelf;

        // Input the cost of painting walls
        System.out.print("Enter the cost (per square foot) of painting walls: ");
        double costWalls = input.nextDouble();

        // Input the cost of carpeting
        System.out.print("Enter the cost (per square foot) of carpet: ");
        double costCarpet = input.nextDouble();

        // Calculate the cost of paint
        double costPaint = (volumeRoom - (volumeDoor + volumeShelf + volumeWindow + volumeWindow2 + areaRoom)) * costWalls;
        System.out.println("The cost of painting the room would be: $" + costPaint);

        // Calculate the cost of carpet
        double costCarpetRoom = areaRoom * costCarpet;
        System.out.println("The cost of carpeting the room would be: $" + costCarpetRoom);
    }
}
