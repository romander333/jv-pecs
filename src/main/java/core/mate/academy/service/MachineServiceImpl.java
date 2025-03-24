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
        MachineProducer<? extends Machine> producer;
        if (type == Bulldozer.class) {
            producer = new BulldozerProducer();
        } else if (type == Excavator.class) {
            producer = new ExcavatorProducer();
        } else if (type == Truck.class) {
            producer = new TruckProducer();
        } else {
            return new ArrayList<>();
        }
        return (List<T>) producer.get();
    }

    @Override
    public void fill(List<? super T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends T> machines) {
        for (T machine : machines) {
            machine.doWork();
        }
    }
}
