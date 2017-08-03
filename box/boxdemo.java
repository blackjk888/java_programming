package box;
public class boxdemo{
    int volume,lengthh;
   //int length,bredth,height;
   boxdemo(int length,int bredth,int height){
       lengthh=length;
       volume=length*bredth*height;
   }
  // int volume=length*bredth*height;
   void show()
    {   
      System.out.println("length "+lengthh);
      System.out.println("the volume of box is " +  volume); 
    }
}
