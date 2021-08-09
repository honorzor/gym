package ru.honorzor.gym.strategy;

import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;

import java.util.List;

public interface ExerciseStrategySelector {
    List<Exercise> select(ExerciseRequest request);
}
