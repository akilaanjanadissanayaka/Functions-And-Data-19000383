//3. Implement a Data Structure for Account and create a method transfer which transfer the money from this account to a given account.

object Q3 extends App {
  
 class Account(Account:Int,Amount:Double){
    val ac_no = Account;
    var balance = Amount;
    
    def withdraw(a:Double) = (this.balance = this.balance-a)
    def deposit(a:Double) = (this.balance = this.balance+a)
    def transfer(a:Account,b:Double) = {this.withdraw(b) 
        a.deposit(b)}
    override def toString = "["+ ac_no + " - "  + balance + "]"
 }
 
  //var AC1 = new Account(10001999,60000)
  //var AC2 = new Account(20002000,40000)
  //println(AC1);
  //println(AC2);
  //AC1.withdraw(10000)
  //AC1.deposit(5000);
  //AC1.transfer(AC2, 5000);
 // println(AC1);
  //println(AC2);
}
