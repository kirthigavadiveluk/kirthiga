package test;

public class CommandPattern {

	public static void main(String[] args) {
		SevaiMaiyam sevai = new SevaiMaiyam();
		sevai.executeCommand(1);

		Corporation corporation = new Corporation();
		Health health = new Health();
		Police police = new Police();

		Command deathCommand = new DeathCertificateCommand(corporation, health, police);

		sevai.setCommand(deathCommand, 1);

		sevai.executeCommand(1);
	}
}

interface Command {
	public void execute();
}

class SevaiMaiyam {
	Command[] command = new Command[5];

	public SevaiMaiyam() {
		for (int i = 0; i < command.length; i++) {
			command[i] = new DummyCommand();
		}
	}

	public void setCommand(Command command, int slot) {
		this.command[slot] = command;
	}

	public void executeCommand(int slot) {
		command[slot].execute();
	}
}

class DummyCommand implements Command {
	@Override
	public void execute() {
		System.out.println("I am dummy ...");
	}
}

final class Health {
	public void doPostMortem() {
		System.out.println("post mortem done...");
	}
}

final class Police {
	public void doInvestigation() {
		System.out.println("police investigation done...");
	}
}

final class Corporation {
	public void deathCertificate() {
		System.out.println("death certificate given...");
	}
}

class DeathCertificateCommand implements Command {
	Corporation corporation;
	Health health;
	Police police;

	public DeathCertificateCommand() {
		
	}

	public DeathCertificateCommand(Corporation corporation, Health health, Police police) {
		this.corporation = corporation;
		this.health = health;
		this.police = police;
	}

	@Override
	public void execute() {
		System.out.println("death certificate process ...");
		health.doPostMortem();
		police.doInvestigation();
		corporation.deathCertificate();
		System.out.println(" death certificate issued....");
	}

}