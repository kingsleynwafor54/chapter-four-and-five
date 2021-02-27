package chapterFour;

public class Mp3 {
    private boolean isOn;
    private int volume;

    public void Mp3(boolean isOn,int volume){
        this.isOn=isOn;
        this.volume=volume;


    }



    public boolean getOn() {
        return isOn;

    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setVolume(int volume) {
        if (volume>=0&&volume<=30)
        this.volume = volume;
    }

    public int getVolume() {
        return this.volume ;
    }
    public int pause(int volume) {
        if (volume == 0)
            this.volume = 0;
        return this.volume;
    }
    public int increaseVolume(int volume){
        this.volume=this.volume+1;
        return this.volume;
    }
        public int decreaseVolume(int volume){
        this.volume=this.volume-1;
                return this.volume;
        }


}


