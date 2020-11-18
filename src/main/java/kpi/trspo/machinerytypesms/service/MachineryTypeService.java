package kpi.trspo.machinerytypesms.service;

import javassist.NotFoundException;
import kpi.trspo.machinerytypesms.model.MachineryType;

import java.util.List;
import java.util.UUID;

public interface MachineryTypeService {
    List<MachineryType> getAll();
    MachineryType getById(UUID machineryTypeId) throws NotFoundException;
    MachineryType create(MachineryType machineryTypeObject);
    MachineryType update(UUID machineryTypeId, MachineryType machineryTypeDetails) throws NotFoundException;
    void delete(UUID machineryTypeId) throws NotFoundException;
}
