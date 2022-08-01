

public class Command3 {

	public static void main(String[] args) {
		UniversalRemote.useRemote();

	}

}
class UniversalRemote{
	public static void useRemote() {
		Tv tv=new Tv();
		SetTopBox setTopBox=new SetTopBox();
		Netflix netflix=new Netflix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, netflix, soundSystem);
		MotherOldMovieCommand momc=new MotherOldMovieCommand(tv, setTopBox, netflix, soundSystem);
		MotherSerialChannelCommand mscc=new MotherSerialChannelCommand(tv, setTopBox, netflix, soundSystem);
		
		Remote rm=new Remote();
		rm.executeCommand(1);
		rm.setCommand(mscc, 0);
		rm.setCommand(mscc, 1);
		rm.setCommand(fncc, 2);
		System.out.println("father enjoying with newss channel..");
		rm.executeCommand(2);
		
		
		
		
	}
}
class Tv{
	public void av1() {
		System.out.println(" av mode on....");
	}
	public void switchon() {
		System.out.println("Switched on....");
	}
}
class SetTopBox{
	public void newsChannel() {
		System.out.println(" news channel on...");
	}public void serialChannel() {
		System.out.println("Serial channel on...");
	}
	
}
class Netflix{
	public void oldmovie() {
		System.out.println("old movie...");
	}
}
class SoundSystem{
	public void lowsound() {
		System.out.println("volume decresed...");
	}
	
}
interface Command{
	public void execute();
}
class FatherNewsChannelCommand implements Command{
	Tv tv;
	SetTopBox setTopBox;
	Netflix netflix;
	SoundSystem soundSystem;
	public FatherNewsChannelCommand(Tv tv,SetTopBox setTopBox,Netflix netflix,SoundSystem soundSystem) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.netflix=netflix;
		this.soundSystem=soundSystem;
	
	}
	@Override
	public void execute() {
			System.out.println("father going to enjoy");
			tv.switchon();
			tv.av1();
			setTopBox.newsChannel();
			soundSystem.lowsound();
			System.out.println("father enjoying news channel..");
		
	}
}
class MotherOldMovieCommand implements Command{
	Tv tv;
	SetTopBox setTopBox;
	Netflix netflix;
	SoundSystem soundSystem;
	
	public MotherOldMovieCommand(Tv tv,SetTopBox setTopBox,Netflix netflix,SoundSystem soundSystem) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.netflix=netflix;
		this.soundSystem=soundSystem;
	
	}
	@Override
	public void execute() {
			System.out.println("mother going to enjoy");
			tv.switchon();
			tv.av1();
			netflix.oldmovie();
			System.out.println("mother enjoyedold moviesss..");
		
	}
}
class MotherSerialChannelCommand implements Command{
	Tv tv;
	SetTopBox setTopBox;
	Netflix netflix;
	SoundSystem soundSystem;
	public MotherSerialChannelCommand(Tv tv,SetTopBox setTopBox,Netflix netflix,SoundSystem soundSystem) {
		this.tv=tv;
		this.setTopBox=setTopBox;
		this.netflix=netflix;
		this.soundSystem=soundSystem;
	
	}
	@Override
	public void execute() {
			System.out.println("mother going to enjoy");
			tv.switchon();
			tv.av1();
			setTopBox.serialChannel();
			System.out.println("mother enjoyed..");
		
	}
}
	class DummyCommand implements Command{
		@Override
		public void execute() {
			System.out.println("i am dummy command...");
			
		}
	}
	class Remote{
		Command command[]=new Command[5];
		public Remote() {
			
				for(int i=0;i<command.length;i++) {
					command[i]=new DummyCommand();
				}
		}
		public void setCommand(Command command,int slot) {
					this.command[slot]=command;
				}
		public void executeCommand(int slot) {
			command[slot].execute();
		}
	
}