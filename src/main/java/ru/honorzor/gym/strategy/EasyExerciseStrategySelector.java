package ru.honorzor.gym.strategy;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.honorzor.gym.dto.ExerciseRequest;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.service.ExerciseService;

import java.util.List;

@Component
@RequiredArgsConstructor
public class EasyExerciseStrategySelector implements ExerciseStrategySelector {

    private final ExerciseService exerciseService;

    @Override
    public List<Exercise> select(ExerciseRequest request) {
        return exerciseService.findByMuscleTypeAndLevelTypeAndSexType(
                List.of(
                        MuscleType.CHEST, MuscleType.BICEPS, MuscleType.ABS,
                        MuscleType.MIDDLE_BACK,MuscleType.TRICEPS,
                        MuscleType.SHOULDERS,MuscleType.QUADS,MuscleType.CALVES
                ),
                request.getLevel(),
                request.getSex()
        );
    }

    @Override
    public LevelType getLevelType() {
        return LevelType.EASY;
    }
}
