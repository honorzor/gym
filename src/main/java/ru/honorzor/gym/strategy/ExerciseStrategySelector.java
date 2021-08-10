package ru.honorzor.gym.strategy;

import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;

import java.util.List;

public interface ExerciseStrategySelector {
    List<Exercise> select(ExerciseRequest request);

    LevelType getLevelType();
}
