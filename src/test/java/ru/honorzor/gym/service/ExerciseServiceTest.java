package ru.honorzor.gym.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;
import ru.honorzor.gym.repository.ExerciseRepository;

import java.util.List;

@SpringBootTest
@ExtendWith(value = SpringExtension.class)
public class ExerciseServiceTest {

    @Autowired
    private ExerciseService exerciseService;

    @MockBean
    private ExerciseRepository exerciseRepository;

    @BeforeEach
    void beforeEach() {
        Mockito.when(exerciseRepository.findAllByMuscleInAndLevelAndSex(
                        Mockito.any(),
                        Mockito.any(),
                        Mockito.any()))
                .thenReturn(List.of(
                        Exercise.builder()
                                .description("PODEM SHTANGI")
                                .muscle(MuscleType.BICEPS)
                                .build(),
                        Exercise.builder()
                                .description("GANTELI")
                                .muscle(MuscleType.BICEPS)
                                .build(),
                        Exercise.builder()
                                .description("Jim leja")
                                .muscle(MuscleType.CHEST)
                                .build(),
                        Exercise.builder()
                                .description("Ganteli")
                                .muscle(MuscleType.CHEST)
                                .build()
                ));
    }

    @Test
    public void shouldReturnOneExerciseForMuscleGroup() {
        final List<Exercise> byMuscleTypeAndLevelTypeAndSexType = exerciseService.findByMuscleTypeAndLevelTypeAndSexType(
                List.of(
                        MuscleType.BICEPS, MuscleType.CHEST
                ),
                LevelType.EASY,
                SexType.MALE
        );

        final long countBiceps = byMuscleTypeAndLevelTypeAndSexType
                .stream()
                .filter(exercise -> exercise.getMuscle() == MuscleType.BICEPS).count();

        final long countChest = byMuscleTypeAndLevelTypeAndSexType
                .stream()
                .filter(exercise -> exercise.getMuscle() == MuscleType.CHEST).count();

        Assertions.assertEquals(1, countBiceps);
        Assertions.assertEquals(1, countChest);
    }
}
