package com.diyinc.gala.DataRepository;

import com.diyinc.gala.FakeDatabase;
import com.diyinc.gala.IDataRepositories;
import com.diyinc.gala.entities.Trips;

import java.util.ArrayList;

public class FakeGalaRepository implements IDataRepositories.GalaRepository {



    @Override
    public ArrayList<Trips> getListOfGala() {
        return FakeDatabase.getMockListOfGala();
    }
}
