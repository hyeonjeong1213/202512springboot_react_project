package com.webjjang.api.board.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name="board")
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long no;

    @Column(nullable = false, length = 300)
    private String title;

    @Column(nullable = false, length = 300)
    private String content;

    @Column(nullable = false, length = 30)
    private String writer;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime writeDate;

    @LastModifiedDate
    private LocalDateTime updatedDate;

    private Long hit=0L;

    @Column(nullable = false)
    private String pw;

}
