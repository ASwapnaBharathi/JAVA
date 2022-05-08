// break in nested for loop

class Nested3{
public static void main(String args[]){
	int weeks = 7;
	int days = 7;
	for(int i=1;i<=weeks;i++){
		
if(i==3){
	break;
}
System.out.println("week:"+i);
	for(int j=1;j<=days;j++){
	
	System.out.println("Day:"+j);
}
}
}
}