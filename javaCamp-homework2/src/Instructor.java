
public class Instructor extends User {
	private int instructorId;
	private int[] teachingBrancheIds;
	
    public Instructor() {
    	super();
    }
 
	
	public Instructor(int id,int instructorId, int[] teachingBrancheIds, String firstName, String lastName, String email, String password) {
		super(id, firstName, lastName, email, password);
		this.instructorId = instructorId;
		this.teachingBrancheIds = teachingBrancheIds;


	}


	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public int[] getTeachingBrancheIds() {
		return teachingBrancheIds;
	}
	public void setTeachingBrancheIds(int[] teachingBrancheIds) {
		this.teachingBrancheIds = teachingBrancheIds;
	}
}
