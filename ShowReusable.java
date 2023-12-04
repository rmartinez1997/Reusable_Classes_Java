
import static java.lang.System.in;


public class ShowReusable {
    public static void main(String [] args)
    {
       // System.out.println("Hello");
        APerson p1 = new APerson();
        p1.setFName("Lisa");
       // System.out.println(p1.getFName()+" She is ****");
        APerson p2 = new APerson
        ("Jack","Baker","222-22-2222",45,"Jack@SMC.edu");
        APerson p3 = new APerson("Susan","Smith");
       // System.out.println(p2);
      APerson  [] p = new APerson[3];
      p[0] = p1; p[1] = p2; p[2]=p3;
     // for( APerson x : p)
     //     System.out.println(x);
      
      p2.marriedTo(p1);
      System.out.println(p2);
       APerson p4 = new APerson
        ("Tom","Cruise","777-22-2222",45,"Tom@SMC.edu");
      p4.marriedTo(p1);
    }
    
}
interface Driver
{
    public String howToDrive();
    
}



class APerson implements Driver
{
    private String fName;
    private String lName;
    private String sSN;
    private int age;
    private String eMail;
    private APerson hw;
    // designated Constructor
    public APerson(String fn,String ln,String s,int a,String e)
    {
        fName = fn;
        lName = ln;
        sSN = s;
        setAge(a);
        eMail = e;
      }
    public void marriedTo(APerson p)
    {
        if( (!this.isMarried())&& (!p.isMarried())        )
        {
           this.hw = p;
           p.hw = this;
           System.out.println("You are married now so Start Fighting");
        }
        else
        {
          System.out.println("You are already married");
                }
    }
    
    public boolean isMarried()
    {
        return hw != null;
    }
    public String howToDrive()
    {
        return "UnKnown";
    }
    public APerson(String fn, String ln)
    {
       this(fn,ln,null,0,null); 
    }
    
    
    public APerson()
    {
        
    }
   
    
   public void setFName(String fName)
   {
       this.fName = fName;
   }
   public String getFName()
   {
       return fName;
   }
    
    public void setLName(String f)
   {
       lName = f;
   }
   public String getLName()
   {
       return lName;
   }
    public void setEmail(String f)
   {
       eMail = f;
   }
   public String getEMail()
   {
       return eMail;
   }
    
   public String getSSN()
   {
       return sSN;
   } 
    
    public void setAge(int a)
    {
        if ( a > 0)
            age = a;
    }
    public int getAge()
    {
        return age;
    }
  public String toString()
  {
     return "First Name:" +fName+"\n"
           +"Last  Name:" +lName+"\n"
           +"Social Security:"+sSN+"\n"
           +"Age:"+age+"\n"
           +"EMail:"+eMail+"\n"
           +"Marital Status:"+
             ((this.isMarried()? "Married": "is Available"));
      
  }
    
}