object Test extends App {
   
  var estimate:Double=1;
  def sqrRootN(value:Double):Double={
    if(value==estimate)
      value
     estimate=(estimate+(value/estimate))/2 
    sqrRootN(value)    
  }
  println("sqrt(2)"+sqrRootN(2));
  

}