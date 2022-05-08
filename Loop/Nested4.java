// continue in nested for loop

class Nested4{
public static void main(String args[]){
	int week = 3;
	int days = 7;
for(int i=0;i<=week;i++){
	System.out.println("Week:"+i);
for(int j=1;j<=days;j++){
if(j%2==0){
continue;
}
System.out.println("Day:"+j);
}
}
}
}