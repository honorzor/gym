package ru.honorzor.gym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findAllByMuscleInAndLevelAndSex(List<MuscleType> muscleType, LevelType levelType, SexType sexType);
}
