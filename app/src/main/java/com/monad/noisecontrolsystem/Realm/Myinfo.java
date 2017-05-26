package com.monad.noisecontrolsystem.Realm;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by temp on 2017. 5. 18..
 */

public class Myinfo extends RealmObject {
    @PrimaryKey
    private long id;
    private int firtNumber;
    private int lastNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getFirtNumber() {
        return firtNumber;
    }

    public void setFirtNumber(int firtNumber) {
        this.firtNumber = firtNumber;
    }

    public int getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(int lastNumber) {
        this.lastNumber = lastNumber;
    }
}
