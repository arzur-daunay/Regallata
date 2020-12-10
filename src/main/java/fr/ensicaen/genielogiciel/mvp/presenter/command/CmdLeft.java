package fr.ensicaen.genielogiciel.mvp.presenter.command;

import fr.ensicaen.genielogiciel.mvp.model.Model;

public class CmdLeft extends Command {
    public CmdLeft(Model model) {
        super(model);
    }
    public CmdLeft(Model model, long time) {
        super(model, time);
    }

    @Override
    public void execute() {
        getModel().turnBoatLeft();
    }
}
