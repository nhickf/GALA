package com.diyinc.gala;

import com.diyinc.gala.entities.Trips;

import java.util.ArrayList;

public interface IDataRepositories {

    interface GalaRepository{
        ArrayList<Trips> getListOfGala();
    }


}
