import java.util.Scanner;

public class assess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double attendance;
        System.out.println("Điểm chuyên cần: ");
        attendance = scanner.nextDouble();
        double test_scores;
        System.out.println("Điểm kiểm tra: ");
        test_scores = scanner.nextDouble();
        double semester_exam_scores;
        System.out.println("Điểm thi học kỳ: ");
        semester_exam_scores = scanner.nextDouble();
        double scores;
        scores = (attendance+test_scores+semester_exam_scores)/3;
        char rank=0;
        if(scores>=8.5 && scores<=10) {
            rank='A';
        } else if(scores>=7) {
            rank='B';
        } else if (scores>=5.5) {
            rank='C';
        } else if (scores>=4) {
            rank='D';
        } else if (scores>=0) {
            rank='F';
        }
        System.out.println("Điểm trung bình: " + scores);
        System.out.println("Xếp loại: " + rank);
        if(scores<0) {
            System.out.println("Không hợp lệ");        }
    }
}
