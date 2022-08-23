import java.util.*;

public class ReverseString{
public static void main(String[] args){
	String s1 = "Hello SahibSingh";
	reverse(s1);
}

public static void reverse(String str){
	char[] inputStr = str.toCharArray();
	char[] revStr= new char[inputStr.length];

	//Fixing Space in Reversed String
	for(int i=0; i<inputStr.length;i++){
		if(inputStr[i]==' '){
			revStr[i]=' ';
}
}
	int j = inputStr.length - 1; //Get Last Index so as to insert elements in reversed String from the end
	
	for(int i=0; i<inputStr.length;i++){
		//Skip Blank Spaces of Orignal String
		if(inputStr[i]!=' '){
			if(revStr[j]==' '){
			//Skip inserting element at j position of Reversed String
			//when a space is encountered at j'th place of Reversed String
			 j--;
			}
			revStr[j] = inputStr[i]; 
			j--;
}
}
	System.out.print(String.valueOf(revStr));
}


}
