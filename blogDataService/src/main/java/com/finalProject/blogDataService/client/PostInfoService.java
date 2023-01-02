package com.finalProject.blogDataService.client;

import com.finalProject.blogDataService.model.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("post-info-service")
public interface PostInfoService {

    //  ******************************************************  GET  ******************************************************

    @GetMapping("/api/posts")
    List<Post> getAllPosts();

    @GetMapping("/api/posts/{id}")
    Post getPostInfo(@PathVariable Integer id);
}
