public class UberAppPrice{

	public static int TestDriller(int copyNumber){
	if (copyNumber >= 1 && copyNumber <= 4){
	copyNumber = copyNumber * 2000;
	}
	else if (copyNumber >= 5 && copyNumber <= 9){
	copyNumber = copyNumber * 1800;
	}
	else if (copyNumber >= 10 && copyNumber <= 29){
	copyNumber = copyNumber * 1600;
	}
	else if (copyNumber >= 30 && copyNumber <= 49){
	copyNumber = copyNumber * 1500;
	}
	else if (copyNumber >= 50 && copyNumber <= 99){
	copyNumber = copyNumber * 1300;
	}
	else if (copyNumber >= 100 && copyNumber <= 199){
	copyNumber = copyNumber * 1200;
	}
	else if (copyNumber >= 200 && copyNumber <= 499){
	copyNumber = copyNumber * 1100;
	}
	else if (copyNumber > 500){
	copyNumber = copyNumber * 1000;
	}
	return copyNumber;
}
}