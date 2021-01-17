package com.github.jmgoyesc.blancaspringboot.domain.usecases;

import com.github.jmgoyesc.blancaspringboot.domain.model.QuizAnswer;
import com.github.jmgoyesc.blancaspringboot.domain.model.QuizScore;

public interface ScoreQuizPort {

    QuizScore score(QuizAnswer answer);
}
