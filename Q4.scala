/*
4.  A Bank defines as List of Accounts. So implement the following functions:

4.1 List of Accounts with negative balances

4.2 Calculate the sum of all account balances

4.3 Calculate the final balances of all accounts after apply the interest function as follows: 

If balance is positive, deposit interest is .05  and if balance is negative, overdraft interest is .1
*/
import Q3.Account
object Q4 extends App{
  var bank:List[Account] = List()
 
  var Print = (a:List[Account])=>(a.map(x => println(x)));  //print accounts
  
  val overdraft = (b:List[Account])=>b.filter(x => (x.balance < 0))  //minus value accounts -4.1
  
  val sum  = (b:List[Account])=> b.reduce((x,y) => new Account(0,x.balance + y.balance)).balance   //take amount of all accounts 4.2
  
  val cal =(x:Account)=>if(x.balance < 0) x.balance * 0.1  else x.balance*0.05 
  val interest=(b:List[Account])=>b.map(x => x.deposit(cal(x)))                  //calculate interest 4.3 
  
  var AC1 = new Account(100001999,400.5)
  var AC2 = new Account(200002000,23525.45)  
  var AC3 = new Account(300002001,-345.34)
  var AC4 = new Account(400002002,23423)
  bank = List(AC1,AC2,AC3,AC4)
  
  //Print(bank)
  // println(overdraft(bank))
  //println("Sum " + sum(bank))
  interest(bank)
  Print(bank)
}