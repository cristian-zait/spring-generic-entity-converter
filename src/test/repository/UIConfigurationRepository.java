package test.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import module.model.ui.UIConfiguration;

@RepositoryRestResource(exported = false)
public interface UIConfigurationRepository extends MongoRepository<UIConfiguration<?>, String> {

}
