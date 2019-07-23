package product;
/**
 * 전자제품을 판매하는 매장에서
 * 관리하는 대상인 "제품"을 정의하는 클래스
 * ---------------------------------
 * <멤버변수> (private, protected, public 사용 x)
 * 제품번호 : pcode : String : <== "P001"
 * 제품 명  : pname : String : <== "삼성 지펠 번호"
 * 가격     : price : int	    : <== 제품 가격
 * 재고수량 : quantity : int  :
 * --------------------------------
 * <생성자> (public)으로 선언
 * 기본생성자, 매개변수받는 생성자 필드 1씩 늘려가며
 * this, this() 활용
 * -----------------------------
 * 메소드
 * print() : void ==> 제품의 상태를 출력
 * 
 * toString() : String   => 이 제품을 대표하는 문자열을 리턴(각 필드를 출력할 수 있는 문자열을 리턴)
 *                       => String.format() 으로 문자열 생성후 리턴
 *                       
 * discount(double percentage) : int
 *   ==> 입력된 퍼센트만큼 할인된 가격을 리턴
 *   
 * sell(int amount) : void
 * 	==> 매장에서 판매되어 재고수량이 amount만큼 줄어들도록 반영(quantity)
 *  ==> 단 재고수량이 0보다 작아질 수는 없다
 *  
 *  buy(int amount) : void
 *  ===> 매장에 입고되어 재고수량(quantity)이
 *  ===> amount만큼 늘어나도록 반영
 *  
 *  ========================================
 *  작성 시 주의 할 것
 *  각 필드를 선언할 때 필드에 대한 설명을 문서 주석으로 남기기
 *  생성자 선언할 때 문서 주석 남기기
 *  각 메소드 선언할 때, 메소드 설명을 문서 주석으로 남기기
 *  
 * @author Administrator
 *
 */

public class Product {

}
