package org.cheesecake.mango.entity.message;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cheesecake.mango.entity.chat.Chat;
import org.cheesecake.mango.entity.user.User;

@Getter
@Setter
@Entity
@Table(name = "messages")
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String content;
}
