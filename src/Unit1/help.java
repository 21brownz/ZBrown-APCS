package Unit1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class help {
    public static void main(String[] args) throws IOException {
        String filePath = new File("src/Unit1/junit_parameters.csv").getAbsolutePath();
        BufferedReader csvReader = new BufferedReader(new FileReader(filePath));
        String row;
        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            int rows = data.length/2;
            int columns = 1;
            Object[][] tests = new Object[rows][columns];
            for (int i = 0; i <rows; i++) {
                System.arraycopy(data, (i*columns), tests[i],0, columns);
                System.out.println(tests[0][i] + ", " + tests[1][i]);
            }
        }
    }
}
