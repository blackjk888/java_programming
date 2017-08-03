package box;

   public class Box{
       Box(int k)
       {
           System.out.println("why not working "+k);
       }
    public static void main(String args[]) 
    {
        Box os=new Box(5);
   boxdemo ob=new boxdemo(4,5,6);
   boxarea o=new boxarea();
   //o.i=12;o.j=15;
  System.out.println("the box class " +o.sho(4,5));
   /*ob.length=10;
   ob.bredth=20;
   ob.height=30;*/
   ob.show(); 
   
    }
   }
