package pierpaolo.u5w2d2.services;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import pierpaolo.u5w2d2.entities.Post;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class PostService {
    private List<Post> posts = new ArrayList<>();
    public List<Post> getPosts(){ return this.posts;}
    public Post save(Post body){
        Random rm = new Random();
        body.setId(rm.nextInt(1,100));
        this.posts.add(body);
        return body;
    }
}
