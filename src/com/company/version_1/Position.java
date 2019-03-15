package com.company.version_1;

public enum Position {
    NONE(0),
    JUNIOR(5),
    JUNIOR_STRONG(7),
    JUNIOR_PRO(9),
    INTERMIDIATE(12),
    INTERMIDIATE_STRONG(16),
    INTERMIDIATE_PRO(22),
    SENIOR(30);

    private final int rageOfHour;

    Position(int rageOfHour) {
        this.rageOfHour = rageOfHour;
    }

    public int getRageOfHour() {
        return rageOfHour;
    }
}
