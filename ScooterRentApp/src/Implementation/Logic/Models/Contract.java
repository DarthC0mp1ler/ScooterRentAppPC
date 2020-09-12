package Implementation.Logic.Models;

import Implementation.UI.IListable;

import java.util.Date;

public abstract class Contract implements IListable {

    protected String _contractType;
    protected String _name;
    protected String _scooterInfo;
    protected Date _startDate;
    protected Date _finishDate;
    protected String _path;

    protected abstract void finish();

}
