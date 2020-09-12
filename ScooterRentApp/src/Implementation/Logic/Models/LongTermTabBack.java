package Implementation.Logic.Models;

public class LongTermTabBack extends ActiveBarBack {

    public LongTermTabBack(){
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
