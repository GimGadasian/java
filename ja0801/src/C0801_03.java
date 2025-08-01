
public class C0801_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// hash code():  데이터 수정 여부 체크용, 암호화 요
		String str1 = "오늘(31일) 오전 8시 쯤 음성군 삼성면의 한 물류창고에서 50대 노동자 A씨가 작업중 추락해 숨져 노동당국이 조사에 착수했습니다.\r\n"
				+ "\r\n"
				+ "A씨는 샌드위치 패널로 된 창고 지붕 위에서 조명 설치 작업을 하는 과정에서 패널 일부가 무너져 5m 아래로 떨어진 것으로 확인됐습니다.\r\n"
				+ "\r\n"
				+ "노동당국은 사업장 규모와 정확한 사고 경위 등을 파악하고 있습니다.\r\n"
				+ "김민영 my_cjb@naver.com";
		
		String str2 = "오늘(31일) 오전 9시 쯤 음성군 삼성면의 한 물류창고에서 50대 노동자 A씨가 작업중 추락해 숨져 노동당국이 조사에 착수했습니다.\r\n"
				+ "\r\n"
				+ "A씨는 샌드위치 패널로 된 창고 지붕 위에서 조명 설치 작업을 하는 과정에서 패널 일부가 무너져 5m 아래로 떨어진 것으로 확인됐습니다.\r\n"
				+ "\r\n"
				+ "노동당국은 사업장 규모와 정확한 사고 경위 등을 파악하고 있습니다.\r\n"
				+ "김민영 my_cjb@naver.com";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
				
	}

}
