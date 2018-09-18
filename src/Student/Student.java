package Student;
public class Student {
	private 
	String name,id,group,email;
	public String getName(){
		return this.name;
	}
	public String getId(){
		return this.id;
	}
	public String getGroup(){
		return this.group;
	}
	public String getEmail(){
		return this.email;
	}
	public void setName(String name){              
		this.name=name;
	}
	public void setId(String id){
		this.id=id;
	}
	public void setGroup(String group){
		this.group=group;
	}
	public void setemail(String email){
		this.email=email;
	}
	public Student(String name, String id, String email){
		this.name=name;
		this.id=id;
		this.group="INT22041";
		this.email=email;
	}
	public void getInfo()
	{
		System.out.println(this.getName() + "    " + this.getId() + "    " + this.getGroup() + "    " + this.getEmail());
	}
	public Student(){
        this.name="Student";
        this.id ="000";
        this.group ="INT22041";
        this.email ="uet@vnu.edu.vn";
    }
	public Student(Student s){
   	    this. name = s.name;
        this.id = s.id;
        this.email = s.email;
        this.group =s.group;
	}
}

