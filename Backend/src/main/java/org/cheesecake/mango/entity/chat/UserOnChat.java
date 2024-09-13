package org.cheesecake.mango.entity.chat;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.cheesecake.mango.entity.user.User;
import org.cheesecake.mango.enums.UserChatRole;

import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "users_on_chats")
public class UserOnChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    private Chat chat;

    @Column(nullable = false)
    private UserChatRole role;

    @Column(nullable = false)
    private Timestamp joinDate;
}
