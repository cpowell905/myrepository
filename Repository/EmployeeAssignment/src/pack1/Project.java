package pack1;

public class Project {

	private int pid;
	private String projectName;
	private String clientName;

	public Project(int pid, String projectName, String clientName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
		this.clientName = clientName;
	}

	@Override
	public String toString() {
		return "Address [pid=" + pid + ", projecttName=" + projectName + ", clientName=" + clientName + "]";
	}

}