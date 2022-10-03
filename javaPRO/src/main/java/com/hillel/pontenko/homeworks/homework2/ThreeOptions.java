package com.hillel.pontenko.homeworks.homework2;

public class ThreeOptions {
    private final int TOWER_HEIGHT;
    private final double WIND_SPEED;
    private final String READY_TO_JUMP;


    //public ThreeOptions() { пустой конструктор не может быть создан,так как переменная(константа)
    //                        в конструкторе должна быть обязательно проинициализирована
    //}


    public ThreeOptions(int TOWER_HEIGHT, double WIND_SPEED, String READY_TO_JUMP) {
        this.TOWER_HEIGHT = TOWER_HEIGHT;
        this.WIND_SPEED = WIND_SPEED;
        this.READY_TO_JUMP = READY_TO_JUMP;
    }

    public int getTOWER_HEIGHT() {
        return TOWER_HEIGHT;
    }

    //public int setTowerHeight () { мы не можем назначить константе какое либо другое значение, исходя из этого
    //    return towerHeight;         setter создавать нет необходимости
    //}


    public double getWIND_SPEED() {
        return WIND_SPEED;
    }

    public String getREADY_TO_JUMP() {
        return READY_TO_JUMP;
    }
}
