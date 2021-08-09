package ru.honorzor.gym.generator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.service.ExerciseService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class SimpleExerciseGenerator implements ExerciseGenerator {

    private final ExerciseService exerciseService;

    @Override
    public List<Exercise> generate(ExerciseRequest request) {

        return null;
    }
}
