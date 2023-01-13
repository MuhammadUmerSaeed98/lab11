package lab06;


public class genericspractice {
	//non static method
		void showArray(Integer[]s) {
			for(int i=0; i<s.length; i++)
				System.out.println(s[i]);
				
				}
		public static void main(String[]args) {
			genericspractice obj=new genericspractice();
			// string names[]={"ali","ahmed"};
			// obj.showArray(names);
			
			Integer num[]= {1,2,3,4,5,6};
			obj.showArray(num);
			
			/*float c[]={20.4f,32.45f};
			obj.showArray(c); */
			}}
	
