package ru.honorzor.gym.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ActiveProfiles;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.MuscleType;

import java.util.List;

@ActiveProfiles("test")
class ExerciseUtilTest {

    @Test
    public void shouldBeDistinctByMuscleType() {
        final List<Exercise> exercises = List.of(
                Exercise.builder()
                        .muscle(MuscleType.BICEPS)
                        .name("1")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.BICEPS)
                        .name("2")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.BICEPS)
                        .name("3")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.TRICEPS)
                        .name("4")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.TRICEPS)
                        .name("5")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.TRICEPS)
                        .name("6")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.ABS)
                        .name("7")
                        .build(),
                Exercise.builder()
                        .muscle(MuscleType.ABS)
                        .name("8")
                        .build()
        );

        final List<Exercise> distinctByMuscle = ExerciseUtil.distinctByMuscle(exercises);

        Assertions.assertEquals(1, distinctByMuscle.stream()
                .filter(exercise -> exercise.getMuscle() == MuscleType.TRICEPS).count());

        Assertions.assertEquals(1, distinctByMuscle.stream()
                .filter(exercise -> exercise.getMuscle() == MuscleType.BICEPS).count());

        Assertions.assertEquals(1, distinctByMuscle.stream()
                .filter(exercise -> exercise.getMuscle() == MuscleType.ABS).count());

    }
}
