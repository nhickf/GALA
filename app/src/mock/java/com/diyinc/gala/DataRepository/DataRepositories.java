package com.diyinc.gala.DataRepository;

import android.content.Context;

import com.diyinc.gala.IDataRepositories;

public class DataRepositories {

    private Context context;

    public DataRepositories(Context context) {
        this.context = context;
    }

    public static IDataRepositories.GalaRepository galaRepository (){
        return new FakeGalaRepository();
    }

}
