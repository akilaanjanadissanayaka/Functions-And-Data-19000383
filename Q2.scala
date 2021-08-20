//2. Create a method sub to subtract two rational numbers and find an answer  x-y-z where x=3/4, y=5/8, z=2/7.

object Q2 extends App{
  class Rational(n1:Int,n2:Int){
    def numer = n1;
    def dino = n2;
    
    def +(r:Rational) = new Rational(this.dino*r.numer + this.numer*r.dino,this.dino*r.dino);
    def neg = new Rational(- this.numer,this.dino);
    def -(r:Rational) = this + r.neg ;
    override def toString = "[" + this.numer + "/" + this.dino + "]";
    
  }
  
  val x= new Rational(3,4);
  val y = new Rational(5,8);
  val z = new Rational(2,7);
  val result = x-y-z;
  println(result);
}