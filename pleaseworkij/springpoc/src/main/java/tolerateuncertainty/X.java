package tolerateuncertainty;

//X depends on Y for the funtion f1.
public class X {

    private Y fate;

    public X( Y temp)  // constructor injection
    {

    }

    public void setScrap( Y temp)  // Dependancy injection
    {
        System.out.println("Y wired in X thru setScrap");
        fate = temp; // this is fate becuase our project needs like this and spring is not forcing us this
    }

    public void logicfuction()
    {
        fate.someFunctionofY();


    }
}
