package basic;

public class ArraysExamples {

	public static void main(String[] args) {
		
		int [] x = new int  [5];
	x [0] =10;
	x [1] =20;
	x [2] =30;
	x [3] =40;
	x [4] =50;
	System.out.println("index o "+ x[0]);
	System.out.println("index 1 "+x[1]);
	System.out.println("index 2 "+x[2]);
	System.out.println("index 3 "+x[3]);
	System.out.println("index 4 "+x[4]);
	// to create an arrays
	//Data-type [] name-of-arrays = new data-- type [size];
	
	// to refer to an index 
	// name - of - array [index - number]
	 
	
	
	String [] Firstname = new String [5];
	Firstname [0]= "David";
	Firstname [1]= "jack";
	Firstname [2]= "Anna";
	Firstname [3]= "Omid";
	Firstname [4]= "Hamid";
	System.out.println("The name is"  +  Firstname [0]);
	System.out.println("The name is"  +  Firstname [1]);
	System.out.println("The name is"  +  Firstname [2]);
	System.out.println("The name is"  +  Firstname [3]);
	System.out.println("The name is"  +  Firstname [4]);
	
	
    // create an array ob booleans with size of 7
    // name of the array is temp
    // then print the name of the array
    // the print all of the indexes of the array
    // then assign these values to the array
    // 0 true 
    // 1 false
    // 2 true 
    // 3 false
    // 4 true 
    // 5 false
    // 6 false
    // print all of the values of the array again
	
	boolean [] temp = new boolean [7];
	System.out.println(temp);
	System.out.println("Before assigning");
	System.out.println(temp [0]);
	System.out.println(temp[1]);
	System.out.println(temp[2]);
	System.out.println(temp[3]);
	System.out.println(temp[4]);
	System.out.println(temp[5]);
	System.out.println(temp[6]);
	
	
	temp [0] = true ;
	temp [1] = false ;
	temp [2] =  true ;
	temp [3] = false ;
	temp [4] = true ;
	temp [5] = false ;
	temp [6] = false ;
	System.out.println("After assigning");
	System.out.println(temp[0]);
	System.out.println(temp[1]);
	System.out.println(temp[2]);
	System.out.println(temp[3]);
	System.out.println(temp[4]);
	System.out.println(temp[5]);
	System.out.println(temp[6]);
	
int[] num = {10,1,5,2,4,8,1,5};
System.out.println("length" +num.length);
// is length of array a method/function ? no length
// when it does not have a () , its a varible
// arrays do not have methods
String str = "this is a test";
System.out.println("length" + str.length());
// is length  of String a method/ function? yes Length ()
// when it has () its a method
System.out.println(num [0]);
System.out.println(num [1]);
System.out.println(num [2]);
System.out.println(num [3]);
System.out.println(num [4]);
System.out.println(num [5]);
System.out.println(num [6]);
System.out.println(num [7]);
System.out.println("********************* going through the array with a loop");
int index = 0;
while (index < num.length);{
System.out.println(num [index++]);
}


int [] tempNums = {15,854,1,5,152,85,41,51,5,48,15,15,4,81,524,8,452,5,48,4,51,85,85};
System.out.println("length of the array is" + tempNums.length);
System.out.println(tempNums[1]);
int index3 = 0 ;
while (index3 < 23) {
	//System.out.println("Index3" + index3 + "=>"+ tempNums [index3]);
	System.out.print(tempNums[index3]+ ",");
	index3++;
	}



	}

}
