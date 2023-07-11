package hw1;

public class Student {
    public String name;
    public int midtermScore;
    public int finalScore;
    public double averageScore;
    public String letterGrade;

    public double getAverageScore() {
        averageScore = finalScore * 0.6 + midtermScore * 0.4;
        return averageScore;
    }

    public String getLetterGrade() {
        if (averageScore > 90) {
            letterGrade = "AA";
        }
        else if(averageScore >= 80) {
            letterGrade = "BA";
        }
        else if(averageScore >= 70) {
            letterGrade = "BB";
        }
        else if(averageScore >= 60) {
            letterGrade = "CB";
        }
        else if(averageScore >= 50) {
            letterGrade = "CC";
        }
        else if(averageScore >= 40) {
            letterGrade = "DC";
        }
        else if(averageScore >= 30) {
            letterGrade = "DD";
        }
        else {
            letterGrade = "FF";
        }
        return letterGrade;
    }
}
