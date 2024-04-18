   class TPlayer{

    String Name;
    int Jersy_No;

    void getData(String Name, int Jersy_No)
    {
        this.Name= Name;
        this.Jersy_No= Jersy_No;
        System.out.println("Name is "+ Name+" and Jersy number is "+Jersy_No);

    }

  
}

class Cricket_Player extends TPlayer
{

    TPlayer obj= new TPlayer();
    

}

class Football_Player extends TPlayer
{

}

class Hockey_Player extends TPlayer
{

}

public class Player{

    public static void main(String[] args)
    {
        
  
    
    }
}

