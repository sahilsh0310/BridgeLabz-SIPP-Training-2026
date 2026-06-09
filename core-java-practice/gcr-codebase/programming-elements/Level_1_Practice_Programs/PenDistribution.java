package Level_1_Practice_Programs;

public class PenDistribution {
    public static void main(String[] args) {
        int TotalPens = 14;
        int TotalStudents = 3;
        int numberOfPensEachStudentGets = TotalPens / TotalStudents;
        int RemainingPens = TotalPens % TotalStudents;
        System.out.println("The Pen Per Student is " + numberOfPensEachStudentGets + " and the remaining pen not distributed is " + RemainingPens);

    }
}
