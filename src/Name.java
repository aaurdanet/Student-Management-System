import javax.swing.JOptionPane;

public class Name {
	private String fName;
	private String lName;
	private String mInitial;
	
	public Name() {
		getName();
	}

	public Name(String fName, String lName, String mInitial) {
		setfName(fName);
		setlName(lName);
		setmInitial(mInitial);
	}

	public void getName() {
		String mess = "What is your first name: ";
		String prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setfName(mess);

		mess = "What is middle initial: ";
		prompt = "Please Type";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setmInitial(mess);

		mess = "What is your last name: ";
		mess = JOptionPane.showInputDialog(mess, prompt);
		setlName(mess);
	}

	public String getfName() {
		String firstLetter = fName.substring(0, 1).toUpperCase();
		String restLetters = fName.substring(1).toLowerCase();
		return firstLetter + restLetters;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		String firstLetter = lName.substring(0, 1).toUpperCase();
		String restLetters = lName.substring(1).toLowerCase();
		return firstLetter + restLetters;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String toString() {
		return getfName() + " " + getmInitial() + " " + getlName();
	}

	public String getmInitial() {
		return mInitial.toUpperCase().charAt(0) + ".";
	}

	public void setmInitial(String mInitial) {
		this.mInitial = mInitial;
	}

}
