import java.util.*;

public class ReverseTheString{
public static void main(String[] args){
		String s1 = "I_LOVE_INDIA";
		reverse(s1);
}
static void reverse(String str){
	char[] revStr = str.toCharArray();
	
	int start =0;
	int end = revStr.length-1;
	while(start<end){
		if(revStr[start]=='_'){ //Ignoring spaces when tackled from front
			start++;
			continue;
		}
	else if(revStr[end]=='_'){	//Ignoring spaces when tackled from end
		end--;
		continue;
		}
	else{
	char temp = revStr[start];
	revStr[start]=revStr[end];
	revStr[end]=temp;
	start++;
	end--;
		}
	}
	System.out.print(String.valueOf(revStr));
	}
}
