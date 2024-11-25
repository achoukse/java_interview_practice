package javaSorting;

public class Song implements Comparable<Song>{
    private String tittle;
    private String artist;
    private Integer year;

    public Song(String tittle, String artist, Integer year) {
        this.tittle = tittle;
        this.artist = artist;
        this.year = year;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Song{" +
                "tittle='" + tittle + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }



    @Override
    public int compareTo(Song o) {
        if(this.getYear()> o.getYear()){
            return +1;
        }
        if(this.getYear()< o.getYear()){
            return -1;
        }
        return 0;
    }
}
