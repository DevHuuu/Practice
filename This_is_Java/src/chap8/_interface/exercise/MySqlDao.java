package chap8._interface.exercise;

public class MySqlDao implements DataAccessObject{

	@Override
	public void select() {
		System.out.println("MySpl DB에서 검색");
	}

	@Override
	public void insert() {
		 System.out.println("MySpl DB에 삽입");
	}

	@Override
	public void update() {
		System.out.println("MySpl DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("MySpl DB에서 삭제");
	}
	
}
