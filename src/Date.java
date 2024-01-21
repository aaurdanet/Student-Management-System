import javax.swing.JOptionPane;

public class Date {
	public int day;
	public int month;
	public int year;

	public Date() {
		getDate();
	}

	public Date(int day, int year, int month) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	private void getDate() {
		boolean valid = false;

		do {

			String mess = "What year were you born ";
			String prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			year = Integer.parseInt(mess);

			mess = "What month were you born ";
			prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			month = Integer.parseInt(mess);

			mess = "What day were you born ";
			prompt = "type Something";
			mess = JOptionPane.showInputDialog(mess, prompt);
			day = Integer.parseInt(mess);

// DATE VALIDATOR 
			if (day >= 1) {
				// For months with 30 days.
				if ((month == 4 || month == 6 || month == 9 || month == 11) && day <= 30) {
					valid = true;
				}
				// For months with 31 days.
				if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
						&& day <= 31) {
					valid = true;
				}
				// For February.
				if (month == 2) {
					if (day <= 28) {
						valid = true;
					} else if (day == 29) {
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { // Leap year
							valid = true;
						}
					}
				}
			} // else date is not valid

			if (valid == false) { // Error message if invalid DOB
				JOptionPane.showMessageDialog(null, "Invalid Input\nPlease Try Again", "Cannot Cancel",
						JOptionPane.ERROR_MESSAGE);
			} else {
				continue;

			}

		} while (valid == false);
		setYear(year);
		setMonth(month);
		setDay(day);

	}// end of getDate()

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int months) {

		this.month = months;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return getDay() + "/" + getMonth() + "/" + getDay();
	}

}
