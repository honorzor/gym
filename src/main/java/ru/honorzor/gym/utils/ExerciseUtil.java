package ru.honorzor.gym.utils;

import ru.honorzor.gym.entity.Exercise;

import java.util.List;
import java.util.stream.Collectors;

public class ExerciseUtil {

    public static List<Exercise> distinctByMuscle(List<Exercise> exercises) {
        return exercises.stream()
                .collect(Collectors.groupingBy(Exercise::getMuscle))
                .values().stream()
                .map(exercise -> exercise.stream()
                        .findFirst()
                        .orElseThrow())
                .collect(Collectors.toList());
    }
}
