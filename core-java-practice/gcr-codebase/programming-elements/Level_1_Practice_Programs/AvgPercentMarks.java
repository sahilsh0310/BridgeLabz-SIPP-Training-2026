package Level_1_Practice_Programs;

public class AvgPercentMarks {
    public static void main(String[] args) {
        int Maths = 94;
        int Physics = 95;
        int Chemistry = 96;
        int TotalMarks = Maths + Physics + Chemistry;
        float Percentage = (TotalMarks / 300.0f) * 100;
        System.out.println("Sam’s average mark in PCM is " + Percentage + "%");
    }
}
