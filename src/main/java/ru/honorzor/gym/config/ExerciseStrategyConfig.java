package ru.honorzor.gym.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.honorzor.gym.enums.LevelType;
import ru.honorzor.gym.strategy.ExerciseStrategySelector;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Configuration
@RequiredArgsConstructor
public class ExerciseStrategyConfig {
    private final List<ExerciseStrategySelector> strategySelectors;

    @Bean
    public Map<LevelType, ExerciseStrategySelector> selectorsAsMap() {
        return strategySelectors.stream()
                .collect(Collectors.toMap(ExerciseStrategySelector::getLevelType, exerciseStrategySelector -> exerciseStrategySelector));

    }
}
