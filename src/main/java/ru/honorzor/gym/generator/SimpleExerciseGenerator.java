package ru.honorzor.gym.generator;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.strategy.ExerciseStrategySelector;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class SimpleExerciseGenerator implements ExerciseGenerator {

    private final Map<LevelType, ExerciseStrategySelector> selectors;

    @Override
    public List<Exercise> generate(ExerciseRequest request) {
        return selectors.get(request.getLevel()).select(request);
    }
}
