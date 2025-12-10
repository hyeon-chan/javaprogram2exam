package week11;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ex09 {
    // 키보드로 0~100점 사이의 정수형 점수를 입력받아 해당 점수의 학점이 출력되도록 프로그램 작성
    // 예외처리 포함
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("0~100사이의 정수형 점수를 입력하세요: ");
        int x = scanner.nextInt();
        
        if (x < 0 || x > 100) {
            System.out.println("점수는 0에서 100 사이의 숫자를 입력하세요.");
        }
        
        char grade;
        if (x >= 90) grade = 'A';
        else if (x >= 80) grade = 'B';
        else if (x >= 70) grade = 'C';
        else if (x >= 60) grade = 'D';
        else grade = 'F';
        
        System.out.println("학점 : " + grade);
        
        } catch (InputMismatchException e) {
        	System.out.println("잘못된 입력입니다. ");
        } catch( Exception e) {
        	System.out.println("실행중 오류 발생");
        } finally {
        	scanner.close();
        	System.out.println("실행 종료 ");
        }
    }
}
