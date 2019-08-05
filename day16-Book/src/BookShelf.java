
/**
 * Book 여러개가 꼽혀있는 책 객체 여러개를 한 번에 저장하고 관리할 수 있는 클래스
 * 
 * @author Administrator
 *
 */

public class BookShelf {
	// 멤버변수
	private Book[] books;

	// 생성자
	public BookShelf() {
		books = new Book[0];
	}

	public BookShelf(Book[] books) {
		this();
		this.books = books;
	}

	// 책장에 책을 추가 : add : void : 매개변수로 book 1개를 받는다.
	/**
	 * 31 * 1. 리턴을 int 타입으로 변경 추가 성공한 건수를 리턴 32 * 33 * 2. 매개변수로 입력된 book 객체가 34 * 이미
	 * 목록에 존재하는지 여부를 35 * 36 * isExists(book) 메소드를 사용하여 판단하고 37 * isExists(book) 의
	 * 결과가 false 일 때만 38 * 현재의 추가로직이 작동하도록 변경 39 * 40 * @param book 41 * @return 0 :
	 * 이미 같인 seq 번호의 책이 있어서 42 * 추가 실패 43 * 1 : 새 책 정보 1건이 성공적으로 추가된 경우 44
	 */

	public void add(Book book) {
		// 현재 books 보다 길이가 1큰 배열을 새로 만든다.
		// newBooks
		Book[] newBooks;
		newBooks = new Book[books.length + 1];
		// books의 모든 책 내용을 새로 생성한 1칸 큰 배열에
		// 앞쪽부터 복사
		for (int idx = 0; idx < books.length; idx++) {
			newBooks[idx] = books[idx];
		}

		// 매개변수 넘겨진 book은 마지막 새로 생긴 칸에 저장
		newBooks[newBooks.length - 1] = book;

		// 이 클래스의 books 멤버변수에 새로만든 newBooks에 저장
		this.books = newBooks;
	}

	// 책장에서 책을 제거 : void : remove(Book book)
	/**
	 * 65 * 삭제하기 전에 목록에 book 객체가 존재하는지 먼저 66 * isExists(book) 으로 판단 67 * 68 * 결과가
	 * true 일 때만 삭제로직 진행 1리턴 69 * 결과가 false 이면 삭제로직 진행 없이 0리턴 70 * @param book 71
	 */

	public void remove(Book book) {
		// book 객체의 sequence 가 같으면 같은 책으로 판단해서
		// 삭제
		// 폐기 안하고 남는 책을 유지할 새 배열
		Book[] newBooks;

		// 1. 폐기할 책이 위치하는 인덱스를 찾기
		int index = findBookIndex(book);

		// 2. 폐기할 책의 인덱스가 -1보다 크면
		// 폐기할 책이 있다는 의미로 판단하고 삭제로직 진입
		if (index > -1) {
			// 3. 폐기 안할 책을 유지할
			// 새 배열을 지금 배열 크기 - 1 크기로 생성
			newBooks = new Book[books.length - 1];

			// (1) 삭제할 책 앞쪽의 책정보는 같은 인덱스로 복사
			for (int idx = 0; idx < index; idx++) {
				newBooks[idx] = books[idx];
			}

			// (2) 삭제할 책 뒤쪽의 남는 책정보는 현재 인덱스 - 1 위치로 복사
			for (int idx = index; idx < newBooks.length; idx++) {
				newBooks[idx] = books[idx + 1];
			}

			// 6. 남는 책이 복사된 새 배열을
			// this.book 에 새로 저장
			this.books = newBooks;

		} // end outer if

	}

	// 책 정보 수정 : void : set(Book book)
	// 책 정보 수정 : void : set(Book book)
	/**
	 * 108 * 수정하기 전에 수정할 book 객체가 109 * 목록에 이미 존재하는지 여부를 110 * isExists(book) 수행 결과로
	 * 판단해서 111 * 112 * true 이면 수정하고 1리턴 113 * false 이면 수정진행하지 않고 0리턴 114 * @param
	 * book 115
	 */

	public void set(Book book) {
		// 수정할 book이 books 배열 몇 번째 인덱스에 위치하는지 찾기
		int index = findBookIndex(book);

		if (index > -1) {
			books[index] = book;
		}
	}

	// 책 한 권 얻기 : Book : get(Book book)
	public Book get(Book book) {
		// 입력된 book의 sequence 값과
		// 내부 배열에 저장된 책들 중 일치하는 sequence를 가진
		// 책 1권의 정보를 리턴
		return findBook(book);
	}

	// 전체 책 목록을 얻기 : getAllBooks()
	public Book[] getAllBooks() {
		return this.books;
	}

	/**
	 * 매개변수 전달된 책 정보와 일치하는 일련번호를 가진 책(책 배열 : books 에 있는)을 찾아서 배열에 안에 들어있는 책을 리턴
	 * 
	 * @param book
	 * @return
	 */

	private Book findBook(Book book) {
		Book findBook = null;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책을 찾음
				findBook = books[idx];
				break;
			}
		}
		return findBook;
	}

	private int findBookIndex(Book book) {
		int index = -1;
		for (int idx = 0; idx < books.length; idx++) {
			if (books[idx].getSequence() == book.getSequence()) {
				// 같은 책을 찾음
				index = idx;
				break;
			}
		}
		return index;
	}
	// 전체 책 목록을 얻기

	// 접근자
	public Book[] getBooks() {
		return books;
	}

	// 수정자
	public void setBooks(Book[] books) {
		this.books = books;
	}
	// ---------------------------------------
	/**
	 * 151 * 매개변수 전달된 책 정보와 152 * 일치하는 일련번호를 가진 책(책 배열: books 에 있는)을 153 * 찾아서 배열에
	 * 안에 들어있는 책을 리턴 154 * --------------------------------------- 155 * 같은 책을 찾는
	 * 로직을 156 * sequence 값 직접 비교에서 157 * book 객체 비교로 변경 158 *
	 * --------------------------------------- 159 * @param book 160 * @return 161
	 */

}
