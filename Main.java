class Main {
    
   private static int xSquaredCoeff=1;
   private static int xCoeff=0;
   private static int constant=-5;
   private static double x0=5;
   private static double y0=6;
   private static double stepSize=0.1;
   private static double xEnd=6;


 /* This method returns the value from evaluating the differential     *equation with coefficants above. 
  * @return the value of differential eqution at x=Xval
  */
 public static double differentialEquationEvaluator(int xSquaredCoeff,int xCoeff,int constant,double Xval){
    return xSquaredCoeff * Math.pow( Xval, 2) + (double)(xCoeff*Xval)+ constant;
  }
/*This method estimates the function value at a point given a step      *size, initial condition, and a differential equation.
  * @return the estimated value of the function at x=xEnd 
  *
  */
  public static double EulerMethod()
  {
   
  double y = y0;
  for(double x = x0;x < xEnd-0.01;x+= stepSize){
    x = Math.round(x*10)/10.0;
    y+= stepSize * differentialEquationEvaluator( xSquaredCoeff, xCoeff, constant, x);
}


return y;
  }
  public static void main(String[] args) {
    System.out.println(EulerMethod());
  }
}