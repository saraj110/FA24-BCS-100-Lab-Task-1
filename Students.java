public class Students{

    private  double cgpa;
    private String name;
    private String address;
    private int phoneNo;
    private String rollNo;
    private static  int counter=0;


   public Students(String name,String address, double cgpa,int phoneNo){

        this.name=name;
  	this.address=address;
	this.cgpa=cgpa;
	this.phoneNo=phoneNo;
        rollNo=String.format("FA24-BCS-%03d",counter++);

	}
  public void display(){
	

        System.out.println("Name:"+name);
        System.out.println("RollNo:"+rollNo);
	System.out.println("Address:"+address);
        System.out.println("Cgpa:"+cgpa);
 	System.out.println("Phone No:"+phoneNo);
	}


	public static void main( String args[]){

		Students s1=new Students(" Yamal","Lahore",3.5,0275362223);
                Students s2=new Students(" Ellie","Lahore",3.8,367377262);
                s1.display();
		s2.display();
	}
}