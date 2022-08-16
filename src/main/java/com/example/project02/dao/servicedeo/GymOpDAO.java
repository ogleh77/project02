package com.example.project02.dao.servicedeo;

import com.example.project02.interfaces.IGymOperation;
import com.example.project02.services.Box;
import com.example.project02.services.GymOperations;

import java.util.ArrayList;
import java.util.List;

public class GymOpDAO implements IGymOperation {
    @Override
    public void saveGym() {


    }

    @Override
    public void updateGymOp(GymOperations gymOperations) {

    }

    public GymOperations getGymOp() {
        GymOperations gymOperations = new GymOperations(1, "Togdheer fitness center", 12.0,
                3.0, 2.0);
        Box box = new Box("Box1", 5);
        Box box1 = new Box("Box2", 5);
        Box box2 = new Box("Box3", 5);
        Box box3 = new Box("Box4", 5);
        Box box4 = new Box("Box5", 5);
        gymOperations.getVipBoxes().addAll(box, box1, box2, box3, box4);
        return gymOperations;
    }
}
