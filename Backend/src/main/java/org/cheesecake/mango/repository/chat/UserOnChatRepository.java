package org.cheesecake.mango.repository.chat;

import org.cheesecake.mango.entity.chat.UserOnChat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserOnChatRepository extends JpaRepository<UserOnChat, Long> {
}
