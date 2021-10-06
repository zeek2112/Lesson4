import exception.*;
import tools.Converter;

public class Task2 {
    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "2", "3", "3"},
                {"3", "7", "1", "4"},
                {"0", "2", "2", "2"},
                {"1", "2", "7", "4"}
        };
        String[][] wrongSizeMatrix = {
                {"3", "2", "3", "3"},
                {"6", "1"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };
        String[][] wrongChar = {
                {"3", "@", "3", "3"},
                {"6", "1", "6", "3"},
                {"0", "2", "7", "3"},
                {"0", "2", "7", "3"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }


        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}
