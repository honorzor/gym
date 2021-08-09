package ru.honorzor.gym.generator;

import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;

import java.util.List;

public interface ExerciseGenerator {
    List<Exercise> generate(ExerciseRequest request);
}
