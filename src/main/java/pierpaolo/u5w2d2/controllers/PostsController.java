package pierpaolo.u5w2d2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pierpaolo.u5w2d2.entities.Post;
import pierpaolo.u5w2d2.services.PostService;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostsController {
    @Autowired
    private PostService postService;
    @GetMapping
    public List<Post> getPosts(){return postService.getPosts();}
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post savepost(@RequestBody Post body){return postService.save(body);}
}