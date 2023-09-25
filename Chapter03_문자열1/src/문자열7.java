


import java.util.Scanner;
public class 문자열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
				"Java와 JSP",
				"Java와 Oracle",
				"Oracle Programming",
				"JQuery AND AJAX",
				"Spring AND Java"
		};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("검색어 입력 : ");
		String findData=scan.nextLine(); // nextLine() : 공백(띄어쓰기)을 포함하여 문자열을 가져옴
		System.out.println(findData);
		
		for(int i=0; i<data.length; i++) {
			if(data[i].startsWith(findData)) { // 입력한 문자로 시작하는 문자열
				try {
					Thread.sleep(500); // 일정 시간 후 출력
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
			
			if(data[i].endsWith(findData)) { // 입력한 문자로 끝나는 문자열
				try {
					Thread.sleep(500);
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
			
			if(data[i].contains(findData)) { // 입력한 문자를 포함하는 문자열
				try {
					Thread.sleep(500);
				}catch(Exception ex) {}
				System.out.println(data[i]);
			}
		}
	}

}
