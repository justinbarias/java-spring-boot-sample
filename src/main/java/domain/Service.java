package domain;

import models.*;

import java.util.*;

public class Service implements IService{

    public ArrayList<SampleModel> GetModels()
    {
        ArrayList<SampleModel> retVal = new ArrayList<>();
        retVal.add(new SampleModel("Sample01", "This is a first sample java model"));
        retVal.add(new SampleModel("Sample02", "This is a second sample java model"));
        return retVal;

    }


}
