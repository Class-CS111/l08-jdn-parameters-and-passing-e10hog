// PARTNER NAME: 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE:

public class Main 
{
  public static void main(String[] args) 
	{

		/***** DECLARATION SECTION *****/
		int todayDateDay, todayDateMonth, todayDateYear, dateDay, dateMonth, dateYear;
		double JDNToday, JDNDate;
		double calculatedAge;

		/***** INITIALIZATION SECTION *****/

		todayDateDay = 3;
		todayDateMonth = 1;
		todayDateYear = 2025;

        // DATE ONE
		dateDay = 26;
		dateMonth = 8; 
		dateYear = 1918;

        // DATE TWO
        //dateDay = 2;
		//dateMonth = 12; 
		//dateYear = 2006;

        // DATE THREE
        //dateDay = 13;
		//dateMonth = 6; 
		//dateYear = 2005;

		
		/***** INPUT SECTION *****/
		// N/A (no input for this lab)
		
		/***** CALCULATION & PROCESSING SECTION *****/

		JDNToday = calcJulianDate(todayDateMonth, todayDateDay, todayDateYear);
		JDNDate = calcJulianDate(dateMonth, dateDay, dateYear);
		//calculatedAge = (JDNToday - JDNDate) / 365;
		
		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + todayDateMonth + "/" + todayDateDay + "/" + todayDateYear + ", is " + (int) JDNToday);
		System.out.println("Julian Day Number for this date, " + dateMonth + "/" + dateDay + "/" + dateYear + ", is " + (int) JDNDate);
		//System.out.println("The differences in days is " + (int) (JDNToday - JDNDate) + " which makes you approximately " + (int) calculatedAge + " years old!");
  }

  /** 
   * calculates the Julian Date Number
   * @param month month of the date (1-12)
   * @param day day of the date (1-31)
   * @param year year of the date (4 digit number)
   * @return returns Julian Date number
   * **/

  public static double calcJulianDate(int month, int day, int year) {
    double a = (14 - month) / 12;
    double m = month + (12 * a) - 3;
    double y = year + 4800 - a;
    return (day + ((153*m + 2)/5) + (365 * y) + (y / 4) - (y / 100) + (y / 400) - 32045); 
  }

}