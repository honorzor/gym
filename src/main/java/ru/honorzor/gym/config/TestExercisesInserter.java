package ru.honorzor.gym.config;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.honorzor.gym.entity.Exercise;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.enums.MuscleType;
import ru.honorzor.gym.enums.SexType;
import ru.honorzor.gym.repository.ExerciseRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
//@Profile("test")
@RequiredArgsConstructor
public class TestExercisesInserter {
    private final ExerciseRepository exerciseRepository;

    @PostConstruct
    public void insertTestData() {
        exerciseRepository.saveAll(List.of(
                Exercise.builder()
                        .name("Жим лежа")
                        .muscle(MuscleType.CHEST)
                        .sex(SexType.MALE)
                        .level(LevelType.EASY)
                        .description("link")
                        .build(),
                Exercise.builder()
                        .name("Жим гантелей")
                        .muscle(MuscleType.CHEST)
                        .sex(SexType.MALE)
                        .level(LevelType.EASY)
                        .description("link")
                        .build()
                )
        );
    }
}
