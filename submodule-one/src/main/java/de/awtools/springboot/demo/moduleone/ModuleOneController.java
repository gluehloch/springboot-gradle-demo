package de.awtools.springboot.demo.moduleone;

import de.awtools.springboot.moduleone.ModuleOneService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/module-one")
public class ModuleOneController {

    private final ModuleOneService moduleOneService = new ModuleOneService();

    @GetMapping("/name")
    public String getModuleName(@RequestParam(required = false) String name) {
        return moduleOneService.name() + " " + name;
    }
}
