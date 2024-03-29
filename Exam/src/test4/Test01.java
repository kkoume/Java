package test4;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 날짜 : 2024/01/12
 * 이름 : 조영흥
 * 내용 : 예외처리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		int answer = (int) (Math.random()*10)+1;
		int input = 0;
		int count = 0;
		
		do {
			count++;
			System.out.println("--------------------");
			System.out.println("answer의 값을 맞춰보세요.");
			System.out.print("1 ~ 10 사이의 값을 입력 : ");
			
			try {
				Scanner sc = new Scanner(System.in);
				input = sc.nextInt();
				
				if(input < 0) {
					throw new Exception("음수는 입력 할 수 없습니다.");	
					//예외이기에 throw로 밑의 catch에 던져서 처리
				}
			} catch (InputMismatchException e) {	
				// input = sc.nextInt() 에서 에러가 나서
				System.out.println("숫자가 아닙니다. 숫자를 입력하세요.");
				continue;
			} catch (Exception e) {
				System.out.println(e.getMessage());	// 어떤 예외인지 확인가능
				continue;
			}
			
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if(answer < input) {
				System.out.println("더 작은 수를 입력하세요.");
			} else {
				System.out.println("answer : "+answer);
				System.out.println("정답입니다.");
				System.out.println("시도 횟수 : "+count+"회");
				break;
			}
		}while(true);
		
		System.out.println("프로그램이 정상 종료 되었습니다.");
	}
}
