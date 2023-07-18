/*
Activity 4: Fixing and Showing the Outputs of Degrees and Radians
*/

public class FixDataTypes3 {
    public static void main(String[] args) {
        // Define the header labels
        String s1 = "Degrees";
        String s2 = "Radians";
        String s3 = "Sine";
        String s4 = "Cosine";
        String s5 = "Tangent";

        // Define the values for the first row of the table
        int degrees = 30;
        double radians = Math.toRadians(degrees);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        // Display the header of the table using System.out.printf()
        System.out.printf("%-1s %-1s %-1s %9s %8s\n", s1, s2, s3, s4, s5);

        // Display the data of the table for the first row using System.out.printf()
        System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f\n", degrees, radians, sin, cos, tan);

        // Define the values for the second row of the table
        degrees = 60;
        radians = Math.toRadians(degrees);
        sin = Math.sin(radians);
        cos = Math.cos(radians);
        tan = Math.tan(radians);

        // Display the data of the table for the second row using System.out.printf()
        System.out.printf("%-7d %-7.4f %-7.4f %-7.4f %-7.4f\n", degrees, radians, sin, cos, tan);
    }
}
