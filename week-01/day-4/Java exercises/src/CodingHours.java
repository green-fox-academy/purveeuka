public class CodingHours {
    public static void main(String[] args) {
        int CodingHours = 6;
        int semesterWeeks = 17;
        int WorkDays = semesterWeeks * 5; // 17 * 5 = 85

        int codingHoursPerSemester = CodingHours * WorkDays; // 6 * 85 = 510

        System.out.println(codingHoursPerSemester); // prints 510

        int averageWorkHours = 52;
        int totalWorkingHours = semesterWeeks * averageWorkHours; // 17 * 52 = 884
        double percentageOfCodingHours = ((double) codingHoursPerSemester / totalWorkingHours) * 100;
        // 510 / 884 * 100 = 57.692307692307686

        System.out.println(percentageOfCodingHours + "%");
    }
}
