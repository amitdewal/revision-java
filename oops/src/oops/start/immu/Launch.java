package oops.start.immu;
class tryCatchQn 
{
   public int tric() 
{
       try
	 {
           int c = 10 / 0;// 5
           System.out.println(c);
           return 1;
       } 

	catch (Exception e) 
	{	System.out.println("in cathc");
           return 2;
       }
	 finally
	 {
           return 3;
       }
   }
}



public class Launch {
	public static void main(String[] args) {
				tryCatchQn obj = new tryCatchQn();
				int x = obj.tric();
				System.out.println(x);
	}

}


