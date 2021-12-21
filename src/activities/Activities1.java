package activities;

public class Activities1 {
    //Todo: create a main method
    //Todo: convert the following nested if-else statement into a switch statement
    //Todo: call the switch statement inside of

    public String exampleOfIF(String animal) {
        String result;
        if (animal.equals("DOG") || animal.equals("CAT")) {
            result = "domestic animal";
        } else if (animal.equals("TIGER")) {
            result = "wild animal";
        } else {
            result = "unknown animal";
        }
        return result;
    }
}
