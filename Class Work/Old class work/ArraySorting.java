public class ArraySorting{

int numbers[] = {7,2,9,3,0};
//sortList(numbers);

for(int indexx = 0; indexx < numbers.length; indexx++){
	System.out.print(indexx);
 }
}



public static void sortList(int sortList[]){

	for(index = 0; index < sortList.length - 1; index++){
		for(int count; count < sortList.length - index - 1; count++){
			if(sortList[count] > sortList[count + index]){
				int temp = sortList[count];
				sortList[count] = sortList[count + index];
				sortList[count + 1] = temp;

}


}
}



}