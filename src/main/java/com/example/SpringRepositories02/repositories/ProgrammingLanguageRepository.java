package com.example.SpringRepositories02.repositories;

import com.example.SpringRepositories02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Description of programming languages"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}