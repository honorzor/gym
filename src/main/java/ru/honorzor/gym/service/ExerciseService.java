package ru.honorzor.gym.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;
import ru.honorzor.gym.repository.ExerciseRepository;
import ru.honorzor.gym.utils.ExerciseUtil;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseRepository exerciseRepository;

    public List<Exercise> findByMuscleTypeAndLevelTypeAndSexType(
            List<MuscleType> muscleTypes,
            LevelType levelType,
            SexType sexType
    ) {
        final List<Exercise> allByMuscleInAndLevelAndSex = exerciseRepository.findAllByMuscleInAndLevelAndSex(
                muscleTypes,
                levelType,
                sexType
        );

        return ExerciseUtil.distinctByMuscle(allByMuscleInAndLevelAndSex);
    }
}
