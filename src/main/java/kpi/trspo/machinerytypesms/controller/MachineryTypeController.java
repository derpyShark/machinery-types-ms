package kpi.trspo.machinerytypesms.controller;

import javassist.NotFoundException;
import kpi.trspo.machinerytypesms.model.MachineryType;
import kpi.trspo.machinerytypesms.service.MachineryTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/machineryTypes")
public class MachineryTypeController {
    private final MachineryTypeService machineryTypeService;

    @Autowired
    public MachineryTypeController(MachineryTypeService machineryTypeService){
        this.machineryTypeService = machineryTypeService;
    }

    @GetMapping
    public List<MachineryType> getMachineryType(){ return machineryTypeService.getAll();}

    @GetMapping(path = "{id}")
    public MachineryType getMachineryTypeById(@PathVariable("id") UUID id) throws NotFoundException
    {
        return machineryTypeService.getById(id);
    }

    @PostMapping
    public MachineryType addMachineryType(@RequestBody MachineryType addedMachineryType)
    {
        return machineryTypeService.create(addedMachineryType);
    }

    @PutMapping(path = "{id}")
    public void changeMachineryType(@PathVariable("id") UUID id, @RequestBody MachineryType machineryTypeDetails)
            throws NotFoundException
    {
        machineryTypeService.update(id, machineryTypeDetails);
    }

    @DeleteMapping(path = "{id}")
    public void deleteMachineryTypeById(@PathVariable("id") UUID id) throws NotFoundException
    {
        machineryTypeService.delete(id);
    }
}
