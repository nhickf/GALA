package com.diyinc.gala;

import com.diyinc.gala.entities.Trips;

import java.util.ArrayList;

public class FakeDatabase {

    public static ArrayList<Trips> getMockListOfGala(){
        ArrayList<Trips> newGala =  new ArrayList<>();

        newGala.add( new Trips(
                "Sagada Trips","Sagada Philippines",
                "comuestae safv dsfsk erqweq nmwqe m qeqweq mefsfsdfsf" +
                        "fsdsf lsfl mdfsdfsdfsfsfdsf sdfs dsf sdfsd fsldfksf" +
                        "sfdlsdf sdkf lsdkf skdfs lfls dfkl sdf sdf l sdfsdfo ewperqpoe" +
                        "sad  dasda sadasda sad ada s [spad d asda  asdasd  asda da","February 16 2019"
                ,"February 19 2019","https://www.thepoortraveler.net/wp-content/uploads/2012/08/Sagada-Guide.jpg","Nhick Flores"
        ));

        newGala.add( new Trips(
                "Baguio Trips","Baguio Philippines",
                "comuestae safv dsfsk erqweq nmwqe m qeqweq mefsfsdfsf" +
                        "fsdsf lsfl mdfsdfsdfsfsfdsf sdfs dsf sdfsd fsldfksf" +
                        "sfdlsdf sdkf lsdkf skdfs lfls dfkl sdf sdf l sdfsdfo ewperqpoe" +
                        "sad  dasda sadasda sad ada s [spad d asda  asdasd  asda da","February 16 2019"
                ,"February 19 2019","http://primer.com.ph/blog/wp-content/uploads/sites/14/2018/08/top-photo-1024x768.jpg","Damulag Nobita"
        ));

        newGala.add( new Trips(
                "Batangas Trips","Batangas Philippines",
                "comuestae safv dsfsk erqweq nmwqe m qeqweq mefsfsdfsf" +
                        "fsdsf lsfl mdfsdfsdfsfsfdsf sdfs dsf sdfsd fsldfksf" +
                        "sfdlsdf sdkf lsdkf skdfs lfls dfkl sdf sdf l sdfsdfo ewperqpoe" +
                        "sad  dasda sadasda sad ada s [spad d asda  asdasd  asda da","February 16 2019"
                ,"February 19 2019","https://i0.wp.com/onedayitinerary.com/wp-content/uploads/2019/01/One-day-in-Batangas-Itinerary.jpg?resize=723%2C542","Soneyo Tambilog"
        ));

        newGala.add( new Trips(
                "Manila Trips","Manila Philippines",
                "comuestae safv dsfsk erqweq nmwqe m qeqweq mefsfsdfsf" +
                        "fsdsf lsfl mdfsdfsdfsfsfdsf sdfs dsf sdfsd fsldfksf" +
                        "sfdlsdf sdkf lsdkf skdfs lfls dfkl sdf sdf l sdfsdfo ewperqpoe" +
                        "sad  dasda sadasda sad ada s [spad d asda  asdasd  asda da","February 16 2019"
                ,"February 19 2019","https://i.ytimg.com/vi/H2ZvJv3pQEQ/maxresdefault.jpg","John Ce Narido"
        ));


        return newGala;
    }




}
