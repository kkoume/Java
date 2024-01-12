package test4;

/*
 * 날짜 : 2024/01/12
 * 이름 : 조영흥
 * 내용 : 자바 문자열 연습문제
 */
public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java";
		
		int idx = fileName.indexOf(".");
		
		String title = fileName.substring(0, idx);
		String ext	 = fileName.substring(idx+1);
		
		System.out.println("파일명 : " + title);
		System.out.println("확장자 : " + ext);
		
		String strScores = "60, 72, 82, 86, 92";
		String[] scores = strScores.split(",");
		
		int total = 0;
		
		for(String score : scores) {
			
			total += Integer.parseInt(score.trim());	// 공백을 없애기 위해서 trim() 추가
			// 문자열을 숫자열로 변환하기 위해서
		}
		
		System.out.println("strScores 총점 : " + total);
	}
}
