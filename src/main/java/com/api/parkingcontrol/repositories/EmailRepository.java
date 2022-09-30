package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {


}
