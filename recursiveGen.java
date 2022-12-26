//Recursive password generating algorithm

public class recursiveGen{
    //hint: don't forget to escape the quote character
    static char[] reference = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's','t', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '[', '{', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '<', '>', '?', ':', '\"', '.', '}', '|', ']'};
    
    public static void main (String []args){
        //call the recursive loop (initialize with an empty password string, 0 for position, and 6 for password size)
        passwordBuilder("", 0, 6);
    }

    static void passwordBuilder(String password, int position, int size) {
        if (position < size) {
            //iterate through all of the possible characters in "reference"
            for (char ch : reference) {
                passwordBuilder(password + ch, position + 1, size);
            }
        }
        //print the password once the built password string contains "size" characters
        else {
            System.out.println(password);
        }
    }
}