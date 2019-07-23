package account.one;

import account.two.Account;

/**
 * 계좌(Account 타입) 클래스의 
 * 인스턴스(객체, 실체) 를 생성하고
 *  
 * 입금기능, 현재 계좌 상태 출력 기능 등을
 * 테스트하는 클래스
 * @author Administrator
 *
 */
public class AccountTest {

	public static void main(String[] args) {
		// 1. 선언의 형태(타입 + 변수이름)
		Account account;
		Account myAccount;
		
		// 2. 초기화
		account = new Account();
		myAccount = new Account();
		// 3. 사용 (메소드 호출)
		// (1) 계좌 생성 직후 상태 출력
		System.out.println("account의 상태");
		account.print(); 
		
		System.out.println("MyAccount의 상태");
		myAccount.print();
		
		System.out.println("=============");
		// (2) 계좌에 10,000원 입금
		System.out.println("account에 10,000원 입금");
		account.deposit(10000);
		
		System.out.println("MyAccount에 100,000원 입금");
		myAccount.deposit(100000);
		// (3) 입금 후 상태 출력
		System.out.println("account의 상태");
		account.print();
		
		System.out.println("MyAccount의 상태");
		myAccount.print();
		
		
		// (4) 게좌에 5,000원 입금
		System.out.println("account의 상태");
		account.deposit(5000);
		
		// (5) 입금 후 상태 출력
		System.out.println("account의 상태");
		account.print();
		
		System.out.println("MyAccount의 상태");
		myAccount.print();
	}

}
