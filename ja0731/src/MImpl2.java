
public class MImpl2 implements Mservice {

	@Override
	public void all_print() {
		System.out.println("게시판 2을 모두 출력합니다.");
	}

	@Override
	public void add() {
		System.out.println("게시글 2개를 추가합니다.");
	}

	@Override
	public void update() {
		System.out.println("게시글 2개를 수정합니다.");
	}

	@Override
	public void delete() {
		System.out.println("게시글 2개를 삭제합니다.");
	}

}

