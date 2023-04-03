package ru.nikita.springboot.repo;

import org.springframework.data.repository.CrudRepository;
import ru.nikita.springboot.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
}
