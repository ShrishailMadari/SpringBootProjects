package com.shyloostyle.dtodemo.repository;

import com.shyloostyle.dtodemo.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
