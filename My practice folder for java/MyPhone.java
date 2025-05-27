import java.util.Scanner;
public class MyPhone{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

boolean mENu= true;
  while(mENu){
	System.out.println("""
		NOKIA 3310 MENU
""");
	System.out.print("""
	   Welcome to NOKIA MENU

	1.Phone book
	2.Messages
	3.Chat
	4.Call register
	5.Tones
	6.Settings
	7.Call divert
	8.Games
	9.Calculator
	10.Reminders
	11.Clock
	12.Profile
	13.Sim service
	0. Exit App
""");
	boolean phoneBook = true;
	while(phoneBook){
	int menu = scan.nextInt();
	  switch(menu){
	case 1:
	System.out.print("""
	     Phone book

	1.Search
	2.Service Nos
	3.Add name
	4.Erase
	5.Edit
	6.Assign tone
	7.Send b'card
	8.Options
	9.Speed
	10.Voice tags
	0. Back to menu
""");
	int options = scan.nextInt();
	  switch(options){
	case 8: 
	System.out.print("""
	1. Type of view
	2. Memory status
""");
}
break;

	case 2:
	System.out.print("""
	    Message

	1. Write messages
	2. Inbox 
	3. Outbox
	4. Picture messages
	5. Tempates
	6. Smileys
	7. Message settings
	8. Info service
	9. Voice mailbox number
	10. Service command editor 
""");
	int messageSettings = scan.nextInt();
	  switch(messageSettings){
	case 7: 
	System.out.print("""
	1. Set 
	2. Common
""");	

 	int set = scan.nextInt();
	  switch(set){
	case 1:
	System.out.print("""
		Set

	1. Message centre number
	2. Messages sent as
	3. Message validation
""");
}
	int common = scan.nextInt();
	  switch(common){
	case 2:
	System.out.print("""
		Common

	1. Delivery report
	2. Reply via same center
	3. Character support
""");
}
}
}

	case 0: mENu = false; break;


}
if(menu < 0 || menu > 13){
	System.out.print("invalid number, Enter a valid number: ");
	menu = scan.nextInt();

	}
}
 

}//mENu


}//main close
}//class name closed
