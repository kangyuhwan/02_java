
/**
 * 책장을 사용하는 북 매니저를 나타내는 클래스 ------------------------------------ 서점의 북매니저는
 * 
 * 1. 책을 책장에 꽂거나(추가하거나) 2. 책장에서 찾아달라고 부탁받은 책을 가지고 오거나 3. 어떤 책의 수량이나 가격정보를 수정하거나
 * 4. 더 이상 판매하지 않을 책을 폐기하고 5. 이 서점에서 파는 책 목록을 안내
 * 
 * 하는 중의 작업을 진행 ---------------------
 * 
 * 전제 조건 : 북 매니저는 책장이 어디 있는지, 무엇인지 알고 있어야 하낟. ---------------------
 * 
 * @author Administrator
 *
 */

public class BookManager {
	// 1. 멤버변수 선언부
	private BookShelf bookShelf;

	// 2. 생성자 선언부
	// (1) 기본 생성자 명시
	public BookManager() {
		bookShelf = new BookShelf();
	}

	// (2) 매개변수 생성자 작성
	public BookManager(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
	}

	// 3. 메소드 선언
	// (1) 매니저는 책 한 권을 책장에 가져가서 꽂을 수 있다.

	//
	public void add(Book book) {
		this.bookShelf.add(book);
	}

	// (2) 매니저는 책장에 가서 더 이상 팔지 않을
	// 폐기할 책을 제거할 수 있다.
	public void remove(Book book) {
		this.bookShelf.remove(book);
	}

	// (3) 매니저는 책장에서 찾아달라고 고객이 요청한
	// 책 한개를 가지고 올 수 있다.
	public Book get(Book book) {
		return this.bookShelf.get(book);
	}

	// (4) 매니저는 책장에 가서 판매 가격 등
	// 책의 정보를 수정할 수 있다.
	public void set(Book book) {
		this.bookShelf.set(book);
	}

	// (5) 매니저는 서점에서 판매되고 있는 책의 목록을
	// 보여줄 수 있다.
	public Book[] getAllBooks() {
		return bookShelf.getAllBooks();
	}
}
