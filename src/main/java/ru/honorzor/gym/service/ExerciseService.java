package ru.honorzor.gym.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;
import ru.honorzor.gym.repository.ExerciseRepository;

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

        return exerciseRepository.findAllByMuscleInAndLevelAndSex(
                muscleTypes,
                levelType,
                sexType
        );
    }
}
