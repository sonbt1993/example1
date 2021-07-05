package com.example.example1.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "comment")
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;
    private LocalDateTime lastUpdate;
    @PrePersist //Trước khi lưu khi khởi tạo record
    public void prePersist() {
        lastUpdate = LocalDateTime.now();
    }
    @PreUpdate //Khi cập nhật record
    public void preUpdate() {
        lastUpdate = LocalDateTime.now();
    }

    public Comment(String content) {
        this.content = content;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private User commenter; //Mỗi comment phải do một commenter viết

    public void setCommenter(User user) {
        user.getComments().add(this);
        this.commenter = user;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post; //Mỗi comment phải gắn vào một post
}
