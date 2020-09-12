package Implementation.Logic.Models;

public abstract class ActiveBarBack extends TabBack{
    protected ActiveBarBack(){
        super();
    }

    public abstract void finishContract(Contract c);
    public abstract void toHistory(Contract c);

}
