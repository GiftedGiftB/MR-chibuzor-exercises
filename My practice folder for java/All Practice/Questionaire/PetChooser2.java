import java.util.Scanner;
public class PetChooser2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a pet name dog or cat: ");
	String name = input.nextLine();

	if(name.equals("dog")){
	System.out.print("Woof! Dogs are awesome!");
	} else {
	System.out.print("cool choice,but i love dogs!");
	}

}

}