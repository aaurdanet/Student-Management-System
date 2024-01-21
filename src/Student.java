import javax.swing.JOptionPane;

public class Student {
	private Name name;
	private double gpa;
	private int credit;
	private Date date; // Public

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Student() {
		getAStudent();
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		boolean invalid = true;
		do {
			if (gpa < 0 || gpa > 5.0) { // Rerun if GPA is incorrect
				String mess = "Gpa must between 0 and 5.0, Please reenter your GPA: ";
				String prompt = "type Something";
				mess = JOptionPane.showInputDialog(mess, prompt);
				gpa = Double.parseDouble(mess);
				invalid = true;
			} else
				invalid = false;
		} while (invalid);
		this.gpa = gpa;

	}

	public String toString() {
		String result = name.toString() + "\n";
		result += "GPA: " + gpa + "\n";
		result += "Number of Credits: " + credit + "\n";
		result += "Students Date of Birth is :  " + date.toString() + "\n";
		result += "------------------------";
		return result;
	}

	public void getAStudent() {
		name = new Name();
		date = new Date();

		String mess = "What is your GPA: ";
		String prompt = "type Something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		double value = Double.parseDouble(mess);
		setGpa(value);
		
		mess = "How many credits are you taking: ";
		prompt = "type Something";
		mess = JOptionPane.showInputDialog(mess, prompt);
		credit = Integer.parseInt(mess);
		setCredit(credit);

	}

	public int getCredit() {
		return credit;
	}

	public void setCredit(int credit) {
		boolean invalid = true;
		do {
			if (credit < 0 || credit > 200) { // Re run of credits are incorrect
				String mess = "credit must between 0 and 200, Please reenter your Credit: ";
				String prompt = "type Something";
				mess = JOptionPane.showInputDialog(mess, prompt);
				credit = Integer.parseInt(mess);
				invalid = true;
			} else
				invalid = false;
		} while (invalid);
		this.credit = credit;

	}

}

