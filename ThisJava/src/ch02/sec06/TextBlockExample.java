// 교재 51p

package ch02.sec06;

public class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" +
		"{\n" +							// \n 줄바꿈
		"\t\"id\":\"winter\",\n" +		// \t 탭만큼 띄움, \' \" '"문자 포함
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String str2 = """
		{
			"id":"winter",
			"name":"눈송이"
		}
		""";
		
		System.out.println(str1);
		System.out.println("----------------------------");
		System.out.println(str2);
		System.out.println("----------------------------");
		String str = """
		나는 자바를 \
		학습합니다.
		나는 자바 고수가 될 겁니다.
		""";					// \을 붙이면 줄바꿈을 하지않고 다음 줄에 이어서 작성함
		System.out.println(str);
	}
}
