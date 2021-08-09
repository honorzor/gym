package ru.honorzor.gym.enums;

public enum MuscleType {
    //Плечи
    SHOULDERS(SideType.FRONT),
    //Шея
    NECK(SideType.FRONT),
    //Грудь
    CHEST(SideType.FRONT),
    //Бицeпс
    BICEPS(SideType.FRONT),
    //Пресс
    ABS(SideType.FRONT),
    //Предплечье
    FOREARMS(SideType.FRONT),
    //Трицепс бедра
    QUADS(SideType.FRONT),
    //Икры
    CALVES(SideType.FRONT),
    //Трапеция
    TRAPS(SideType.BACK),
    //Спина
    MIDDLE_BACK(SideType.BACK),
    //Трицепс
    TRICEPS(SideType.BACK),
    //Широчайшие
    LATS(SideType.BACK),
    //Жопа
    GLUTES(SideType.BACK),
    //Бицепс бедра
    HAMSTRINGS(SideType.BACK);


    private final SideType sideType;

    MuscleType(SideType sideType) {
        this.sideType = sideType;
    }

    public enum SideType {
        FRONT,
        BACK
    }
}
