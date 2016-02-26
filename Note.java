public class Note implements java.io.Serializable{
	public String user;
	public String info;
	
	Note(){
		user = "Unspecified";
		info = "Nil";		
	}
	
	Note(String argU, String argD){
		user = argU;
		info = argD;		
	}
}