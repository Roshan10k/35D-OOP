package Week10;

public class InterfaceClassTask {
    public static void main(String[] args) {
        spotify s = new spotify();
        s.download();
        s.play();
        s.pause();
        s.next();
        s.nowPlaying();
        System.out.println(s.size());
        System.out.println(s.remaining(20));

        AppleMusic a = new AppleMusic();
        a.download();
        a.play();
        a.pause();
        a.next();
        a.nowPlaying();
        System.out.println(a.size());
        System.out.println(a.remaining(20));
        
    }
    
}
/*
 * Task
 * Make an interface Media
 * make the following functions
 * void play()
 * void pause()
 * void next()
 * void previous()
 * String nowPlaying()
 * 
 * Make an interface DigitalMedia extending Media
 * make the following functions
 * double size()
 * double remaining(double current)
 * 
 * Make an interface OnlineAsset
 * make the following functions
 * void download()
 * 
 * Make a class Spotify and implement DigitalMedia and OnlineAsset
 * Make a class AppleMusic and implement DigitalMedia and OnlineAsset
 * Make one object of Spotify and one object of AppleMusic
 */ 

 interface Media{
    void play();
    void pause();
    void next();
    String nowPlaying();
 }

 interface DigitalMedia extends Media{
    double size();
    double remaining(double current);
 }

 interface onlineAsset{
    void download();
 }

 class spotify implements DigitalMedia, onlineAsset{
    @Override
    public double size(){
        return 23;
    }

    @Override
    public double remaining(double current){
        return 12;
    }

    @Override
    public void play(){
        System.out.println("Spotify play music");
    }

    @Override
    public void pause(){
        System.out.println("it also pause");
    }

    @Override
    public void next(){
        System.out.println("change the next song");
    }

    @Override
    public String nowPlaying(){
        return "Spotify";
    }

    @Override
    public void download(){
        System.out.println("Spotify downloading");
    }

 }

 class AppleMusic implements DigitalMedia, onlineAsset{
    @Override
    public double size(){
        return 50;
    }

    @Override
    public double remaining(double current){
        return 30;
    }

    @Override
    public void play(){
        System.out.println(" AppleMusic play music");
    }

    @Override
    public void pause(){
        System.out.println("AppleMusic also pause");
    }

    @Override
    public void next(){
        System.out.println(" AppleMusic change the next song");
    }

    @Override
    public String nowPlaying(){
        return "AppleMusic";
    }

    @Override
    public void download(){
        System.out.println("AppleMusic downloading");
    }

 }

