package kpi.trspo.machinerytypesms.repository;

import kpi.trspo.machinerytypesms.model.MachineryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MachineryTypeRepository extends JpaRepository<MachineryType, UUID> {
}
