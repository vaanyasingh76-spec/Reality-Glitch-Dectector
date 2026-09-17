import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static void saveReport(ArrayList<Glitch> glitches) {

        try {

            // Create data folder if it does not exist
            File folder = new File("../data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            // Create the report file
            FileWriter writer =
                new FileWriter("../data/report.txt");

            writer.write("REALITY GLITCH DETECTOR REPORT\n");
            writer.write("================================\n\n");

            if (glitches.size() == 0) {

                writer.write("No reality glitches detected.\n");

            } else {

                for (Glitch glitch : glitches) {

                    writer.write(
                        "Glitch Type: " +
                        glitch.getType() + "\n"
                    );

                    writer.write(
                        "Message: " +
                        glitch.getMessage() + "\n"
                    );

                    writer.write(
                        "Severity: " +
                        glitch.getSeverity() + "\n"
                    );

                    writer.write(
                        "--------------------------------\n"
                    );
                }
            }

            writer.close();

            System.out.println(
                "\nReport saved successfully!"
            );

            System.out.println(
                "Location: data/report.txt"
            );

        } catch (IOException e) {

            System.out.println(
                "Error while saving report."
            );
        }
    }
}
