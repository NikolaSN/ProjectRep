import javax.swing.JOptionPane;

public class ValidationClass extends Ascendent{

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	public int day, month, year, hour, minutes, zodiq ;
	public String error, greshki="";
	
	 public String getError() {
	        return error;
	    }

	    public void setError(String error1) {
	        if (!error1.equals(null)) {
	            this.error = error1;
	        }
	    }	
	    
		public int getZodiq() {
	        return zodiq;
	    }

	    public void setZodiq(int zodiq1) {
	        if (zodiq1 < 32 && zodiq1 > 0) {
	            this.zodiq = zodiq1;
	        } 
	    }
	public int getDay() {
        return day;
    }

    public void setDay(int day1) {
        if (day1 < 32 && day1 > 0) {
            this.day = day1;
        } else {
            JOptionPane.showMessageDialog(null, "Vuvedete nanovo");
        }
    }
    public int getMonth() {
        return month;
    }

    public void setMonth(int month1) {
        if (month1 < 13 && month1 > 0) {
            this.month = month1;
        } else {
        	JOptionPane.showMessageDialog(null, "Vuvedete nanovo");
        }
        }
    public int getYear() {
        return year;
    }

    public void setYear(int year1) {
        if (year1 < 1859 && year1 > 2100) {
            this.year = year1;
        } else {
        	JOptionPane.showMessageDialog(null, "Vuvedete nanovo");
        }
    }    
    public int getHour() {
        return hour;
    }

    public void setHour(int hour1) {
        if (hour1 < 25) {
            this.hour = hour1;
        } else {
        	JOptionPane.showMessageDialog(null, "Vuvedete nanovo");
        }
    }   
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes1) {
        if (minutes1 < 60) {
            this.minutes = minutes1;
        } else {
        	JOptionPane.showMessageDialog(null, "Vuvedete nanovo");
        }
    }   

    public ValidationClass(int day, int month, int year, int hour, int minutes) {
    	setDay(day);
    	setMonth(month);
    	setYear(year);
    	setHour(hour);
    	setMinutes(minutes);
        }

    public void Zodiq() {
		//1-oven; 2- telec; 3-bliznaci; 4-rak; 5-luv; 6-deva; 7-vezni; 8-skorpion; 9- strelec; 10-kozirog; 11-vodolei; 12-ribi;
	
    	
		if (month == 3 && day>20 || month == 4 && day <21) {
			greshki += "Vashata zodiq e Oven";
			setError(greshki);
			setZodiq(1);
		}
		if (month == 4 && day>20 || month == 5 && day <22) {
			greshki += "Vashata zodiq e Telec";
			setError(greshki);
			setZodiq(2);
		}
		if (month == 5 && day>21 || month == 6 && day <22) {
			greshki += "Vashata zodiq e Bliznaci";
			setError(greshki);
			setZodiq(3);
		}
		if (month == 6 && day>21 || month == 7 && day <23) {
			greshki += "Vashata zodiq e Rak";
			setError(greshki);
			setZodiq(4);
		}
		if (month == 7 && day>22 || month == 8 && day <24) {
			greshki += "Vashata zodiq e Luv";
			setError(greshki);
			setZodiq(5);
		}
		if (month == 8 && day>23 || month == 9 && day <24) {
			greshki += "Vashata zodiq e Deva";
			setError(greshki);
			setZodiq(6);
		}
		if (month == 9 && day>23 || month == 10 && day <24) {
			greshki += "Vashata zodiq e Vezni";
			setError(greshki);
			setZodiq(7);
			}
		if (month == 10 && day>23 || month == 11 && day <23) {
			greshki += "Vashata zodiq e Skorpion";
			setError(greshki);
			zodiq=8;
			}
		if (month == 11 && day>22 || month == 12 && day <22) {
			greshki += "Vashata zodiq e Strelec";
			setError(greshki);
			zodiq=9;
			}
		if (month == 12 && day>21 || month == 1 && day <21) {
			greshki += "Vashata zodiq e Kozirog";
			setError(greshki);
			zodiq=10;
			}
		if (month == 1 && day>20 || month == 2 && day <20) {
			greshki += "Vashata zodiq e Vodolei";
			setError(greshki);
			zodiq=11;
			}
		if (month == 2 && day>19 || month == 3 && day <21) {
			greshki += "Vashata zodiq e Ribi";
			setError(greshki);
			zodiq=12;
			}
	}


}

