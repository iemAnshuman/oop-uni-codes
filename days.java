class Days {
    public static void main(String[] args) {
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);
        
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int totalDays = day - 1;
        
        for (int i = 0; i < month - 1; i++) {
            totalDays += monthDays[i];
        }
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            if (month > 2) {
                totalDays++;
            }
        }
        
        int yearsSince1970 = year - 1970;
        totalDays += yearsSince1970 * 365;
        
        for (int i = 1970; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) {
                totalDays++;
            }
        }
        
        System.out.println(totalDays + " days");
    }
}
