
// while => break
// for => System.exit(0)
public class 제어문_반복제어문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*		i=1		j=1		j=2		j=3
		 * 		i=2		j=1		j=2		j=3
		 * 		i=3		j=1		j=2		j=3 	=> 9
		 */
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println("i="+ i + ", j=" + j);
			}
		}
		
		
		System.out.println("========== break ==========");
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(j==2) {
					break; // 종료
				}
				System.out.println("i="+ i + ", j=" + j);
			}
		}
		
		
		System.out.println("========== continue ==========");
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(j==2) {
					continue; // 해당 조건을 제외하고 다시 처음 조건식으로 이동
				}
				System.out.println("i="+ i + ", j=" + j);
			}
		}
		
		
		System.out.println("========== 이름 있는 break ==========");
		
		aaa:for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(j==2) {
					break aaa; // 1, 2차 for문 모두 종료
				}
				System.out.println("i="+ i + ", j=" + j);
			}
		}
	}

}
