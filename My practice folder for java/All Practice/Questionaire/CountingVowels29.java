import java.util.Scanner;
public class CountingVowels29{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	
	int vowelCounter = 0;

	System.out.print("Enter a word: ");
	String userInput = input.nextLine();

	for(int count = 0; count < userInput.length(); count++){
		char word = userInput.charAt(count);
		if(word == 'a' || word == 'e' || word == 'i' || word == 'o' || word == 'u'){
			vowelCounter++;
		}
	}
	System.out.print(vowelCounter);
}

}