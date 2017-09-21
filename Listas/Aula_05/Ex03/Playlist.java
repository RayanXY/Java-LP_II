import java.util.ArrayList;

public class Playlist{

	private ArrayList<String> playlist;

	public Playlist(){
		playlist = new ArrayList<String>();
	}
	
	public void addFile(String file){
		playlist.add(file);
	}
	
	public void getNumberOfFiles(){
		playlist.size();
	}

	public void listFiles(){
		int sz = playlist.size();
		for(int i = 0; i < sz; i++){
			System.out.println(i + ": " + playlist.get(i));
		}
	}

	public void removeFile(int i){
		int sz = playlist.size();
		if(i < 0 || i > sz){
			System.out.println("Achou não");
		}else{
			System.out.println("Achou");
			playlist.remove(i);
		}
	}

	public void playFile(String file){
		SoundEngine engine = new SoundEngine();
		engine.playCompletely(file);
	}

	public void playAll(){
		SoundEngine player = new SoundEngine();
		int sz = playlist.size();
		for(int i = 0; i < sz; i++){
			player.playCompletely(playlist.get(i));
		}
	}

	public void removeFile(String file){
		int sz = playlist.size();
		for(int i = 0; i < sz; i++){
			String music = new String(playlist.get(i));
			if(music.indexOf(file) != -1){
				playlist.remove(i);
				break;
			}
		}
	}

}
