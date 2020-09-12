package Implementation.Logic.Models;

import java.util.ArrayList;
import java.util.List;

public abstract class TabBack {
    protected List<Contract> _contracts;
    protected TabBack(){
        _contracts = new ArrayList<>();
    }

    public void addContract(Contract c){
        _contracts.add(c);
    }
}
