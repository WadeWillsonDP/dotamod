package mod_Dota2;

import java.util.Timer;
import java.util.TimerTask;

public class cd {
	public static int first = 0, second = 0, third = 0, fourth = 0, fifth = 0,
			sixth = 0, seventh = 0, eighth = 0, nineth = 0;
	static Timer timer = new Timer();
	static Task cd = new Task();

	private static class Task extends TimerTask {
		@Override
		public void run() {
			int time = first;
			if (time == 0) {
				first = 0;
				cd.cancel();
			} else {
				first--;
				Task cd = new Task();
				timer.schedule(cd, 1000);
			}
		}
	}

	public static void cooldown() {
		first=5;
		Task cd = new Task();
		timer.schedule(cd, 1000);
	}
}
