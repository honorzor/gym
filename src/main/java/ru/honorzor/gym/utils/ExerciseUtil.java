package ru.honorzor.gym.utils;

import ru.honorzor.gym.entity.Exercise;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ExerciseUtil {
    private static final Random random = new Random();

    public static List<Exercise> distinctByMuscle(List<Exercise> exercises) {
        return exercises.stream()
                .collect(Collectors.groupingBy(Exercise::getMuscle))
                .values().stream()
                .map(exercise -> exercise.get(random.nextInt(exercise.size())))
                .collect(Collectors.toList());
    }
}
