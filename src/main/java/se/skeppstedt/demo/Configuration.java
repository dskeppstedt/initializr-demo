package se.skeppstedt.demo;
import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import org.springframework.context.annotation.Bean;

@ProjectGenerationConfiguration
public class Configuration {

    @Bean
    public SimpleFolderCustomizer simpleFolderCustomizer(ProjectDescription projectDescription) {
        return new SimpleFolderCustomizer(projectDescription);
    }
}
