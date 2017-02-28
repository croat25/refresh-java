package classes;

public class BankAccount {

			private int accnumber;
			private double balance;
			private String name;
			private String email;
			private String phonenumber;
			
			public BankAccount(int accnumber,double balance,String name,String email, String phonenumber){
				this.accnumber=accnumber;
				this.balance=balance;
				this.name=name;
				this.email=email;
				this.phonenumber=phonenumber;
			}
			public int getAccnumber() {
				return accnumber;
			}
			public void setAccnumber(int accnumber) {
				this.accnumber = accnumber;
			}
			public double getBalance() {
				return balance;
			}
			public void setBalance(double balance) {
				this.balance = balance;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPhonenumber() {
				return phonenumber;
			}
			public void setPhonenumber(String phonenumber) {
				this.phonenumber = phonenumber;
			}
			public void deposit(double amount){
				this.balance+=amount;
			}
			public void withdraw(double amount){
				if(balance-amount<0){
					System.out.println("not allowed to withdraw that");
				}else{
					
				}
				this.balance-=amount;
			}
			
			
}
