public class MediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaPlayerAdapter(TipoMedia tipoMedia) {
        if (tipoMedia != TipoMedia.MP3) {
            this.advancedMediaPlayer = new VideoMediaPlayer();
        }
    }

    @Override
    public void reproduzir(TipoMedia tipo, String nomeArquivo) {
        if (tipo.equals(TipoMedia.MP4)) {
            this.advancedMediaPlayer.reproduzirMp4(nomeArquivo);
        }
        if (tipo.equals(TipoMedia.VLC)) {
            this.advancedMediaPlayer.reproduzirVlc(nomeArquivo);
        }
    }
}
