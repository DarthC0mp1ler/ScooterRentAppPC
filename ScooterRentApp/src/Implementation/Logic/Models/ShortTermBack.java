package Implementation.Logic.Models;

public class ShortTermBack extends ActiveBarBack {

    public ShortTermBack(){
        super();
    }

    @Override
    public void finishContract(Contract c) {
        c.finish();
    }

    @Override
    public void toHistory(Contract c) {

    }


}
