package com.webank.weevent.broker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webank.weevent.broker.entiry.AccountTopicAuthEntity;

@Repository
public interface AccountTopicAuthRepository extends JpaRepository<AccountTopicAuthEntity, Long> {

	List<AccountTopicAuthEntity> findAllByUserNameAndDeleteAt(String userName, Long deleteAt);
	
	AccountTopicAuthEntity findAllByUserNameAndTopicNameAndDeleteAt(String userName, String topicName, Long deleteAt);
    
}
