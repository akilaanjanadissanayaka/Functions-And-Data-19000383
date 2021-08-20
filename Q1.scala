//1. Implement a Data Structure for Rational Number and create a method neg to class Rational that is used like this:
//x.neg // evaluates to -x

object Q1 extends App{
  class Rational(n1:Int,n2:Int){
    def numer = n1;
    def dino = n2;
    
    def neg = new Rational(- this.numer,this.dino);
    override def toString = "[" + this.numer + "/" + this.dino + "]";
    
  }
  
  val x = new Rational(2,4);
  val y = x.neg;
  print(y);
}