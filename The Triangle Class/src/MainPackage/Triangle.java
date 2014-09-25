package MainPackage;
public abstract class Triangle extends GeometricObject {

	private double a = 1.0;

	private double b = 1.0;

	private double c = 1.0;

	Triangle() {
}

	
	public Triangle(double a, double b, double c) {

		this.a = a;

		this.b = b;
this.c = c;
}

	
	
     public double geta() {
        return a;
     }

     public double getb() {
    return b;
}

     
     
     public double getc() {
      return c;
}

     
     
     	public double getArea() {
     		double s;
     		s= (geta() + getb() + getc()) / 2;
     		float s_a;
     		s_a = (float)(s- geta());
     		float s_b;
     		s_b = (float)(s - getb());
     		float s_c;
     		s_c = (float)(s - getc());
     		double inside;
     		inside = s*(s_a)*(s_b)*(s_c);
     		double area;
     		area = (double)Math.sqrt(inside);
     		return area;
}

     		public double getP() {
     			double P;
     			P = geta() + getb() + getc();
     			return P;
}

     		
     		
     		public String toString() {
     			String a = " a: " + geta();
     			String b = "b: " + getb();
     			String c = " c: " + getc();
     			return "premeter=" + a + b + c;
}
}

   