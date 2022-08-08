public class PassByReferenceDemo {

	public static void main(String[] args) {
		
		MyBank sbi = new MyBank();
		
		Money myMoney = new Money();
		
		sbi.acceptMoney(myMoney);
		sbi.TransferMoney(1000, new Account());
	}

}

class MyBank {
	public void acceptMoney(Money m) {

	}

	public void TransferMoney(int amt, Account acct) {
		acct.credit(100);
		acct.debit(200);
	}
}

class Money {

}

class Account {
	public void debit(int drid) {
		System.out.println("Debited.." + drid);

	}

	public void credit(int crdid) {
		System.out.println("Credited...:" + crdid);
	}
}