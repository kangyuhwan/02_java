package Book;

/**
 * @author lbh
 *
 */
public class BookShelf {
   private Book[] books;

   public BookShelf() {
      books = new Book[0];
   }

   public BookShelf(Book[] books) {
      this.books = books;
   }

   // 전체 책 목록 얻기
   public Book[] getBooks() {
      return books;
   }

   public void setBooks(Book[] books) {
      this.books = books;
   }

   /**
    * 추가 성공한 건수 리턴
    * 
    * 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 isExist() 메소드 사용하여 판단 isExist() 가 false 일때만
    * 현재 추가로직 작동
    * 
    * @param book
    * @return 0 : 이미 책이 존재하여 추가 실패 1 : 새 책 추가 성공
    */
   // 책장에 책 추가
   public int add(Book book) {

      int result = 0;

      if (!isExist(book)) {

         Book[] newBooks = new Book[books.length + 1];

         for (int idx = 0; idx < books.length; idx++) {
            newBooks[idx] = books[idx];
         }

         newBooks[newBooks.length - 1] = book;

         this.books = newBooks;

         result = 1;
      } else {
         result = 0;
      }

      return result;
   }

   /**
    * 
    * 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 isExist() 메소드 사용하여 판단
    * 
    * true 일때만 삭제로직 진행 1 리턴 false 이면 삭제로직 없이 0 린턴
    * 
    * @param book
    * @return
    */
   // 책장에 책 제거
   public int remove(Book book) {

      int result = 0;

      if (isExist(book)) {
         Book[] newBooks;

         // 1. 폐기할 책이 위치하는 인덱스를 찾기
         int index = findBookIndex(book);

         // 2. 폐기할 책의 인덱스가 -1 보다 크면 삭제로 진입
         if (index > -1) {

            // 3. 폐기 안할 책을 유지할 새 배열 지금 배열크기 - 크기로 생성
            newBooks = new Book[books.length - 1];

            // 4. 폐기할 인덱스가 배열 중간일 때
            if (index < books.length - 1) {

               // 4.(1) 삭제 앞쪽은 인데긋 그대로 유지
               for (int idx = 0; idx < index; idx++) {
                  newBooks[idx] = books[idx];
               }

               // 4.(2) 삭제 뒤쪽은 현재 인덱스 -1
               for (int idxBack = index; idxBack < newBooks.length; idxBack++) {
                  newBooks[idxBack] = books[idxBack + 1];
               }

               // 5. 폐기할 인덱스가 배열 마지막일 때
               // 폐기할 인덱스 앞쪽까지 새 인덱스 복사
            } else {
               for (int idx = 0; idx < index; idx++) {
                  newBooks[idx] = books[idx];
               }

            }
            // 6. 남는 책이 복사된 새 배열을
            // this.book 에 새로 저장
            this.books = newBooks;

            result = 1;
         } // outer if end
      } else {

         result = 0;
      }

      return result;
   } // public void remove(Book book) end

   /**
    * 매개변수로 입력된 book 객체가 이미 목록에 존재하는지 isExist() 메소드 사용하여 판단 isExist(book) true 이면
    * 수정하고 1리턴 false 이면 수행하지 않고 0리턴
    * 
    * @param book
    * @return
    */
   // 책 정보 수정
   public int set(Book book) {
      int result = 0;

      if (isExist(book)) {
         int index = findBookIndex(book);

         if (index > -1) {
            books[index] = book;
            result = 1;
         }

      } else {
         result = 0;
      }

      return result;
   }

   // 책 한권 얻기
   public Book get(Book book) {
      return findBook(book);
   }

   // 전체 책 목록을 얻기 : getAllBooks()
   public Book[] getAllBooks() {
      return this.books;
   }

   private Book findBook(Book book) {
      Book findBook = null;
      for (int idx = 0; idx < books.length; idx++) {
         if (books[idx].equals(book)) {
            findBook = books[idx];
            break;
         }
      }

      return findBook;
   }

   /**
    * book 객체 비교
    * 
    * @param book
    * @return
    */
   private int findBookIndex(Book book) {
      int index = -1;
      for (int idx = 0; idx < books.length; idx++) {
         if (books[idx].equals(book)) {
            index = idx;
            break;
         }
      }

      return index;
   }

   /**
    * 존재시 true return
    * @param book
    * @return true : 찾는 책 존재시 false : 존재 안 할 시
    */
   private boolean isExist(Book book) {

      boolean isBookExist = false;

      for (int idx = 0; idx < books.length; idx++) {
         if (books[idx].equals(book)) {
            isBookExist = true;
            break;
         } else {
            isBookExist = false;
         }
      }
      return isBookExist;
   }
}