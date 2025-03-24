package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class MachineServiceImpl<T extends Machine> implements MachineService<T> {
    @Override
    public List<T> getAll(Class<? extends T> type) {
        List<T> machines = new ArrayList<>();

        if (type == Bulldozer.class) {
            machines.add((T) new Bulldozer());
            machines.add((T) new Bulldozer());
        } else if (type == Excavator.class) {
            machines.add((T) new Excavator());
            machines.add((T) new Excavator());
        } else if (type == Truck.class) {
            machines.add((T) new Truck());
            machines.add((T) new Truck());
        }

        return machines;
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (Machine machine : machines) {
            machine.doWork();
        }
    }
}
