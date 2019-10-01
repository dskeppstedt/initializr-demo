package se.skeppstedt.demo;

import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.contributor.ProjectContributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SimpleFolderCustomizer implements ProjectContributor {

    private final ProjectDescription projectDescription;

    public SimpleFolderCustomizer(ProjectDescription projectDescription) {
        this.projectDescription = projectDescription;
    }

    @Override
    public void contribute(Path projectRoot) throws IOException {
        System.out.println("Hello world!");
        Files.createDirectories(projectRoot.resolve("gurka"));
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
