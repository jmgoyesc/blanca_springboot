package com.github.jmgoyesc.blancaspringboot.domain.ports;

import com.github.jmgoyesc.blancaspringboot.domain.exceptions.RepositoryException;
import com.github.jmgoyesc.blancaspringboot.domain.model.QuizConfiguration;
import com.github.jmgoyesc.blancaspringboot.domain.model.Verb;

import java.util.List;

public interface VerbRepository {

    List<Verb> findRandomVerbsByConfiguration(QuizConfiguration numberOfVerbs) throws RepositoryException;

}
