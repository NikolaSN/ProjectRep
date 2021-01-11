
public class ValidationClass extends Ascendent{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	private int day, month, year, hour, minutes ;

    public int getDay() {
        return day;
    }

    public void setDay(int day1) {
        if (day1 < 32 && day1 > 0) {
            this.day = day1;
        } else {
            throw new NumberFormatException();
        }
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month1) {
        if (month1 < 13 && month1 > 0) {
            this.month = month1;
        } else {
            throw new NumberFormatException();
        }
        }
    public int getYear() {
        return year;
    }

    public void setYear(int year1) {
        if (year1 < 1859 && year1 > 2100) {
            this.year = year1;
        } else {
            throw new NumberFormatException();
        }
    }    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour1) {
        if (hour1 < 25) {
            this.hour = hour1;
        } else {
            throw new NumberFormatException();
        }
    }   
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes1) {
        if (minutes1 < 60) {
            this.minutes = minutes1;
        } else {
            throw new NumberFormatException();
        }
    }   

    public ValidationClass(int day, int month, int year, int hour, int minutes) {
    	setDay(day);
    	setMonth(month);
    	setYear(year);
    	setHour(hour);
    	setMinutes(minutes);
        }




}

