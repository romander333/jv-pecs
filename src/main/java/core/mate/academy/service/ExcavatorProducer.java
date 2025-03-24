package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator(6.0, 1.2, "Tracked"));
        excavators.add(new Excavator(5.5, 1.0, "Wheeled"));
        return excavators;
    }
}
